//This was created by Caleb Miller and is his own work
package application;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://raw.githubusercontent.com/spudgi/CST-135_Assignments/master/Week_6/flipFlapFlop.in"); 
		Scanner fileReader = new Scanner(new InputStreamReader(url.openStream()));
		int sn = 4;
		
		String line;
		for(int x = 0; x < sn; x++) {
			line = fileReader.nextLine();
			//**Stephan taught me what and how to use printf**//
			System.out.printf("%-20s %-20s\n", line, isFlop(line));
		}
		fileReader.close();
	}
	
	public static boolean isFlip(String str) {
		if(str.length() < 2) {
			return false;
		}
		if(str.charAt(0) != 'A') {
			return false;
		}
		if(str.charAt(1) == 'H') {
			return true;
		}
		if(isFlap(str.substring(1)) || str.charAt(1) == 'B' && isFlip(str.substring(2))) {
			int index = 3;
			while(index != str.length() && str.charAt(index) != 'C') {
				index++;
			}
			if(index != str.length() && str.charAt(index) == 'C') {
				return true;
			}
		}
		return false;
	}
//from the video provided by Lydia Fritz
	public static boolean isFlap(String str) {
		if(str.length() < 3) {
			return false;
		}
		if(str.charAt(0) != 'D' && str.charAt(0) != 'E' || str.charAt(1) != 'F') {
			return false;
		}
		
		int index = 2;
		while(index < str.length() && str.charAt(index) == 'F') {
			index++;
		}
		if(index != str.length() && str.charAt(index) == 'G') {
			return true;
		}
		if(isFlap(str.substring(index))) {
			return true;
		}
		return false;
	}
	
	public static boolean isFlop(String str) {
		if(isFlip(str)) {
			int index = 2;
			while(index < str.length() && str.charAt(index) != 'D' && str.charAt(index) != 'E') {
				index++;
			}
			if(isFlap(str.substring(index))) {
				return true;
			}
			return false;
		}
	return false;
	}
}
