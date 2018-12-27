package cn.jxufe.edu.util.xml;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println((char)('a'+4));
	}
	
	public static String getString(String line) {
		StringBuffer str = new StringBuffer();
		//String start = line.substring(0, 1);
		char s = line.charAt(0);
		int count = 1;
		for(int i=1;i<line.length();i++) {
			if(s==line.charAt(i)) {
				count++;
				if(i==line.length()-1) {
					str.append(s);
					str.append(count);
				}
			}else {
				str.append(s);
				str.append(count);
				s = line.charAt(i);
				count = 1;
			}
		}
		
		return str.length()<line.length() ? str.toString() : line;
	}
	
	
	
}
