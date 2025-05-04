package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;		
		
		resultNumber(sumNumber(a,b));
		resultNumber(differenceNumber(a,b));
		resultNumber(productNumber(a,b));
		resultNumber(quotientNumber(a,b));
	}
	
	public static int sumNumber(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	public static int differenceNumber(int a,int b) {
		int difference = a - b;
		
		return difference;
	}
	
	public static int productNumber(int a,int b) {
		int product = a * b;
		
		return product;
	}
	
	public static int quotientNumber(int a, int b) {
		int quotient = a / b;
		
		return quotient;
	}

	public static void resultNumber(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}
