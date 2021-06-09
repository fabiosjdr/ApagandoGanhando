package apagandoganhando;


public class Instrucao {
	String instrucao[] = new String[2];
	
	void preparar(String info) {
		
		if(info.matches("0 0")) {
    		
			System.exit(0);
	    	
	    } else {
	    	
	    	this.instrucao = info.split(" ");
	    	  
	    }
		
		
	}
}
