package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService{

	@Override
	public List<String> getByLanguage(String langauage) {
		
		if(langauage.equals("English")) {
			return  new ArrayList<>(Arrays.asList("FF","THOR","End Game"));
		}else if(langauage.equals("Tamil")) {
			return  new ArrayList<>(Arrays.asList("Vikram","Dheena","Master"));
		}else if(langauage.equals("Kannada")) {
			return  new ArrayList<>(Arrays.asList("KGF2","KGF1","Ranna"));
		}else
		
	    return  new ArrayList<>(Arrays.asList("Saaho","Bahubali","RRR"));
	}

}
