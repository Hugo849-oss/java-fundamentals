package usandoTodosTiposPrimitivos;

public class sistemaDeCompra {
	public static void main(String[] args) {
		String produto = "guitarra profissional";
		String marca = "Fender";
		String comprado = "Escola raio de sol";
		int quantidade = 30;
		double preço = 10000;
		double total = preço * quantidade;
		System.out.format("%n o produto foi comprado pela %s%n é da "
				+ "marca %s%n sendo uma %s,", comprado, marca, produto);
		System.out.format(" e foi pedido %d%n itens com o preço "
				+ "de %.2f tendo o total de %.2f%n", quantidade, preço, total);
		
		
		
		
		
	}

}
