package Exercicio_Stock;

public class Stock {
	
	public String nome;
	public Double preco;
	public Integer qtd;
	
	public double TotalValueInStock() {
		return (preco * qtd);
	}
	
	public void adc(int qtd) {
		this.qtd = this.qtd + qtd;
	}
	
	public void rmv(int qtd) {
		this.qtd = this.qtd - qtd;
	}
	

	

}
