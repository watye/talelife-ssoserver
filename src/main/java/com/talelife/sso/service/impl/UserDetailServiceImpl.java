package com.talelife.sso.service.impl;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.client.test.OAuth2ContextConfiguration;
import org.springframework.stereotype.Service;

import com.talelife.sso.model.User;
import com.talelife.sso.model.UserDetailsImpl;
import com.talelife.sso.service.UserService;
@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Resource private UserService userService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.findByUsername(username);
		if(user != null){
			UserDetailsImpl userDetails = new UserDetailsImpl();
			userDetails.setUser(user);
			return userDetails;
		}
		
		return null;
	}

}
