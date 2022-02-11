package exer1;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("Joao");
		ContaBancaria conta2 = new ContaBancaria("Pedro", 250);
		ContaBancaria conta3 = new ContaBancaria("Jojo", new Date (1980, 1, 20));
		ContaBancaria conta4 = new ContaBancaria("Sara", 5000);
		
		conta4.depositar(10_000);
		conta4.levantar(1000);
		System.out.println(conta4.getInformacaoConta() + "\n");
		
		
		conta3.depositar(1500);
		System.out.println(conta3.getInformacaoConta());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
