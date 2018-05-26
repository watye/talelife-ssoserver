package com.talelife.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncodeUtil {
	
	private EncodeUtil() {
	    throw new IllegalAccessError("not permit instance");
	}

	
	public static String encoderByMd5(String str){
        MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
        md5.update(str.getBytes());  
        return new BigInteger(1, md5.digest()).toString(16);  
    }

}
