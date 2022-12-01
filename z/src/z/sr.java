package z;

import java.util.Scanner;

public class sr {//xooxxo
	public static String StringChallenge(String str) {
		//String str="xoxxoo";
		int count1=0;
		int count =1;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
         if (str.charAt(i)==str.charAt(j)) {
        	 count++;
		}
         else {
        	 count1++;
        	        }
}
			break;
}
		if(count1==count) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		return str;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(StringChallenge(s.nextLine()));
		
}
}