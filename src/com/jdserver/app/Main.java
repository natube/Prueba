package com.jdserver.app;

import java.io.InputStreamReader;
import java.net.URL;


import com.google.gson.Gson;

public class Main {
	
	public static void main(String[] args) {

		try {
			URL url = new URL("https://api.deezer.com/user/2529");
			InputStreamReader reader = new InputStreamReader(url.openStream(),"UTF-8");
			Deezer deezer = new Gson().fromJson(reader, Deezer.class);
			
			System.out.println(deezer.getId());
			System.out.println(deezer.getId());
			System.out.println(deezer.getNombre());
			//System.out.println(deezer.getLink());
			System.out.println(deezer.getPicture());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		



	}
	
	

}
