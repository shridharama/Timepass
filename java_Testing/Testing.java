//package hello;
import java.util.*;

class Testing{
	
	//Car car;
	
	public static void main(String args[]){
		Car car = new Car();
		car.setA("Ferrari");
		
		System.out.println(car.getA());	
	
		ArrayList<Car> cars = new ArrayList<Car>();
		
		cars.add(car);
		car.setA("Maruti");
		cars.add(car);
	
		for (Car x : cars){
			System.out.println(x.getA());	
		}
	
		//printlist(cars);
	}
	
	void printlist(ArrayList<Car> cars){
		for (Car car : cars){
			System.out.println(car.getA());	
		}
	}


}

class Car{
	
	private String a;
	
	public void setA(String a){
		this.a = a;
	}
	
	public String getA(){
		return this.a;
	}
	
}