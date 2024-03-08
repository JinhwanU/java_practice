package kr.ac.kopo.day04.practice;

public class Practice14 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i < 5) {
					if (i < j)
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					if (j > (8 - i))
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
/*
		    *
		   **
		  ***
		 ****
		*****
		 ****
		  ***
		   **
		    *
 
*/