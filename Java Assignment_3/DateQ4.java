package company;

import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		super();
		this.day=day;
		this.month=month;
		this.year=year;	
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(day, month);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month;
	}

	@Override
	public String toString() {
		return "Date [DoB=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
