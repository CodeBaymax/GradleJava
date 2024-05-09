package com.learn.string;

public class StringSub {
    public static void main(String[] args) throws Exception {
        String str = "123的456的";

        System.out.println(str.getBytes().length);

        System.out.println(str.length());

        System.out.println(str.substring(1,2));

        System.out.println(str.substring(1,5));

        System.out.println(str.getBytes());

        System.out.println(bytesSub(str, 0, 7));

    }

    public static String bytesSub(String str, int start, int length) {
        byte[] strBytes = str.getBytes();

        byte[] destBytes = new byte[length];

        System.arraycopy(strBytes, start, destBytes, 0, length);
        System.out.println("=================================");

        return new String(destBytes);
    }
}
