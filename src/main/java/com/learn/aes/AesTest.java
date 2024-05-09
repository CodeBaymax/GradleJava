package com.learn.aes;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;

public class AesTest {
    public static void main(String[] args) throws Exception {
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(128);
        SecretKey key = generator.generateKey();

        System.out.println(key);
        System.out.println("=====================================");
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");
        System.out.println(keySpec);
        System.out.println(keySpec.getEncoded());
        System.out.println(new BigInteger(1, key.getEncoded()).toString(16));
        System.out.println(new BigInteger(1, keySpec.getEncoded()).toString(16));
    }
}
