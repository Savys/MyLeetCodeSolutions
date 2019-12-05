package com.savitha.leetcode;
/*
 * Write a method that takes:

an array of unsortedScores
the highestPossibleScore in the game
and returns a sorted array of scores in less than O(n\lg{n})O(nlgn) time.*
O(n) time and O(n)O(n) space
 The outer loop runs once for each unique number in the array. 
 The inner loop runs once for each time that number occurred.
 */

public class FastSortingAlgo_InC {

	public static void main(String[] args) {
		FastSortingAlgo_InC sortEngine = new FastSortingAlgo_InC();
		//int[] unsortedScores = { 37, 89, 41, 65, 91, 53 };
		//int[] unsortedScores = { 3, 8, 4, 6, 9, 2 };
		int[] unsortedScores = { 0,5,2,2,1 };
		final int HIGHEST_POSSIBLE_SCORE = 5;
		int[] sortedScores = sortEngine.sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
		for (int z : sortedScores) {
			System.out.println(z);
		}
	}

	public int[] sortScores(int[] unorderedScores, int highestPossibleScore) {
		int[] scoreCounts = new int[highestPossibleScore + 1];
		for (int score : unorderedScores) {
			scoreCounts[score]++;
		}
		int[] sortedScores = new int[unorderedScores.length];
		int currentSortedIndex = 0;
		for (int i = highestPossibleScore; i >= 0; i--) {
			int value = scoreCounts[i];
				System.out.println("value:" + value + " i :" +i);
				for (int occurrence = 0; occurrence < value; occurrence++) {
				sortedScores[currentSortedIndex] = i;
				currentSortedIndex++;
			}

		}
		return sortedScores;
	}
}
