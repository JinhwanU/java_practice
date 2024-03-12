package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain04 {
	public static void main(String[] args) {

//		int[] arr = new int[] { 10, 20, 30, 40, 50 };
//		int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++)
			arr[i] = (i + 1) * 10;

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");
		System.out.println();

		arr = new int[] { 8, 7, 6, 5, 4, 3, 2, 1 };

		/*
		 * 배열의 모든 원소를 출력하는 방식 
		 * 1.index 이용한 출력 
		 * 2.for-which문(향상된 for문)을 이용한 출력 
		 * 3.Arrays.toString() 메소드를 이용한 출력
		 */
		System.out.println("< index를 이용한 출력 >");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");
		System.out.println();

		System.out.println("< for-which문(향상된 for문)을 이용한 출력 >");
		for (int data : arr)
			System.out.println(data + " ");
		System.out.println();

		System.out.println("< Arrays.toString() 메소드를 이용한 출력 >");
		System.out.println(Arrays.toString(arr));
	}
}
