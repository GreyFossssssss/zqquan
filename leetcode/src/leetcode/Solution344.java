package leetcode;

public class Solution344 {
	public static String reverseString(String s){
		char[] s1=s.toCharArray();
		for (int i = 0; i < (s1.length+1)/2; i++) {
			char temp=s1[i];
			s1[i]=s1[s1.length-i-1];
			s1[s1.length-i-1]=temp;
			
		}
		
		 String s2=String.valueOf(s1);
		 return s2;
		
	}
	  public static void main(String[] args){
		  String a="hello";
		  System.out.println(a);
		  String b=reverseString(a);
		 
		  System.out.println(b);
	  }

}
