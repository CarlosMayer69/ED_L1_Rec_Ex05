package view;

import controller.SomatoriaRecursivaController;

public class Principal {

	public static void main(String[] args) {
	    	
	    	SomatoriaRecursivaController sm = new SomatoriaRecursivaController();
	    	
	        int N = 5; // Alterar o valor de N conforme necessário!
	        double resultado = sm.calcularSomatoria(N);

	        System.out.println("A somatória S é: " + resultado);
	    }

	    
	}



