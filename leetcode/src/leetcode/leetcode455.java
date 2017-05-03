package leetcode;

import java.util.Arrays;



public class leetcode455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={1,2,3};
		int[] a2={1,2};
		
		int a=findContentChildren(a1,a2);
		System.out.println(a);

	}
	
	 public static int findContentChildren(int[] g, int[] s) {
		
		 Arrays.sort(g);
	        Arrays.sort(s);
	         int output=0;
			   int p=0;
			   for(int i=0;i<g.length;i++){
				  while(p<s.length&&g[i]>s[p])
				  {
					  p++;
				  }
				  if(p==s.length)
					  break;
				  p++;
				  output++;
			   }
			
				 
				
		      return output;  
	   
	 }
	

}
