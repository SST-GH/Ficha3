package exer1;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<ContaBancaria>contas;
	
	
	
	//CONSTRUTOR
	public Banco(String aNome, List<ContaBancaria>aContas) {
		nome = aNome;
		contas = aContas;
	}

	//METODOS
	public static void criarConta(String contaBancaria) {
		
		
	}
	
	
	
	//GETTERS E SETTERS
	public List<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(List<ContaBancaria> contas) {
		this.contas = contas;
	}

}
