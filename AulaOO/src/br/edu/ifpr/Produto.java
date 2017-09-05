package br.edu.ifpr;

public class Produto {
	
	String ean;
	String nome;
	double valor;
	int quantidade;
	
	@Override
	public String toString() {
		return "Produto [ean=" + ean + ", nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	
	@Override
	public boolean equals(Object outro)
	{
		Produto outroProduto =(Produto)outro;
		return outroProduto.ean.equals(ean);
		
	}
	
	@Override
	public int hashCode(){
		return super.hashCode();
	}

	public Produto(String ean, String nome, double valor, int quantidade) {
		super();
		this.ean = ean;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	

}
