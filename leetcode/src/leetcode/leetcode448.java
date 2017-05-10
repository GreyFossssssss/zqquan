package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test={4,2,3,7,8,1,3,2};
		List<Integer> res=findDisappearedNumbers(test);
		for(int i=0;i<res.size();i++) System.out.println(res.get(i));
	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        int[] hashNums=new int[nums.length];
	        for(int i=0;i<nums.length;i++) hashNums[i]=0;
	        for(int i=0;i<nums.length;i++){
	        	hashNums[nums[i]-1]++;
	        }
	        List<Integer> list=new ArrayList<Integer>();
	        for(int i=0;i<hashNums.length;i++) {
	        	if(hashNums[i]==0) list.add(i+1);
	        }
	        return list;
	        //其他人的优秀解，就是不借助第三个数组，对出现的值为下标的值取负从而达到区分的目的
	        /*for(int i = 0; i < nums.length; i++) {
	            int val = Math.abs(nums[i]) - 1;
	            if(nums[val] > 0) {
	                nums[val] = -nums[val];
	            }
	        }
	        
	        for(int i = 0; i < nums.length; i++) {
	            if(nums[i] > 0) {
	                ret.add(i+1);
	            }
	        }
	        return ret;*/
 }
}
