package com.savitha.leetcode;

/*Transpose the array and reverse by row*/
public class RotateArray189LeetCode {

	public static void main(String[] args) {
	int original[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int transpose[][]=new int[3][3];
	int roated[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			transpose[i][j]=original[j][i];
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(original[i][j] +" ");
		}
		System.out.println();
	}
	
	System.out.println("Transpose:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(transpose[i][j] +" ");
		}
		System.out.println();
	}
	//Rotated Aray
	System.out.println("Rotated:");
	int n = transpose.length;
	for(int i=0;i<n;i++)
	{
		for(int j=2;j>=0;j--)
		{
			System.out.print(transpose[i][j] +" ");
		}
		System.out.println();
	}
	System.out.println("Rotated2 Easy Rotation:");
	//int n = transpose.length;
	for(int i=0;i<n;i++)
	{
		for(int j=2;j>=0;j--)
		{
			System.out.print(transpose[i][j] +" ");
		}
		System.out.println();
	}System.out.println("Rotated2 Actual Rotation:");
	//int n = transpose.length;
	for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int tmp = transpose[i][j];
        transpose[i][j] = transpose[i][n - j - 1];
        transpose[i][n - j - 1] = tmp;
      }
    }
	//Printing the above
	System.out.println("Rotated:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(transpose[i][j] +" ");
		}
		System.out.println();
	}
	
	
	}

}
