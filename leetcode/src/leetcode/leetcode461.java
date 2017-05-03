package leetcode;

public class leetcode461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(1, 4));
	}
   public static int hammingDistance(int x, int y) {
	 /*  Integer.toBinaryString(x);
	   Integer.toBinaryString(y);*/
	   int sum=x^y;
	   Integer.toBinaryString(sum);
	   int count=0;
	   while(sum!=0){
		   count++;
		   sum=sum&(sum-1);
	   }
        return count;
    }
}
