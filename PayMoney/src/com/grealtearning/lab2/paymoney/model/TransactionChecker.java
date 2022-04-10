package com.grealtearning.lab2.paymoney.model;

public class TransactionChecker {

	public int getTransactionsRequired(int target, int[] transactions) {
		int sumOfTransactions = 0;
		for (int j = 0; j < transactions.length; j++) {
			if (sumOfTransactions < target) {
				sumOfTransactions += transactions[j];
			} else {
				return j;
			}
		}
		return -1;
	}

}
