
public class House {
	private int x,y,Sqr,Age;
	private String name;
	private double price;
	//contructor for class hours
	public House(String name, int x, int y, int Sqr, int Age, double price){
		this.name = name;
		this. x = x;
		this.y = y;
		this.Age = Age;
		this.price = price;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSqr() {
		return Sqr;
	}
	public void setSqr(int sqr) {
		Sqr = sqr;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
