
public class InverseString {
	public static void main(String[] args) {
		String cadena = "eloy rosas jinez de yeca";
		System.out.println(inverse(cadena));
	}
	
	public static String inverse (String cadena){
		Character c = cadena.charAt(cadena.length()-1);
		if (cadena.length()==1)
			return Character.toString(c);
		else 
			return c + inverse(cadena.substring(0, cadena.length()-1));
	}
}
