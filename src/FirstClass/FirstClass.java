package FirstClass;

public class FirstClass {
	public static void main(String[] args) {
		Product produto = new Product();
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);		
	}
	
	static void exibirQuantidadeEmEstoque(Product product) {
		System.out.println("Quantidade em estoque do produto " + product.nome + " é de " + product.quantidade + " unidade(s).");
	}
}
