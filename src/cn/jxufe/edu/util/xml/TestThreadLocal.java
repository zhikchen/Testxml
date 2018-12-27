package cn.jxufe.edu.util.xml;

public class TestThreadLocal {
	
	public static void main(String[] args) {
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					new Test().output("-------------");
				}
			}
		});
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					new Test().output("######################");
				}
			}
		});
		
	}
}


class Test{
	
	
	public void output(String name) {
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println("");
	}
}