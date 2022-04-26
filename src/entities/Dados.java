package entities;

public class Dados {
	
	private int conta;
	private String titular;
	private double saldo;
	
	public Dados(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	public Dados(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		depositar(depositoInicial);
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getConta() {
		return conta;
	}
	
	public void saque(double saque) {
		int taxa = 5;
		saldo -= saque + taxa;
	}
	public void depositar (double deposito) {
		saldo += deposito;
	}
	public String toString() {
		return "Conta: " +
	           conta + 
	           ", Titular: " +
	           titular + 
	           ", Saldo: R$ " +
	           String.format("%.2f", saldo);
	           
	}
	

}
