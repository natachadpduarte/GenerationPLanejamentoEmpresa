package Empresa;

import java.util.List;

public class SaidaUsuario {
	public static void qualAnexo() {
		String menuAnexo = "1- Anexo I - Comércio\r\n"
				  + "2- Anexo II - Industria\r\n"
				  + "3- Anexo III - Serviço\r\n"
				  + "4- Anexo  IV – Construção Civil\r\n"
				  + "5- Anexo  V –– Serviços de cunho intelectual\r\n";
		System.out.println(menuAnexo);
	}
	
	public static void relatorio(List<Float> pagamento, float total, float imposto) {
		for (int i = 0; i <= 11; i++) {
			System.out.printf("Faturamento mes %d foi de %.2f\n", i+1, pagamento.get(i) );
		}
		System.out.println("Faturamento total de: "+total);
		System.out.println("Então seu imposto é de: "+imposto);
	}

}
