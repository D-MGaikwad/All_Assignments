package company;

public class Person {
	
	private int weight;
	private int height;
	private String name;


	public Person(int w, int h, String name) 
	  {
		super();
		this.weight= w;
		this.height= h;
		this.name =name;
		}
	
	

	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}

}
	
	
	

