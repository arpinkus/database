package database;

@Entity
@Table(name="professor")
public class Professor {
	// Attributes (Data)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="office_number")
	private String officeNumber;
	
	@Column(name="research_area")
	private String researchArea;
	
	@OneToOne
	@JoinColumn(name="customer")
	private Customer customer;
	
	// Constructors
	public Professor() {
		
	}//end constructor
	
	public Professor(String newOfficeNumber, String newResearchArea) {
		officeNumber = newOfficeNumber;
		researchArea = newResearchArea;
	}//end constructor(officeNumber, researchArea)

	// Getters and Setters
	public String getOfficeNumber() {
		return officeNumber;
	}//end getOfficeNumber()

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}//end setOfficeNumber()

	public String getResearchArea() {
		return researchArea;
	}//end getResearchArea()

	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}//end setResearchArea()

	public Customer getCustomer() {
		return customer;
	}//end getCustomer()

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}//end setCustomer()
}//End Professor
