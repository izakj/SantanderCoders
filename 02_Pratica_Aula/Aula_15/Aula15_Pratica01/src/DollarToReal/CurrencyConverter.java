package DollarToReal;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double Convert(double price, double dollar){
		return (price * dollar * IOF);
	}

}
