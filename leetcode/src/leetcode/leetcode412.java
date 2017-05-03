package leetcode;

import java.util.ArrayList;
import java.util.List;



public class leetcode412 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l=fizzBuzz(15);
		System.out.println(l);
	}
   public static List<String> fizzBuzz(int n) {
	   List<String> l=new ArrayList<String>();
	   for (int i = 1; i <=n; i++) {
		if(i%3==0){
			if(i%5==0){
				l.add("FizzBuzz");
			}
			else{
				l.add("Fizz");
			}
		}else if(i%5==0){
			l.add("Buzz");
		}
		else {
			
			
			l.add(String.valueOf(i));
		}
		
	}
        return l;
    }

}
