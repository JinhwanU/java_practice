package kr.ac.kopo.day04.practice;

public class Practice15 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j < 5) {
					if (j < (4 - i))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					if (j < (i + 5))
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
		    *    
		   ***   
		  *****  
		 ******* 
		*********
*/
