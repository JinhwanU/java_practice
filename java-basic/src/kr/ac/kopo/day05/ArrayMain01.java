package kr.ac.kopo.day05;

import java.util.Scanner;

public class ArrayMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "\'s num : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("< PRINT >");

//		System.out.println(Arrays.toString(arr));
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
}
