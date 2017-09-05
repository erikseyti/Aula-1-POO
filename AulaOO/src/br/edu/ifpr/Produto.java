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
	
	// esta fazendo a comparação e, cima do ean
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ean == null) ? 0 : ean.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (ean == null) {
			if (other.ean != null)
				return false;
		} else if (!ean.equals(other.ean))
			return false;
		return true;
	}
	
	/*
	@Override
	public int hashCode(){
		return super.hashCode();
	}
	*/
	
	
	

	public Produto(String ean, String nome, double valor, int quantidade) {
		super();
		this.ean = ean;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	

}
