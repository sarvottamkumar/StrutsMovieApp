package com.movieapp.service;

import java.util.stream.Stream;

public class LoginServiceImpl implements ILoginService{
	String[] usernames= {"John","Sri","Priya","Rahul","Joe","Sarva"};
	@Override
	public boolean validateUsername(String username,String password) {
		
//		for(String names : usernames) {
		
//		if(names.equals(username) && password.equals("sarvavlogs"))
//			return true;
//		}
//		return false;
	    
			return Stream.of(usernames)
					.filter(str -> str.equals(username) && password.equals("sarva123"))
					.findAny()
					.isPresent();
	}

}
