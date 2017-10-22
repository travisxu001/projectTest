
public class House {
	private int x,y,Sqr;
	private String name,Age;
	private double price;
	private int Distance;
	//contructor for class hours
	public House(String name, int x, int y, int Sqr, String Age, double price){
		this.name = name;
		this. x = x;
		this.y = y;
		this.Age = Age;
		this.price = price;
		Distance = 0;
		
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
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
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
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
