package sample;


class Test {
	void printTest() {
		try {
			System.out.println("Testクラスのメソッド");
		}catch (Exception e){
			System.out.println("エラー");
		}
	}
}

public class sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		test.printTest();
		System.out.println("mainメソッド");

	}

}
