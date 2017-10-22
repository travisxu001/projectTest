import java.lang.*;
public class KNN {
	
	
	public House houseSet[] = null;
	
	public int AgeCheck(House house){
		String A = house.getAge();
		if (A == "New" || A == "new"){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public int Distance(House h1, House h2){
		if(h1 != null && h2 != null){
			int x = Math.abs(h1.getX()-h2.getX());
			int y = Math.abs(h1.getY()-h2.getY());
			return (int) Math.sqrt(Math.pow(x, 2)- Math.pow(y, 2));
		}
		else {
			return 0;
		}
	}
	
	public int Sqrcal(House h1, House h2){
		return h1.getSqr() - h2.getSqr();
	}
	
	public House[] HouseSort(House[] Set, House h1){
		int N = Set.length;
		House[] Num = new House[N];
		for(int i=0; i<Set.length; i++){
			int Age = AgeCheck(Set[i]);
			int Sq = Sqrcal(Set[i], h1);
			int Dis = Distance(Set[i], h1);
			int result = Age+Sq+Dis;
			Num[i].setDistance(result);
		}
		
		return Num;
		
		
	}
	
	public double Kcalculate(int k, House[] s){
		double[] price = new double[s.length];
		for(int i=0; i<k; i++){
			price[i] = s[i].getPrice();
		}
		double total = 0;
		for(int i=0;i<k;i++){
			total = total+ price[i];
		}
		
		return 1/k * total;
	}
	
	
	

}
