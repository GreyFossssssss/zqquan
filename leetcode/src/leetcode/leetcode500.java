package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class leetcode500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"hello","me","zqquan","adj","qwer"};
		System.out.println(strs.length);
		String[]  res=findWords(strs);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);	
		}
		
	}
	 public  static String[] findWords(String[] words) {
		 String[] strs={"qwertyuiop","asdfghjkl","zxcvbnm"};
		 Map<Character, Integer> map=new HashMap<Character, Integer>();
		 for(int i=0;i<strs.length;i++)
			 for(char c:strs[i].toCharArray()){
				 map.put(c, i);
			 }
		 List<String> res=new LinkedList<String>();
		 for(String w:words){
			 if(w.equals("")) continue;
			 int index=map.get(w.toLowerCase().charAt(0));
			 for(char c:w.toLowerCase().toCharArray()){
				 if(map.get(c)!=index)
				 {
					 index=-1;
					 break;
				 }
			 }
			 if(index!=-1)
			res.add(w);
		 }
		 return res.toArray(new String[0]);
			 
	 }
}
