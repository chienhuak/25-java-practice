public class App1 {
	public static void main(String[] args) {

		// 變數由大到小轉換會失真，因此須"強制轉換" 用中括號()
		// double >> float >> long >> int >> short >> byte

		double double1 = 3.14159265;
		System.out.println(double1);
		float float1 = (float)double1; //由大轉到小
		System.out.println(float1);
	}

}
