package registration.SYSTEM;

//Import necessary modules
import java.io.Serializable;

//USER CLASS
public abstract class User implements Serializable {
	
	//Data fields
	String username;
	String password;
	String first_name;
	String last_name;
	
	//Default constructor
	public User() {
	}
	
	//Constructor
	public User(String username, String password, String first_name, String last_name) {
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	//Accessors and mutators
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}