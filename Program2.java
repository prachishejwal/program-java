//2.Insert a String into another String in Java

package com.string.lowlevel;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string First string :");
		String str1 = sc.nextLine();
		System.out.println("Enter a string Second string :");
		String str2 = sc.nextLine();
		// 1
		// String concatenatedString = str1.concat(str2);
		// System.out.println("The concatenated string is : " + concatenatedString);

		// 2
		String arr1[] = str1.split(" ");
		String arr2[] = str2.split(" ");
		int count = 0;
		String concatedArray[] = new String[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			concatedArray[i] = arr1[i];
			count++;
		}
		for (int i = 0; i < arr2.length; i++) {
			concatedArray[count] = arr2[i];
		}

		System.out.println("Concated " + Arrays.toString(concatedArray));
		String resultString = String.join(" ", concatedArray);

		System.out.println("The concatenated string is: " + resultString);

	}

}
