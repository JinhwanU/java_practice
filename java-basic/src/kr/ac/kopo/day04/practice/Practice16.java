package kr.ac.kopo.day04.practice;

public class Practice16 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j < 5) {
					if (j < i)
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					if (j <= 8 - i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
/*
		  *********  
		   *******
		    *****
		     ***
		      *
*/