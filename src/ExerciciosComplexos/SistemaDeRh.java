package ExerciciosComplexos;

import java.util.Scanner;

public class SistemaDeRh {
	public static void main(String[] args) {
		        
		        Scanner entrada = new Scanner(System.in);
		        
		        System.out.println("Data:");
		        String data = entrada.nextLine();
		        
		        System.out.println("Nome:");
		        String nome = entrada.nextLine();
		        
		        System.out.println("Função:");
		        String função = entrada.nextLine();
		        
		        System.out.println("Bruto:");
		        double bruto = entrada.nextDouble();
		        entrada.nextLine();
		        double INSS = 0.14;
		        double IRRF = 0.275;
		        double soma = bruto * INSS; 
		        double soma2 = bruto * IRRF;
		        double dedução = bruto - soma 
		        		-soma2;
		      
		        		
		        System.out.printf("%s.%n%s.%n%s.%nBRUTO: %.2f.%nINSS:%.2f.%nIRRF: %.2f.%nLIQUIDO:%.2f.%n", 
		        		data, nome, função, bruto, soma, soma2, dedução);
		        
		        
		entrada.close();
	}

}
