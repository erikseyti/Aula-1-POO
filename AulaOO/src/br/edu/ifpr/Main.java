package br.edu.ifpr;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente("502x");
		cc1.credito(10000);
		
		
		ContaCorrente cc2 = new ContaCorrente("365y");
		cc2.credito(5000);
		
		cc1.transfere(1000, cc2);
		
		//System.out.println("cc1, saldo: " + cc1.getSaldo());
		//System.out.println("cc2, saldo: " + cc2.getSaldo());
		System.out.println(cc1);
		System.out.println(cc2);
		
		Produto p1 = new Produto("456456456", "Mouse", 20, 5);
		Produto p2 = new Produto("4564564564", "Teclado", 15, 10);
		
		Object[] objetos ={cc1,cc2,p1,p2};
		for (int i = 0; i < objetos.length; i++) {
			System.out.println(objetos[i]);
		}
		
	}
// control + f6
}
