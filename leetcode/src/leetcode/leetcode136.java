package leetcode;

public class leetcode136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,4,3,2,1};
		int x=singleNumber(a);
		System.out.println(x);
		
	}
	 public static int singleNumber(int[] nums) {
		 /* int flag=0;
		  int temp=0;
		    for(int i=1;i<nums.length;i++){
		        if(nums[i]==nums[0]){
		            flag=1;
		            
		        }
		         }
		  
		  if(flag==1) {
			  for(int i=0;i<nums.length;i++)
				  for(int j=i+1;j<nums.length;j++){
					  if(nums[i]==nums[j]){
						  nums[i]=nums[0];
						  nums[j]=nums[0];
					  }
				  }
			  for(int i=0;i<nums.length;i++){
				  if(nums[i]!=nums[0]){
					temp=nums[i];
				  }
			  } 
			 }
		 else temp=nums[0];
		  return temp;
		  }*/
		 int flag=0;
	        for(int i=0;i<nums.length;i++){
	            flag=flag^nums[i];
	        }
	        return flag;
	 
	 }
}
