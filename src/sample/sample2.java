package sample;

class Test2 extends Thread {
	public void run() {
		try {
			int i = 0;
			while (i < 10) {
				Thread.sleep(2000);
				System.out.println("Test2クラスのメソッド" + i + "回目");
				i++;
			}
		} catch (Exception e) {
			System.out.println("エラー");
		}
		System.out.println("Test2クラスのメソッド終了!!!!!");
	}
}

public class sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Test2 test2 = new Test2();
			test2.start();
			int i = 0;
			while (i < 10) {
				Thread.sleep(1000);
				System.out.println("mainメソッド" + i + "回目");
				i++;
			}
			test2.join();
		} catch (InterruptedException e) {
			System.out.println("mainのエラー");
		}
		System.out.println("mainメソッド終了!!!!!");
	}
}
