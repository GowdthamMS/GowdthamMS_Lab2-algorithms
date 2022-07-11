package com.greatlearning.dsa.labSession2.Transaction;

import java.util.Scanner;

public class TansactionMain {

	public static void main(String args[]) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction array");
			int size = s.nextInt();
			int arr[] = new int[size];

			System.out.println("Enter the values of array");
			for (int i = 0; i < size; i++)
				arr[i] = s.nextInt();
			System.out.println("Enter the total no of targets that needs to be achieved");
			int noOfTarget = s.nextInt();
			while (noOfTarget-- != 0) {
				System.out.println("Enter the value of target");
				int target = s.nextInt();
				TransactionService trans = new TransactionService();
				trans.transactionService(target, arr);
				System.out.println();
			}
		}
	}
}