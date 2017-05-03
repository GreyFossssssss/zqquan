package leetcode;

import java.util.Arrays;

public class leetcode561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,4,5,6};
		System.out.println(arrayPairSum(a));
	}
	public static int arrayPairSum(int[] nums){
		int result=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i+=2){
			result=result+nums[i];
		}
		return result;
	}
}
