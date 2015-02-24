

/**
 * esta clase sirve para sumar y multiplicar 3 valores
 * @author eric
 *
 */
public class Calculador {
/**
 * el constructor no necesita que le pasen ningun parametro
 */
	public Calculador(){
	}

/**
 * este metodo sumara 3 valores
 * @param x primer numero a sumar
 * @param y segundo numero a sumar
 * @param z tercer numero a sumar
 * @return
 */
	public int suma(int x, int y, int z) {

		return x + y + z;		
	}

/**
 * este metodo multiplicara 3 valores
 * @param x primer numero a multi
 * @param y segundo numero a multi
 * @param z tercer numero a multi
 * @return devolvera los numeros multiplicados
 */
	public int producto(int x, int y, int z) {
		int result = 0;		
		// suma z tantas veces como 'x' e 'y' 
		for (int i = 0; i < x; i++ ){
			for (int j = 0; j < y; j++ ){
				result += z;
			}
		}

		return result;			
		//return x * y * z; //<< codigo alternativo		
	}

	public static void main (String args[]){

		Calculador c = new Calculador();
		System.out.print( "c1.suma( 1,  2,   3) =");
		System.out.println( c.suma( 1,  2,   3) );
		System.out.print( "c.suma( 5, 10,  15) =");
		System.out.println( c.suma( 5, 10,  15) );
		System.out.print( "c.suma( 1, 10, 100) =");
		System.out.println( c.suma( 1, 10, 100) );

		System.out.print( "c.producto( 1,  2,   3) =");
		System.out.println( c.producto( 1,  2,   3) );
		System.out.print( "c.producto( 5, 10,  15) =");
		System.out.println( c.producto( 5, 10,  15) );
		System.out.print( "c.producto( 1, 10, 100) =");
		System.out.println( c.producto( 1, 10, 100) );
		System.out.print( "c.producto( 1,  1,   1) =");
		System.out.println( c.producto( 1,  1,   1) );
		System.out.print( "c.producto( 0,  1,   1) =");
		System.out.println( c.producto( 0,  1,   1) );
		System.out.print( "c.producto( -1, 1,   1) =");
		System.out.println( c.producto( -1, 1,   1) );

	}


}
