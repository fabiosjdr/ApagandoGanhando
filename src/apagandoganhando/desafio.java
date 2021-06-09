package apagandoganhando;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class desafio {
	
	public static void main(String[] args) {
		
		Instrucao instrucao = new Instrucao();
		Apagar apagar = new Apagar();
		
		try {	
			
			File myObj = new File(System.getProperty("user.dir")+"/src/entrada.txt");
		    Scanner myReader = new Scanner(myObj);
			
		    while (myReader.hasNextLine()) {
		    	
		    	String info = myReader.nextLine();
		    	
		    	if(info.matches("\\d{1,3}\\s\\d{1,3}")) {		    		
				    
				    instrucao.preparar(info);
				    
		    	}else {		    		
		    		
		    		int tamanhoNumero = Integer.parseInt(instrucao.instrucao[0]);
		    		int qtdApagar =  Integer.parseInt(instrucao.instrucao[1]);
		    		
		    		if( apagar.validar(tamanhoNumero,qtdApagar)) {
		    			apagar.processar(info,tamanhoNumero,qtdApagar);
		    		}
		    		
		    	}
		    }
		    
		    myReader.close();
		    
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
	    }
	}
	
	
}
