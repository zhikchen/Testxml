package cn.jxufe.edu.util.xml;

import java.util.Scanner;

public class Test3 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int[] result = getResult(line);
		for(int i=0;i<26;i++) {
			char s = (char) ('A'+ i);
			System.out.println(s+" "+result[i]);
		}
	}
	
	
	public static int[] getResult(String line) {
		int[] list = new int[26];
		for(int i=0;i<line.length();i++) {
			list[line.charAt(i)-'A']++;
		}
		return list;
	}
}
