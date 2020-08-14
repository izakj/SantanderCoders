package Employee_Functions;

public class Employee {
	
	public String Name;
	public Double GrossSalary;
	public Double Tax;
	
	public double NetSalary() {
		return (GrossSalary - Tax);
	}
	
	public void IncreaseSalary(double percentage) {
		this.GrossSalary = this.GrossSalary + (this.GrossSalary * percentage / 100);
	}
	


}
