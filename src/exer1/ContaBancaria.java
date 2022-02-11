package exer1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
		this.dataAbertura = new Date();
		saldo = aSaldo;
	}
	
	public ContaBancaria(String aTitular, Date aDataAbertura) {
		titular = aTitular;
		dataAbertura = aDataAbertura;
	}
	
//METODOS
	public String getInformacaoConta() {
		DecimalFormat decFor = new DecimalFormat("0.00");
		String saldoDec = decFor.format(saldo);
		SimpleDateFormat forData = new SimpleDateFormat("DD/MM/YYYY");
		return "A titular " + titular + " tem saldo atual de " + saldo + "€" + " e abriu a conta em " + forData;
	}

	public void depositar(double aValor) {
		saldo = saldo + aValor;
		System.out.println("Depositou " + aValor);
		System.out.println("Saldo depois deposito " + saldo);
	}
//	
	public void levantar(double aValor) {
		saldo = saldo - aValor;
		System.out.println("Levantou " + aValor);
		System.out.println("Saldo depois levantamento " + saldo);
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
