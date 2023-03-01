

public class User extends Person{
    
    private String phoneNumber;

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void finalize(){
		System.out.println("\nEtapa Usuario finalizada!\n");
	}

}
