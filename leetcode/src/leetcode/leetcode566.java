package leetcode;

public class leetcode566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]nums=new int[2][2];
		nums[0][0]=1;
		nums[0][1]=2;
		nums[1][0]=3;
		nums[1][1]=4;
		//System.out.println(matrixReshape(nums,1,4));
	}
	 public static int[][] matrixReshape(int[][] nums, int r, int c) {
	        int n=nums.length;//得到行的数量
	        int m=nums[0].length;//得到列的数量
	        if(n*m!=r*c) return nums;
	        int [][]res=new int[r][c];
	        for(int i=0;i<r*c;i++){
	        	res[i/c][i%c]=nums[i/m][i%m];
	        }
	        return res;
	    }
}
