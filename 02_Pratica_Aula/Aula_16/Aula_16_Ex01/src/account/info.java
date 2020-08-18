package account;
public class info {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public info(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public double deposito(double valor) {
		return saldo += valor;
	}
	
	public double saque(double valor) {
		return saldo -= valor + 5.00; 
	}
	public String toString() {
		return "Conta Numero: " + numeroConta + ", Correntista: " + nome + ", Saldo: R$ " + saldo;
	}
	
}