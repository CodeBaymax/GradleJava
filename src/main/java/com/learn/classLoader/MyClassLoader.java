package com.learn.classLoader;

import java.io.*;

public class MyClassLoader extends ClassLoader {

    private String codePath;

    public MyClassLoader(ClassLoader parent, String codePath) {
        super(parent);
        this.codePath = codePath;
    }

    public MyClassLoader(String codePath) {
        this.codePath = codePath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        BufferedInputStream bis = null;
        ByteArrayOutputStream bos = null;

        String file = codePath + name.replace(".", File.separator) + ".class";
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new ByteArrayOutputStream();

            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }

            bos.flush();

            bytes = bos.toByteArray();
            return defineClass(null, bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return super.findClass(name);
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            Class<?> clazz = findLoadedClass(name);
            if (clazz == null) {
                long tl = System.nanoTime();

                if (name.startsWith("com.susu.classLoader")) {
                    clazz = this.findClass(name);
                } else {
                    clazz = this.getParent().loadClass(name);
                }

//                sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(tl);
//                sun.misc.PerfCounter.getFindClasses().increment();
            }

            if (resolve) {
                resolveClass(clazz);
            }

            return clazz;
        }
    }
}
