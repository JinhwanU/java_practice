package kr.ac.kopo.day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain {
	public static void main(String[] args) {
		// 2024-03-25(월) 15:35:12
		
		String pattern="yyyy-MM-dd(E) HH:mm:ss";
		SimpleDateFormat s=new SimpleDateFormat(pattern);
		
		System.out.println(s.format(new Date()));
		
	}
}
