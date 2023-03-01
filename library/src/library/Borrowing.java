

public class Borrowing {
    
    private int protocol;
	private String outDate;
	private String devolution;
	
	public int getProtocol() {
		return protocol;
	}
	
	public void setProtocol(int protocol) {
		this.protocol = protocol;
	}

	public String getOutDate() {
		return outDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public String getDevolution() {
		return devolution;
	}

	public void setDevolution(String devolution) {
		this.devolution = devolution;
	}
	
	public void finalize(){
		System.out.println("\nEtapa Emprestimo finalizada!\n");
	}

}
