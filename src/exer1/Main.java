package exer1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		var conta1 = new ContaBancaria("Mig", new Date ());
		var conta2 = new ContaBancaria("Pedro", 250);
		var conta3 = new ContaBancaria("Jojo", new Date());
		var conta4 = new ContaBancaria("Sara", 5_000);
		
		List<ContaBancaria>contas = new ArrayList<ContaBancaria>();
		
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		
		System.out.println(conta4.getInformacaoConta());
		conta4.depositar(10_000);
		conta4.levantar(1_000);
		
		System.out.println("\n" + conta3.getInformacaoConta());
		conta3.depositar(1_500);
		conta3.levantar(10_000);
		
		var banco = new Banco("Rico");
		
		banco.criarConta(new ContaBancaria("Ciel", 1000));
		banco.criarConta(new ContaBancaria("Jon", new Date()));
		
		ContaBancaria conta5 = banco.getConta("Jon");
		System.out.println("\n" + conta5.getInformacaoConta());
		
		ContaBancaria conta6 = banco.getConta("Ciel");
		System.out.println("\n" + conta6.getInformacaoConta());
		conta6.depositar(400);
		conta6.levantar(700);
		
		var casa1 = new Casa("Rua do Funchal");
		var casa2 = new Casa("Avenida da Liberdade");
		var casa3 = new Casa("Caminho do Porto");
		
		List<Casa>casas = new ArrayList<Casa>();
		
		casas.add(casa1);
		casas.add(casa2);
		casas.add(casa3);
		
		banco.adicionarCasa(casa1);
		banco.adicionarCasa(casa2);
		banco.adicionarCasa(casa3);
		
		casa2.setPrecoCusto(700_000);
		casa2.setPrecoVenda(500_000);
		System.out.println("\nA casa vendida na morada " + casa2.getMorada() + " tem uma percentagem na margem de lucro " +
		casa2.getPercentMargemLucro() + "%");
	
		banco.retirarCasa("Avenida da Liberdade");
	}
}
