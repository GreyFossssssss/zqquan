package leetcode;
//参考一个网上的思路，所有小的元素加1，实际就是将最大数减1，所以的返回值应该是
//sum(num)-min(num)*num.len
public class leetcode453 {
public int minMoves(int[] nums) {
	int maxnum=findmaxnum(nums);
	int sumnum=sumnum(nums);
	int minsum;
	int minsummove=0;
	for(int i=sumnum;;i=i+2){
		if(i%nums.length==0&&(i/nums.length)>=maxnum&&(i-sumnum)%2==0){
			minsum=i;
			break;
		}
	}
	minsummove=(minsum-sumnum)/2;
	
        return minsummove;
    }
public int findmaxnum(int[] nums){
	int maxnum=nums[0];
	for(int i=1;i<nums.length;i++){
		if(nums[i]>maxnum){
			maxnum=nums[i];
		}
		
	}
	return maxnum;
}
public int sumnum(int[] nums){
	int sumnumber=0;
	for (int i = 0; i < nums.length; i++) {
		sumnumber+=nums[i];
	}
	return sumnumber;
}

}
