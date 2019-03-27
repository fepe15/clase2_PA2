
public class ClaseString {
	
	
	
	public ClaseString(){
	}
	
	public int devolverCantCaracteres(String palabra)
	{
		 return palabra.length();
	}
	
	public String devolverMitad(String palabra){
		
		int mitad;
		mitad=palabra.length()/2;
		return palabra.substring(0, mitad);
	}
	
	public Character devolverUltimo(String palabra){
		int ultimo;
		ultimo= palabra.length() - 1;
		return palabra.charAt(ultimo);
	}
	
	public String invertirPalabra(String palabra){
		
		String otraPalabra = new String();
		for (int i = 0; i < palabra.length() ; i++) {
			otraPalabra += palabra.charAt(palabra.length()-i);
		}
		return otraPalabra;
	}
	
	
	

}
