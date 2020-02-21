package exec9;

/**
 * operações matematicas
 * @author vbsantos
 * @since 17/02/2020
 */

public class Matematica {

	public static void main(String[] args) {

		double x = 10, y = 20.5, z = -30;
		double abs = Math.abs(z);

		System.out.println("numero absoluto: " + abs);

		double ceil = Math.ceil(y);

		System.out.println("retorna menor valor inteiro: " + ceil);

		double floor = Math.floor(y);
		System.out.println("retorna menor valor inteiro: " + floor);
	
		double max = Math.max(x,y);
		System.out.println("retorna maior valor: " + max);
		
		double min = Math.min(x,y);
		System.out.println("retorna menor valor: " + min);
		
		double pow = Math.pow(x, 2);
		System.out.println("retorna a potencia: " +pow);
		
		double sqrt = Math.sqrt(x);
		System.out.println("raiz quadrada: "+sqrt);
		
		double cos = Math.cos(y);
		System.out.println("cosseno: "+cos);
		
		double sin = Math.sin(y);
		System.out.println("seno: "+sin);
		
		double tan = Math.tan(y);
		System.out.println("tangente: "+tan);
		
				
		
	}

}
