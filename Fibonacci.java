

public class Fibonacci {

	public static void main(String[] args) {
	    int limiteSequece = 4;
		for (int i=0;i<limiteSequece;i++){
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}
	
	public static int fibonacci (int numero){
		int digit = -1;
		if (numero ==0 )
			return 0;
		else if (numero == 1)
			digit = 1;
		else if (numero > 1)
			digit = fibonacci(numero -1) + fibonacci(numero -2);
		else 
			throw new RuntimeException("Debes ingresar un numero mayor a 1");
		return digit;
		
	}
}
