package leetcode;

public class leetcode476 {

	public static void main(String[] args) {
		// ����
		System.out.println(findComplement(5));
	}
	 public static int findComplement(int num) {
		 	/*~��λȡ�������Ǹ�λ��0Ҳ�ᱻȡ����1
		 	Integer.highestOneBit(i)������i�����λ������ȫ��0����
		 	eg��1010�򷵻�1000*/
	        return ~num&((Integer.highestOneBit(num)<<1)-1);
	    }
}
