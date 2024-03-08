package kr.ac.kopo.day04.practice;

public class Practice11 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i && i < 5)
					System.out.print("*");
				else if (j <= (8 - i) && i >= 5)
					System.out.print("*");
				else
					System.out.print(" ");
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
