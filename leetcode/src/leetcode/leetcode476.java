package leetcode;

public class leetcode476 {

	public static void main(String[] args) {
		// 测试
		System.out.println(findComplement(5));
	}
	 public static int findComplement(int num) {
		 	/*~按位取反，但是高位的0也会被取反成1
		 	Integer.highestOneBit(i)返回数i的最高位，其他全是0的数
		 	eg：1010则返回1000*/
	        return ~num&((Integer.highestOneBit(num)<<1)-1);
	    }
}
