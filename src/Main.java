public class Main {

	public static void main(String[] args) {
		
		new Test().test(()->{System.out.println("hahahha");});
		new Thread(()->{System.out.println("������������!"); }).start();
	}
}
 
