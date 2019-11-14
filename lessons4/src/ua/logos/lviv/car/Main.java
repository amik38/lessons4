package ua.logos.lviv.car;

public class Main {
	
	
	    public static void main(String[] args) {
	        Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()};
	        Car car = new Car("BMW", 2.0f, 170, new Body(),
	                new SteeringWheel(), wheels);
	        System.out.println(car);
	        
	        car.makeOffRoad();
	        System.out.println(car);
	       
	        car.makeStandart();
	        System.out.println(car);
	        
	    }
	}
