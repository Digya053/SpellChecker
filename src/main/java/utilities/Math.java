package utilities;

import java.util.List;

public class Math {

	public static int min(int...nums){
		int min = nums[0];
		for(int i=1; i<nums.length;i++){
			if(min>nums[i]){
				min=nums[i];
			}
		}

		return min;
	}

	public static int max(int...nums){
		int max = nums[0];
		for (int i=1; i<nums.length;i++){
			if(max<nums[i]){
				max=nums[i];

			}
		}

		return max;
	}
}
