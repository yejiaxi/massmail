package cn.jiaxi.test;

/**
 * 
 * @author yejx119334
 * 把数组中为0的数字全部移到数组末尾，其余非零的数字的相对顺序不变
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
				//把0往后移动
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
