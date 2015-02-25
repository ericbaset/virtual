/**
 * Esta clase hace una tirada de un dado de un tamaño especifico y la 
 * imprime en pantalla
 * @author eric
 *
 */
public class rastreator {

	/**
	 * no requiere de parametros en el constructor
	 */
	public rastreator(){

	}
	/**
	 * este metodo realiza la tirada de un numero entero y genera otro numero entero
	 * @param TamañoDado este valor sera el tamaño del dado
	 * @return devolvera el resultado como numero entero
	 */
	public int dados(int TamañoDado){
		int tirada;
		tirada=(int)(Math.random()*TamañoDado)+1;
		return tirada;
	}
	/**
	 * este metodo devuelve una cadena de Strings
	 */
	public String toString(){
		return "Tu mierda de tirada es de :";
	}
	public static void main(String[] args) {
		rastreator c = new rastreator();
		System.out.println(c.toString()+" "+c.dados(100));


	}

}
