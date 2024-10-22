package day3Practice;

public class ReverseString {
public static void main(String[] args) {
	String s="Sri";
	String rev="";
	int lengthOfString=s.length();
	System.out.println(lengthOfString);
	for(int i=lengthOfString;i>=0;i--) {
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
}
}
