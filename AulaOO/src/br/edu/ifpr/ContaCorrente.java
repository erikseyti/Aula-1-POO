package br.edu.ifpr;

public class ContaCorrente {
	/* TODO
	 * Classe Conta Corrente
	 * 	- Para Permitir a manipulação e controle de conta de acesso bancario
	 * 	- Atributos: Saldo
	 * 	- Metodos: credito, debito e transfere
	 * 
	 */

	private double saldo;
	private String numeroConta;
	
	
	public ContaCorrente(String numeroConta) {
		// TODO Auto-generated constructor stub
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void credito(double valor)
	{
		this.saldo = this.saldo + valor;
	}
	public void debito(double valor)
	{
		this.saldo = this.saldo - valor;
	}
	
	public void transfere(double valor, ContaCorrente destino)
	{
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	
	@Override
	public String toString()
	{
		return "CC: " + this.numeroConta + ", saldo: "+  this.saldo;
		
	}
	
	
}
