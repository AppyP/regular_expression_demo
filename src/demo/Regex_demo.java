package demo;

import java.util.ArrayList;
import java.util.List;

public class Regex_demo {
	public static void main(String[] args) {
		String fileName = "10august09";
		
		String[] months = {"january","february","march","april","may","june","july","august","september","october","november","december"};
		/*correct4*/
		//		String regex4 = "([1-9][a-zA-Z]{3,}[0-9]{2})|([1-9][a-zA-Z]{3,}20[0-9]{2})|([0-3][0-9][a-zA-Z]{3,}[0-9]{2})|([0-3][0-9][a-zA-Z]{3,}20[0-9]{2})";//|([1-9][Aa]ug20[0-9]{2})|([0-3][0-9][Aa]ug[0-9]{2})|([0-3][0-9][Aa]ug20[0-9]{2})";
		/*-------*/
		String regex4 = "([1-9][^a-zA-Z0-9]{0,1}[a-zA-Z]{3,}[^a-zA-Z0-9]{0,1}[0-9]{2})|([1-9][^a-zA-Z0-9]{0,1}[a-zA-Z]{3,}[^a-zA-Z0-9]{0,1}20[0-9]{2})|([0-3][0-9][^a-zA-Z0-9]{0,1}[a-zA-Z]{3,}[^a-zA-Z0-9]{0,1}[0-9]{2})|([0-3][0-9][^a-zA-Z0-9]{0,1}[a-zA-Z]{3,}[^a-zA-Z0-9]{0,1}20[0-9]{2})";
		
		String found = "False";

		System.out.println(fileName.matches(regex4));
		String[] splitString = fileName.split(regex4);
		String[] splittedString = null;
		for(String s : splitString)
			System.out.println("Splitted String : "+s);
		if(fileName.matches(regex4) == true) {
			if((((fileName.substring(0,1)).equalsIgnoreCase("0") && (fileName.substring(1,2)).equalsIgnoreCase("0"))) || (fileName.substring(0,2)).equalsIgnoreCase("00")) {
				System.out.println("Not found");
			}
			else {
				
				splittedString = fileName.split("(^[0-9]{0,}[^a-zA-Z0-9])|(^[0-9][0-9]{0,})|(^[0-9][0-9]{0,}[^a-zA-Z0-9])|(^[0-9]{0,})");
				System.out.println("new Splitted string 1 : "+splittedString[1]);
				
				
					System.out.println("new splitted string : "+splittedString[1]);
					
				

					System.out.println(splittedString[1].substring(0, 3));
				for(int j = 0 ; j < 12 ; j++) {
					if(splittedString[1].substring(0, 3).equalsIgnoreCase(months[j].substring(0, 3))) {

						found = "True";
						break;
					}
				}
			}
			}


			if(found.equalsIgnoreCase("true"))
				System.out.println("Found");
			else
				System.out.println("Not found");
					}
	}

