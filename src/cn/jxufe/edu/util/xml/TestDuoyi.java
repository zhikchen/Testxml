package cn.jxufe.edu.util.xml;

import java.util.HashMap;

public class TestDuoyi {

	public static void main(String[] args) {
		System.out.println("hello word!");
		System.out.println(isTrue(19));
	}
	
	public static boolean isTrue(int n) {
		String num = n+"";
		int sum = 0;
		for(int i=0;i<num.length();i++) {
			sum+=Math.pow(Integer.parseInt(num.substring(i,i+1)), 2);
		}
		System.out.println(sum);
		if(sum<10) {
			return sum==1;
		}else {
			return isTrue(sum);
		}
	}
	
	
}
