package com.greatLearning.floorConstruction.model;

import java.util.Collections;
import java.util.Stack;

public class SkyScraperConstruction {
	public static void findDailyConstruction(int[] floorSizeGiven, int totalFloor) {

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < floorSizeGiven.length; i++) {
			Boolean flag = true;
			System.out.println();
			System.out.print("Day " + (i + 1) + ": ");
			stack.push(floorSizeGiven[i]);
			Collections.sort(stack);

			while (flag) {
				if (totalFloor == stack.peek()) {
					System.out.print(stack.pop() + " ");
					totalFloor--;
					if (stack.isEmpty())
						flag = false;
				} else
					flag = false;
			}
		}
	}
}