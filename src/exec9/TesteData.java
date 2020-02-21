package exec9;


/**
 *  classe dedicada ao teste da classe data(com erro proposital)
 * @author vbsantos
 * @since 17/02/2020
 * @version 0.1
 */
public class TesteData {

	public static void main(String[] args) {
		
		Data d1=new Data();
		d1.dia=10;
		d1.setDia(10);
		d1.getdia();

	}

}
