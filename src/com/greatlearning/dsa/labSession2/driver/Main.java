package com.greatlearning.dsa.labSession2.driver;

import java.util.Scanner;

import com.greatlearning.dsa.labSession2.service.MergeSortImplementation;
import com.greatlearning.dsa.labSession2.service.NotesCount;

public class Main {
	public static void main(String[] args) {
		MergeSortImplementation merSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		System.out.println("Enter the size of currency denominations");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			System.out.println();
			int[] notes = new int[size];
			System.out.println("Enter the currency denominations value");
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			System.out.println();
			System.out.println("Enter the amount you want to pay");
			int amount = sc.nextInt();
			merSortImplementation.sort(notes, 0, notes.length - 1);
			System.out.println();
			notesCount.noteCountImplementation(notes, amount);
		}
	}
}
