package Controleur;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	private static SimpleDateFormat df = new SimpleDateFormat("yyyy- MMMM- dd ");
	public static void main(String[] args) {
	
		  Date oneDate = new Date(new java.util.Date().getTime());
	        System.out.println(df.format(oneDate));
}}

