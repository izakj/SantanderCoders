package principal;

public class Endereco {
	private String street;
	private Integer number;
	private String neighborhood;
	private String city;
	private String state;
	
	public Endereco() {
		
	}

	public Endereco(String street, Integer number, String neighborhood, String city, String state) {
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
	}
	
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return " | Street: " + street + " | Number: " + number + " | Neighborhood: " + neighborhood + " | City: " + city
				+ " | State: " + state;
	}
	
	
	
	
	
	

}
