package il.co.jb;

public class Client {

	public int id;
	public String first_name;
	public String last_name;
	public String email;
	public String gender;
	public String ip_address;
	
	public Client() {
		System.out.println("This is from the Client constructor");
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", gender=" + gender + ", ip_address=" + ip_address + "]";
	}
}
