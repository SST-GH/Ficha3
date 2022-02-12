package exer1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("Joao", new Date ());
		ContaBancaria conta2 = new ContaBancaria("Pedro", 250);
		ContaBancaria conta3 = new ContaBancaria("Jojo", new Date());
		ContaBancaria conta4 = new ContaBancaria("Sara", 5000);
		
		List<ContaBancaria>contas = new ArrayList<ContaBancaria>();
		
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		
		
		conta4.depositar(10_000);
		conta4.levantar(1000);
		System.out.println(conta4.getInformacaoConta() + "\n");
		
		
		conta3.depositar(1500);
		conta3.levantar(10000);
		System.out.println(conta3.getInformacaoConta());
		
		
	
		String ex = "wtf";
		System.out.println(ex.stripLeading());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
