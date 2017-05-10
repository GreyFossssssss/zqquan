package leetcode;

public class leetcode520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("FalS"));
	}
   public static boolean detectCapitalUse(String word) {
	   
	   //优秀解：正则表达式  return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
	   /* 和我的解思路相同    return word.equals(word.toUpperCase()) || 
        word.equals(word.toLowerCase()) ||
       Character.isUpperCase(word.charAt(0)) && 
       word.substring(1).equals(word.substring(1).toLowerCase());*/
	    int flag=0;
        String word1=word.toLowerCase();
        String word2=word.toUpperCase();
        char[] str=word.toCharArray();
        if(word1==word||word==word2) flag=1;
        else if(str[0]<='Z'&&str[0]>='A'){
        	flag=1;
        	for(int i=1;i<str.length;i++){
        		if(str[i]<='Z'&&str[i]>='A') 
        		{
        			flag=0;
        			break;
        		}
        	}
        	}
        if(flag==1) return true;
    	else return false;
    }
}
