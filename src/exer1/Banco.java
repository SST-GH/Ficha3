package exer1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private static List<ContaBancaria>contas;
	private static List<Casa>casas;
	
	//CONSTRUTOR
	public Banco(String aNome) {
		nome = aNome;
		contas = new ArrayList<ContaBancaria>(100);
		casas = new ArrayList<Casa>();
	}
	
	//METODOS
	public void criarConta(ContaBancaria aConta) {
		contas.add(aConta);				
	}
	
	public ContaBancaria getConta(String aNome) {
		for (ContaBancaria contBan: contas) {
			if(contBan.getaTitular().equals(aNome)) {
				return contBan;
			}
		}
		return null;//caso nao encontrar contaBan, ou seja null.
	}
	
	public void adicionarCasa(Casa aCasa) {
		casas.add(aCasa);
	}
	
	public void retirarCasa(String aMorada) {
		for (Casa casa: casas) {
			if(casa.getMorada().equals(aMorada)) {
				casas.remove(casa);
			}
		}
	}
	
	public double getLucroPrevisto() {
		
		double lucPrev = 0;
		for(Casa casa: casas) {
			lucPrev = lucPrev + casa.getMargemLucro();
		}
			return lucPrev;
	}

	//GETTERS E SETTERS
	public List<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(List<ContaBancaria>contas) {
		Banco.contas = contas;
	}

	public List<Casa> getCasas() {
		return casas;
	}
	
	public void setCasas(List<Casa> casas) {
		Banco.casas = casas;
	}
}
