package com.greatlearning.lab2.paymoney.service;

import java.util.Scanner;
import com.grealtearning.lab2.paymoney.model.TransactionChecker;

public class Driver {

	public static void main(String[] args) {
		int transactionArraySize = 0;
		int targetSize = 0;
		int transactionsRequiredToAchieveTarget = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array:");
		transactionArraySize = sc.nextInt();

		if(transactionArraySize<0)
		{
			System.err.println("Transaction Array size must be greater than zero");
			sc.close();
			return;
		}
		
		int[] transactions = new int[transactionArraySize];
		System.out.println("Enter the values of array:");
		for (int i = 0; i < transactionArraySize; i++) {
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved:");
		targetSize = sc.nextInt();
		
		TransactionChecker transactionChecker = new TransactionChecker();
		for (int i = 0; i < targetSize; i++) 
		{
			System.out.println("Enter the value of target " + (i + 1) + ":");
			int target = sc.nextInt();
			transactionsRequiredToAchieveTarget = transactionChecker.getTransactionsRequired(target, transactions);
			if (transactionsRequiredToAchieveTarget < 0) {
				System.out.println("Target cannot be acheived");
			} else {
				System.out.println("Target achieved after " + transactionsRequiredToAchieveTarget + " transactions");
			}
		}
		sc.close();
	}

}
