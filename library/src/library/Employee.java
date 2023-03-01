

public class Employee extends Person{
    
    private String shift;

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
	
	public void finalize(){
		System.out.println("\nEtapa Funcionario finalizada!\n");
	}

}
