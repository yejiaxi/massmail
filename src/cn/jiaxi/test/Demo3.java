package cn.jiaxi.test;

/**
 * 
 * @author yejx119334
 * ��������Ϊ0������ȫ���Ƶ�����ĩβ�������������ֵ����˳�򲻱�
 */
public class Demo3 {
	public static void main(String[] args) {
		int[] nums ={0,0,1};
		
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	 public static void moveZeroes(int[] nums) {
		 for(int i=0; i<nums.length-1; i++){
			 if(nums[i] == 0){
				//��0�����ƶ�
				for (int j = i+1; j < nums.length; j++) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
				i--;
			 }
		 }
	 }
	 
	 
}
