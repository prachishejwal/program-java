//1.Java String Program to Print even length words

package com.string.lowlevel;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// 0.Accept the string from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : ");
		String str = sc.nextLine();
		// 1.use split method to split the string and now convert it to string array
		String modifiedArray[] = str.split(" ");
		System.out.println("Modified array is : " + Arrays.toString(modifiedArray));
		System.out.println("Even length words are : ");
		// 2 .Add a condition to find even word
		for (int i = 0; i < modifiedArray.length; i++) {
			if ((modifiedArray[i].length() % 2) == 0) {
				System.out.println(i + " : " + modifiedArray[i]);
			}
		}
	}

}
