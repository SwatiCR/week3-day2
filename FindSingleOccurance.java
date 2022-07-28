package week3.day2;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Map.Entry;;


public class FindSingleOccurance {

	public static void main(String[] args) {
		int[] nums = {1,2,1,3,2,5};
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
		}
		for (Entry <Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
