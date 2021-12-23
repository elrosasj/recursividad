
public class Hanoi {

	public static void main(String[] args) {
		int discos = 3;
		resolver(discos, 1, 2, 3);
	}
	
	public static void resolver(int numeroDiscos, int origen, int auxiliar, int destino){
		if (numeroDiscos == 1){
			System.out.println("Mover " + numeroDiscos + " de " + origen + " a " + destino);
		}
		else {
			resolver(numeroDiscos -1, origen, destino, auxiliar);
			System.out.println("Mover " + numeroDiscos + " de " + origen + " a " + destino);
			resolver(numeroDiscos - 1, auxiliar, origen, destino);
		}
			
	}
}
