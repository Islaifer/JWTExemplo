package com.poo.TesteJWT.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("testejwt".equals(username)) {
			return new User("testejwt", "$2a$10$VGyb/Z0CqqXLt4NivV./.eow4f2rd.b4gTUKMysvMEHwucPUq//Ny",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
