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
		        
		        System.out.printf("%s.%n%s.%n%s.%n%.2f.%n", data, nome, função, bruto);
		        
		        
		entrada.close();
	}

}
