package com.intuit.ers.siebeluaa;

import java.util.HashMap;
import java.util.Map;

public class FindPairsToGetSum {

	/**
	 * Checking whether (target-indexValue) present in the map 
	 * If NOT exists, adding indexValue as key and index as value in map.
	 * if exists, map.get(target-indexValue) and indexValue will be the pair(printing it)
	 * 
	 * @param nums
	 * @param target
	 */

	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		findPair(nums, target);
	}

	public static void findPair(int[] nums, int target) {
		// create an empty HashMap
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < nums.length; i++) {
			// check if pair (nums[i], target-nums[i]) exists

			// if the difference is seen before, print the pair
			if (map.containsKey(target - nums[i])) {
				System.out.println(String.format("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]));
			}

			// store index of the current element in the map
			map.put(nums[i], i);
		}

		// we reach here if the pair is not found
		System.out.println("Pair not found");
	}
}
