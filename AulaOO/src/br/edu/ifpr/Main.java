package br.edu.ifpr;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		/*
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
		Produto p3 = new Produto("456456456", "Mouse", 20, 5);
		
		p3 =p1;
		
		Object[] objetos ={cc1,cc2,p1,p2};
		for (int i = 0; i < objetos.length; i++) {
			System.out.println(objetos[i]);
		}
		
		Collection colecao = new ArrayList();
		colecao.add(cc1);
		colecao.add(cc2);
		colecao.add(p1);
		colecao.add(p2);
		
		colecao.forEach(System.out::println); //java 8
		
		*/
		/*
		Produto p1 = new Produto("456456456", "Mouse", 20, 5);
		Produto p2 = new Produto("4564564564", "Teclado", 15, 10);
		Produto p3 = new Produto("456456456", "Mouse", 20, 5);
		Produto p4 = new Produto("456476456", "Mouze", 22, 6);
		//p1 = p3;
		
		//List<Produto> produtos = new ArrayList<>();
		//Collection<Produto> produtos = new ArrayList<>();
		Collection<Produto> produtos = new HashSet<>();
		
		// esta fazendo a comparação e, cima do ean do produto
		if(!produtos.contains(p1)){
			produtos.add(p1);
		}
			
		if(!produtos.contains(p2)){
			produtos.add(p2);
		}
		if(!produtos.contains(p3))
		{
			produtos.add(p3);
		}
		if(!produtos.contains(p4))
		{
			produtos.add(p4);
		}
				
		produtos.forEach(System.out::println);
		
		
		if(p1 == p3)
		{
			System.out.println("São Iguais ==");
		}
		else
		{
			System.out.println("São Diferentes ==");
		}
		
		if(p1.equals(p3))
		{
			System.out.println("São Iguais EQUALS");
		}
		else
		{
			System.out.println("São Diferentes EQUALS");
		}
		*/
		
		Competidor c1 = new Gato();
		Competidor c2 = new Pessoa();
		Collection<Competidor> competidores = new ArrayList<>();
		competidores.add(c1);
		competidores.add(c2);
		
		for (Competidor competidor : competidores)
		{
			competidor.correr();
		}
	}
	
		
// control + f6
}
	