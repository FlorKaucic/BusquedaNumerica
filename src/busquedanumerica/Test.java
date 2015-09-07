package busquedanumerica;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hacer esto mas bonito
		// leer el archivo
		String n = "123456";
		String m = "5346";
		
		int[] nvec;
		int[] mvec = new int[10];
				
		for (int i = 0; i < m.length(); i++)
			mvec[(int)(m.charAt(i))-48]++;
		
		for (int i = 0; i < 10; i++)
			System.out.println("Pos "+i+": "+mvec[i]);
		
				
		/*
		 * hacer la clase para los metodos:
		 * constructor con otro vec
		 * encontrar m en n
		 * hacer mvec
		 * leer el archivo
		 * crear la salida
		 */
	}
}