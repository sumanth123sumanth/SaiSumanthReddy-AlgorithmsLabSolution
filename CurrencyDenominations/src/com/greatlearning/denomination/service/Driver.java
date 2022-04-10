package com.greatlearning.denomination.service;

import java.util.Scanner;

import com.greatlearning.denominations.model.DenominationCounter;
import com.greatlearning.denominations.model.MergeSort;

public class Driver {

	public static void main(String[] args) {
		
		int denomiationsArrSize = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations:");
		denomiationsArrSize = sc.nextInt();
		
		int[] denominations = new int[denomiationsArrSize];// Array to store available denominations
		int[] denominationsCount = new int[denomiationsArrSize];// Array to store count of each denomination required to
																// pay the amount

		System.out.println("Enter the currency denominations value:");
		for (int i = 0; i < denomiationsArrSize; i++) {
			denominations[i] = sc.nextInt();
		}

		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(denominations, 0, denominations.length - 1);

		System.out.println("Enter the amount to pay:");
		int amountToPay = sc.nextInt();

		DenominationCounter denominationCounter = new DenominationCounter();
		int amountRemaining = denominationCounter.getDenominationCount(denominations, amountToPay, denominationsCount);

		if (amountRemaining == 0) {
			System.out.println("Your payment approach in order to give min no of notes will be:");
			for (int i = 0; i < denominations.length; i++) {
				if (denominationsCount[i] > 0) {
					System.out.println(denominations[i] + ":" + denominationsCount[i]);
				}
			}
		} else {
			System.out.println("Exact Amount cannot be paid using available denominations");
		}
		sc.close();
	}

}
