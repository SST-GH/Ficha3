package exer1;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("Joao");
		ContaBancaria conta2 = new ContaBancaria("Pedro", 250);
		ContaBancaria conta3 = new ContaBancaria("Jojo", new Date (1960, 1, 4));
		ContaBancaria conta4 = new ContaBancaria("Sara", 5000);
		
		conta4.depositar(10_000);
		conta4.levantar(500.50);
		System.out.println("A titular " + conta4.getaTitular() + " tem saldo de " + conta4.getSaldo() + conta4.dataAbertura());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
