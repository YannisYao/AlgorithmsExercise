package com.yannis.part1;

public class Date {
	int month;
	int day;
	int year;
	
	public Date(String date) {
		String[] fields = date.split("/");
		month = Integer.parseInt(fields[0]);
		day = Integer.parseInt(fields[1]);
		year = Integer.parseInt(fields[2]);
	}

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
	

	
}
