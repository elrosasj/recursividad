
public class TrianguloPascal {
	private static int pascal (int a, int b){
		if (b==0 | b==a){
			return 1;
		}else {
			return pascal(a - 1, b -1) + pascal(a -1, b);
		}
	}
	
	public static void main(String[] args) {
		for (int a=0; a<15; a++ ){
			for (int b = 0; b <=a; b++) {
				String linea = String.valueOf(pascal(a, b));
				System.out.print(linea);
			}
			System.out.println();
		}
	}
}
