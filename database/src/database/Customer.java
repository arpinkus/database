package database;

@Entity
@Table(name="customer")
public class Customer {
	// Attributes (Data)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@OneToOne
	@JoinColumn(name="professor")
	private Professor professor;
	
	// Constructors
	public Customer() {
		
	}//end constructor
	
	public Customer(String newName, String newAddress) {
		name = newName;
		address = newAddress;
	}//end constructor(name, address)

	// Getters and Setters
	public Professor getProfessor() {
		return professor;
	}//end getProfessor()

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}//end setProfessor()
	
	public String getName() {
		return name;
	}//end getName()

	public void setName(String name) {
		this.name = name;
	}//end setName()

	public String getAddress() {
		return address;
	}//end getAddress()

	public void setAddress(String address) {
		this.address = address;
	}//end setAddress()

	
}//end Customer
