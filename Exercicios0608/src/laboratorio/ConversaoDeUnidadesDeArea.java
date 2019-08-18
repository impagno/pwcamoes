package laboratorio;

import java.text.NumberFormat;

public class ConversaoDeUnidadesDeArea {

	public static String metrosParaPes(double metros) {
		return NumberFormat.getInstance().format(metros * 10.76);
	}
	
	public static double pesParaCentrimetros(double pes) {
		return pes * 929;
	}
	
	public static double milhaParaAcre(double milha) {
		return milha * 640;
	}
	
	public static double acreParaPes(double acre) {
		return acre * 43560;
	}
}
