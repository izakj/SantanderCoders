package principal;

public class Contato {
	
	private Integer id;
	private String name;
	private Integer age;
	private String phone;
	private Endereco address;
	
	public Contato() {
		
	}
	
	public Contato(Integer id, String name, Integer age, String phone, Endereco address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Endereco getAddress() {
		return address;
	}

	public void setAddress(Endereco address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "--------------------\n[ID Number: " + id + " | Name: " + name + " | Age: " + age + " | Phone: " + phone + address + "]";
	}
	
	

	

}
