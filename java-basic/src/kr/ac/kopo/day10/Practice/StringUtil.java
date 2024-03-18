package kr.ac.kopo.day10.Practice;

import java.util.Scanner;

public class StringUtil {
	Scanner sc = new Scanner(System.in);

	boolean isUpperChar(char c) {
		if (c >= 'A' && c <= 'Z')
			return true;
		return false;
	}

	boolean isLowerChar(char c) {
		if (c >= 'a' && c <= 'z')
			return true;
		return false;
	}

	int max(int i, int j) {
		if (i > j)
			return i;
		return j;
	}

	int min(int i, int j) {
		if (i < j)
			return i;
		return j;
	}

	String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reversed += str.charAt(i);
		return reversed;
	}

	String toUpperString(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				result += (char) (str.charAt(i) - 32);
			else
				result += (char) str.charAt(i);
		}
		return result;
	}

	String toLowerString(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				result += (char) (str.charAt(i) + 32);
			else
				result += (char) str.charAt(i);
		}
		return result;
	}

	int checkChar(String strData, char ch) {
		int cnt = 0;
		for (int i = 0; i < strData.length(); i++)
			if (strData.charAt(i) == ch)
				cnt++;
		return cnt;
	}

	String removeChar(String oriStr, char delChar) {
		String result = "";
		for (int i = 0; i < oriStr.length(); i++)
			if (oriStr.charAt(i) != delChar)
				result += oriStr.charAt(i);
		return result;
	}
}
