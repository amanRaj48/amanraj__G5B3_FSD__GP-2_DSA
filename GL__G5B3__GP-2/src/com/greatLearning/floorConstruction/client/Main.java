package com.greatLearning.floorConstruction.client;

import com.greatLearning.floorConstruction.model.SkyScraperConstruction;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the total number of floors in the building: ");
		int totalFloor = input.nextInt();

		int[] floorSizeGiven = new int[totalFloor];
		for (int i = 0; i < totalFloor; i++) {
			System.out.print("Enter the floor size given on day " + (i + 1) + ": ");
			floorSizeGiven[i] = input.nextInt();
		}
		SkyScraperConstruction.findDailyConstruction(floorSizeGiven, totalFloor);
		input.close();
	}
}