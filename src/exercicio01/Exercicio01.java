package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		Product produto = new Product();
		produto.nome = "Notebook XZ10";
		produto.quantidadeEstoque = 8;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
	}
	
	static Boolean eNecessarioReporEstoque(Product produto) {
		if (Product.QUANTIDADE_MINIMA_ESTOQUE < Product.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}