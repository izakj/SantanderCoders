package Complement;

public class Function {
	
	public Double width;
	public Double height;
	
	
	public double Area() {
		return (width * height);
	}

	public double Perimeter() {
		return  ((2 * width) + (2 * height));
	}
	
	public double Diagonal() {
		return  Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	@Override
	public String toString() {
		return "Retangulo: " + Area() + 
				"\nPerimetro: " + Perimeter() + 
				"\nDiagonal: " + Diagonal();
	}

}
