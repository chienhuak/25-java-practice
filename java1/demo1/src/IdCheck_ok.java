import java.util.Scanner;
import java.util.HashMap;

public class IdCheck_ok {
	

	public static void main(String[] args) {

		HashMap<String, Integer> locationCode = new HashMap<>();
		locationCode.put("A", 10);locationCode.put("N", 22);
		locationCode.put("B", 11);locationCode.put("O", 35);
		locationCode.put("C", 12);locationCode.put("P", 23);
		locationCode.put("D", 13);locationCode.put("Q", 24);
		locationCode.put("E", 14);locationCode.put("R", 25);
		locationCode.put("F", 15);locationCode.put("S", 26);
		locationCode.put("G", 16);locationCode.put("T", 27);
		locationCode.put("H", 17);locationCode.put("U", 28);
		locationCode.put("I", 34);locationCode.put("V", 29);
		locationCode.put("J", 18);locationCode.put("W", 32);
		locationCode.put("K", 19);locationCode.put("X", 30);
		locationCode.put("M", 21);locationCode.put("Y", 31);
		locationCode.put("Z", 33);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身分證字號：");
		String myId =scn.nextLine();   
		scn.close();
		
		if (myId == null || !myId.matches("^[A-Z][12]\\d{8}$")) {
			System.out.println("格式不正確。");
			return;
		}

		int xSum = locationCode.get(String.valueOf(myId.charAt(0)))/10*1 + locationCode.get(String.valueOf(myId.charAt(0)))%10*9 + Character.getNumericValue(myId.charAt(1))*8+ Character.getNumericValue(myId.charAt(2))*7+ Character.getNumericValue(myId.charAt(3))*6+ Character.getNumericValue(myId.charAt(4))*5+ Character.getNumericValue(myId.charAt(5))*4+ Character.getNumericValue(myId.charAt(6))*3+ Character.getNumericValue(myId.charAt(7))*2+ Character.getNumericValue(myId.charAt(8))*1;
		
		if ( (10-xSum%10) == Character.getNumericValue(myId.charAt(9)) ) {
			System.out.println("這是正確的身分證號碼。");
		}
		else {
			System.out.println("這不是身分證號碼。");
		}
	}
	

}
