package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,1,2};
		int[] b={1,3,4,2};
		int[] res=nextGreaterElement(a,b);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] res=new int[findNums.length];
		List<Integer> list = new ArrayList<>();
		for (int i : nums) list.add(i);
       //�ҵ���ʼ���±��ǽ������Ĺؼ�
		//�������ҵ��±���ͨ��������װ����list������indexOf������
		for (int i = 0; i < findNums.length; i++) {
			int cur = findNums[i];
			res[i] = -1;
			for (int k = list.indexOf(cur); k < nums.length; k++) {
				if (nums[k] > cur){
					res[i] = nums[k];
					break;
				}
			}
		}	
        return res;
    }
}
