package conta;
public abstract class Conta {
	private Double saldo;
	
	public Conta() {
		
	}
	public Conta(Double saldo) {
		this.saldo = saldo;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
}