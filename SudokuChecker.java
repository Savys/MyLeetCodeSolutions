package com.savitha.leetcode;
/*
 * https://leetcode.com/problems/valid-sudoku/ 36-Medium
 * Needs more work as incomplete sudoku is not handled yet as in "."
 * */
public class SudokuChecker {
	/***** Instance Variables *****/
	int[][] puzzle;
	boolean[] digits;

	/*
	 * Constructor sets the input to puzzle.
	 */

	public SudokuChecker(int[][] input) {
		puzzle = input;
	}

	private boolean completed() {

		return false;
	}

	public  boolean checkPuzzle() {
		for(int i=0;i<9 ;i++)
		{
			if(!checkRow(i))
			{
				return false;
			}
		}
 
		for(int i=0;i<9 ;i++)
		{
			if(!checkCol(i))
			{
				return false;
			}
		}
		for(int i=0;i<9;i+=3)
		{
			for(int j=0;j<9;j++)
			{
				if(!checkSquare(i,j))
				{
					return false;
				}
			}
		}
		return true;
	}
	/*Ensures       that a given square is legal
	 *@param row    the initial row of the square
	 *@param column the intial column of the square
	 *@return       true if legal, false otherwise.
	 */
	private boolean checkSquare(int row, int col) {
		resetCheck();
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				if(!digitCheck(puzzle[r+row][c+col]))
				return false;
			}
		}return  true;
		
	}

	private boolean checkCol(int c) {
		resetCheck();
		for(int r=0;r<9;r++)
		{
			if(!digitCheck(puzzle[r][c]))
			{
				return false;
			}
		}
		return true;
	}

	private boolean digitCheck(int n) {
		if(n!=0 && digits[n])
		{
			return false;
		}
		else
		{
			digits[n]=true;
			return true;
		}	
	}

	public boolean checkRow(int r) {
		resetCheck();
		for(int c=0;c<9;c++)
		{
			if(!digitCheck(puzzle[r][c]))
						{
				         return false;
						}
		}
		return true;
	}

	private void resetCheck() {
		digits=new boolean[10];		
	}

	public static void main(String[] args) {
		int[][] puzzle1 = { { 7,8,1,6,0,2,9,0,5 },
               { 9,0,2,7,1,0,0,0,0 },
               { 0,0,6,8,0,0,0,1,2 },
               { 2,0,0,3,0,0,8,5,1 },
               { 0,7,3,5,0,0,0,0,4 },
               { 0,0,8,0,0,9,3,6,0 },
               { 1,9,0,0,0,7,0,8,0 },
               { 8,6,7,0,0,3,4,0,9 },
               { 0,0,5,0,0,0,1,0,0 } };
                
		int[][] puzzle2 = { { 7,8,1,6,3,2,9,4,5 },
               { 9,5,2,7,1,4,6,3,8 },
               { 4,3,6,8,9,5,7,1,2 },
               { 2,4,9,3,7,6,8,5,1 },
               { 6,7,3,5,8,1,2,9,4 },
               { 5,1,8,4,2,9,3,6,7 },
               { 1,9,4,2,6,7,5,8,3 },
               { 8,6,7,1,5,3,4,2,9 },
               { 3,2,5,9,4,8,1,7,8 } };
		SudokuChecker sudoku = new SudokuChecker(puzzle1);
		if (sudoku.checkPuzzle()) {
			System.out.println("Valid");
		}
		if (sudoku.completed()) {
			System.out.println("Sudoku puzzle completed :)!");

		} else {
			System.out.println("Sudoku puzzle NOT completed :)!");
		}

	}

}
