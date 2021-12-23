
public class Factorial {
	public static void main(String[] args) {
		int num = 6;
		
		System.out.println(factorial(num));
	}
	
	public static int factorial (int numero ){
		if (numero == 0 ){
			return 1;
		}
		else {
			return numero * factorial(numero - 1);
		}
	}
}
