package leetcode;

import org.junit.Assert;

import org.junit.Test;

public class test {
/*	@Test
public void test1(){
	leetcode389 lt=new leetcode389();
	Assert.assertEquals("c", lt.findTheDifference("abcd","abccd"));
}*/
	@Test
	public void test2(){
		leetcode453 lt=new leetcode453();
		
		int[] b={1,3,5};
		System.out.println(lt.minMoves(b));
	}
	
}
