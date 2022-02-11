package exer1;

import java.time.LocalDate;
import java.util.Date;

public class ContaBancaria{
	
	private String titular;
	private double saldo;
	private Date dataAbertura;
	

	
	
//CONSTRUTORES
	public ContaBancaria(String aTitular) {
		titular = aTitular;
		this.dataAbertura= new Date();
		saldo = 0.0;
	}
	
	public ContaBancaria(String aTitular, double aSaldo) {
		titular = aTitular;
		this.dataAbertura= new Date();
		saldo = aSaldo;
	}
	
	public ContaBancaria(String aTitular, Date aDataAbertura) {
		titular = aTitular;
		dataAbertura = aDataAbertura;
	}
	
	

	
//METODOS
	public String getInformacaoConta() {
		return "titular: " + titular + "saldo: " + saldo;
		
		
		
	}

	
	public void depositar(double aValor) {
		saldo = saldo + aValor;
	}
//	
	public void levantar(double aValor) {
		saldo = saldo - aValor;
	}
	
	
	
	
//GETTERS E SETTERS
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getaTitular() {
		return titular;
	}
	
	public Date dataAbertura() {
		return dataAbertura;
	}
	
}
