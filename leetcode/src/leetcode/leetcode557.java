package leetcode;

public class leetcode557 {
	//Reverse Words in a String
	public static void main(String[] args) {
		//Ω¯––≤‚ ‘
		System.out.println(reverseWords("hello zqquan"));

	}
    public static String reverseWords(String s) {
       char[] ca=s.toCharArray();
       for(int i=0;i<ca.length;i++){
    	   if(ca[i]!= ' ')
    	   {
    		   int j=i;
    		   while(j+1<ca.length&&ca[j+1]!=' '){j++;}
    			   reverse(ca,i,j);
    			   i=j;
    		   }
   }
        return new String(ca);
    }
    public static void reverse(char[] ca,int i,int j){
    	for(;i<j;i++,j--)
    	{
    		char temp=ca[i];
    		ca[i]=ca[j];
    		ca[j]=temp;
    	}
    }
}
