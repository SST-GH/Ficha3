package exer1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ContaBancaria{
	
	//ATRIBUTOS
	private String titular;
	private double saldo;
	private Date dataAbertura;
	
	//CONSTRUTORES
	public ContaBancaria(String aTitular, double aSaldo) {
		titular = aTitular;
		dataAbertura = new Date();
		saldo = aSaldo;
	}
	
	public ContaBancaria(String aTitular, Date aDataAbertura) {
		titular = aTitular;
		dataAbertura = aDataAbertura;
		saldo = 0.0;
	}
	
	//METODOS
	public String getInformacaoConta() {
		DecimalFormat decFor = new DecimalFormat("0.00");
		String saldoDec = decFor.format(saldo);
		SimpleDateFormat forData = new SimpleDateFormat("dd/MM/yyyy");
		String SDF = forData.format(dataAbertura);
		
		return "A titular " + titular + " tem saldo atual de " + "€" + saldoDec  + " e abriu a conta em " + SDF;
	}
	
	public void depositar(double aValor) {
		saldo = saldo + aValor;
		
		System.out.println("Depositou " + aValor + "€");
		System.out.println("Saldo depois depósito " + saldo + "€");
	}
	
	public void levantar(double aValor) {
		
		if(aValor < saldo) {
			saldo = saldo - aValor;
			
			System.out.println("Levantou " + aValor + "€");
			System.out.println("Saldo depois levantamento " + saldo + "€");
		}
		
		else {
			System.out.println("Lamentamos, mas não é permitidos levantamentos. Fundos insuficientes");
		}
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
