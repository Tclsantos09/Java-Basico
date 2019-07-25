package ex06_1_exercise;

public class ShoppingCart {

	public static void main(String[] args) {
		
		String custName = "Steve Smith";
		String firstName;
		int spaceIdx;
		StringBuilder sb;
		
		spaceIdx = custName.indexOf("  ");
		firstName = custName.substring(0, spaceIdx);
		System.out.println(firstName);

		sb = new StringBuilder(firstName);
		
		System.out.println(sb.append(custName.substring(spaceIdx)));
	}

}
