 package ExerciciosComplexos;

import java.util.Scanner;

public class OrçamentoConcreto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cliente");
		String cliente = entrada.nextLine();
		
		System.out.println("Empresa");
		String empresa = entrada.nextLine();
		
		System.out.println("Metros Cubicos");
		double metros = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("preço metro");
		double preço = entrada.nextInt();
		entrada.nextLine();
		
		double total = metros * preço;
		
		System.out.printf("%s.%n%s.%n%.2f metros.%n%.2f.%n%.2f total.%n", cliente, empresa,
				metros, preço, total);
		
		entrada.close();
		
	}
}
