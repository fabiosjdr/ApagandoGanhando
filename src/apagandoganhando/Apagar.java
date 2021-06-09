package apagandoganhando;

//import java.util.ArrayList;

public class Apagar {
	
	void processar(String numero, int tamanhoNumero, int qtdApagar){
		
		StringBuilder vetor = new StringBuilder(numero);
		tamanhoNumero--;  //comeca com indice 0 
		
		int i = 0;
		
		while (qtdApagar > 0) {
			
			if (tamanhoNumero == i) {
			
				vetor.deleteCharAt(i);
				tamanhoNumero--;
				qtdApagar--;
				i = 0;
			
			}else if(vetor.charAt(i) < vetor.charAt(i+1)) {
				
				vetor.deleteCharAt(i);
				qtdApagar--;
				tamanhoNumero--;
				i = 0;
			
			}else {
				
				i++;
			}
		}
		
		System.out.println(vetor.toString());
		
		
	}
	
	boolean validar(int tamanhoNumero, int qtdApagar) {
		//( 1 ≤ D < N ≤ 105)		
		return (  qtdApagar >= 1 && qtdApagar < tamanhoNumero &&  tamanhoNumero <= 105);
	}
}
