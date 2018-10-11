package phonebook;

public class person {

	private address personAddress;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	
	
	public person()
	{
		
	}
	public person( String firstName, String middleName, String lastname,String phoneNumber,address personAddress )
	{
		this.personAddress = personAddress;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public address getPersonAddress()
	{
		return personAddress;
	}
	public void setPersonAddress(address personAddress)
	{
		this.personAddress = personAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	// TODO Auto-generated method stub
	@Override
	public String toString() {
		return "person [personAddress=" + personAddress + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
	}
		
	
	
}
