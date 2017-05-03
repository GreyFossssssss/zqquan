package leetcode;

import java.util.Arrays;



public class leetcode389 {
public  char findTheDifference(String s, String t) {
		 /*char[] s1=s.toCharArray();
		 char[] s2=s.toCharArray();
		 Arrays.sort(s1);
		 Arrays.sort(s2);
		 int i=0;
		 while(s1[i]==s2[i]&&i<s1.length){
			 i++;
		 }
	      return s2[i];  
	    }*/
	char tmp = 0x00;  
    for(int i=0;i<s.length();i++)  
        tmp =(char)( tmp ^ s.charAt(i));  
    for(int i=0;i<t.length();i++)  
        tmp = (char)(tmp ^ t.charAt(i));  
    return tmp;  
}

}
