package com.greatlearning.dsa.labSession2.Transaction;

class TransactionService {
	public void transactionService(long target, int[] arr) {

		int flag = 0;
		int size = arr.length;
		int transactionSum = 0;
		int i = 0;
		while (transactionSum <= target && i < size) {
			transactionSum = transactionSum + arr[i];
			i++;
		}
		if (transactionSum >= target) {
			System.out.println("Target is achieved after " + i + " transactions");
			flag = 1;
		}

		if (flag == 0) {
			System.out.println("Given traget is not achieved");
		}

	}
}
