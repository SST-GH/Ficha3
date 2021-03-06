package exer1;

public class Casa {
	
	private String morada;
	private double precoCusto, precoVenda;
	
	//CONTRUTORES
	public Casa() {
	}
	
	public Casa(String aMorada) {
		morada = aMorada;
	}
	
	//METODOS
	public double getMargemLucro() {
		return precoVenda - precoCusto;
	}
	
	public double getPercentMargemLucro() {
		return (getMargemLucro()/precoCusto)*100;
	}
	
	//GETTERS E SETTERS
	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

}
