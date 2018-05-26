package com.talelife.util;

import org.springframework.security.crypto.password.PasswordEncoder;

public class SysPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		return EncodeUtil.encoderByMd5(rawPassword.toString());
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		return encodedPassword.equals(EncodeUtil.encoderByMd5(rawPassword.toString()));
		
	}

}
