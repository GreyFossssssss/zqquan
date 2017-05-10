package leetcode;

public class leetcode485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] str={1,1,1,0,1,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(str));
	}
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==1){
        		count++;
        		result=Math.max(count, result);
        	}
        	else
        		count=0;
        }
        return result;
    }
}
