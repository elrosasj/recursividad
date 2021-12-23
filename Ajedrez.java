
public class Ajedrez {
	
	private static void drawTablero(int lado){
		
		for (int columna = 0; columna < lado; columna++) {
			if (columna%2==0){
				drawFila(lado,"", "▓");
			}else {
				drawFila(lado,"▓", "");
			}
			
		}
	}
	
	private static void drawFila(int lado, String color1, String color2){
		
		for (int fila = 0; fila < lado; fila++) {
			System.out.print(color1 + " " + color2);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int lado = 30;
		drawTablero(lado);
	}
}
