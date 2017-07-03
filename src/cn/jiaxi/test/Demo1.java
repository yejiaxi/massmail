package cn.jiaxi.test;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {5,12,0,23,56,21};
		System.out.println(arrayPairSum(arr));
	}
	

	public static int arrayPairSum(int[] nums) {
		int temp = 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length; i++){
			if(i%2 == 0){
				temp += nums[i];
			}
		}
		
		return temp;
    }
	
}
