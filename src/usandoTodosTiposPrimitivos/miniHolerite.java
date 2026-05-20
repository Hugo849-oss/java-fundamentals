package usandoTodosTiposPrimitivos;

public class miniHolerite {
	public static void main(String[] args) {
		String data = " 2026";
		String nome = "Rogerio ferreira da silva";
		String função = "Engenheiro civil";
		int mensal = 9726;
		int líquido = 7260;
		System.out.format("holerite do ano de %s%n "
				+ "sobre o funcionario %s%n que possui a função de  %s%n ", data, nome, função);
		System.out.format("Ganhando um salario "
				+ "bruto de %d%n e um liquido de %d%n ", mensal, líquido);
		
		int aumento = 2000;
		int bruto = 11726;
		double inss = 988.10;
		double base = bruto - inss;
		double alíquota = 0.275;
		double desconto = base * alíquota;
		double deduzir = 908.73;
		double dedução = desconto - deduzir;
		double resultado = bruto - inss - dedução;
		System.out.format("tendo um aumento de %d%n "
				+ "chegando ao bruto de %d%n, tendo "
				+ "descontos de INSS %.2f%n e descontos de IRRF %.2f%n, "
				+ "assim tendo um liquido de %.2f%n", aumento, bruto, inss, dedução, resultado );
		 
		
		
	}

}
