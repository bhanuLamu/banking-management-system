package bankdetailsofcustomer;

public class managerAddress {
	
	  private String street;
	  private String city;
	  private int pincode;
	  private long phoneNumber;
	  private String emailID;
	  
	  public managerAddress( String street, String city, int pincode, long phNumber, String email )
	  {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		phoneNumber = phNumber;
		emailID = email;
	  }

	  public String toString()
	  {
		return "\t Street:" + street + "\n\t City:" + city + " - " + pincode + "\n\t Phone No: " + phoneNumber + "\n\t e-mail ID: " + emailID;
	  }
	
}
