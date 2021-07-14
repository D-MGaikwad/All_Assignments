package company;

import java.util.Objects;

public class User {
	private String Username;
	public 	User(String name, String pass) {
		super();
		this.Username = name;
	}
	public int hashCode() {
		return Objects.hash(Username);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Username, other.Username);
	}
	public String toString() {
		return "" + Username;
	}
}
