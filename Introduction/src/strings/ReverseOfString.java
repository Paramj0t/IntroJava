package strings;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String param = sc.nextLine();
//		String param = " sifhi sfuhs ";
	System.out.println(reverseString(param));
	}
	public static String reverseString(String s) {
	
	int i = s.length()-1;
	String ans = "";
	while(i>0) {
		while(i>0 && s.charAt(i)==' ')i--;
		
		int j=i;
		if(i<0)break;
		
		while (i>=0 && s.charAt(i)!=' ')i--;
		
		if(ans.isEmpty()) {
			ans=ans.concat(s.substring(i+1,j+1));
		}
			else {
				ans=ans.concat(" " + s.substring(i+1,j+1));
				
				
			}
		
		}
	
	return ans;
		
	}
	
	
}

