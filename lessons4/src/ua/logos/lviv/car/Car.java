package ua.logos.lviv.car;
import java.util.Arrays;

public class Car {
	
	
	    private String manufacturer;
	    private float engine;
	    private int topSpeed;
	    private Body body;
	    private SteeringWheel steeringWheel;
	    private Wheel[] wheels;

	    public Car(String manufacturer, float engine, int topSpeed, Body body, SteeringWheel steeringWheel, Wheel[] wheels) {
	        this.manufacturer = manufacturer;
	        this.engine = engine;
	        this.topSpeed = topSpeed;
	        this.body = body;
	        this.steeringWheel = steeringWheel;
	        this.wheels = wheels;
	    }

	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public float getEngine() {
	        return engine;
	    }

	    public void setEngine(float engine) {
	        this.engine = engine;
	    }

	    public int getTopSpeed() {
	        return topSpeed;
	    }

	    public void setTopSpeed(int topSpeed) {
	        this.topSpeed = topSpeed;
	    }

	    public Body getBody() {
	        return body;
	    }

	    public void setBody(Body body) {
	        this.body = body;
	    }

	    public SteeringWheel getSteeringWheel() {
	        return steeringWheel;
	    }

	    public void setSteeringWheel(SteeringWheel steeringWheel) {
	        this.steeringWheel = steeringWheel;
	    }

	    public Wheel[] getWheels() {
	        return wheels;
	    }

	    public void setWheels(Wheel[] wheels) {
	        this.wheels = wheels;
	    }

	    @Override
	    public String toString() {
	        return "Car{" +
	                "manufacturer='" + manufacturer + '\'' +
	                ", engine=" + engine +
	                ", topSpeed=" + topSpeed +
	                ", body=" + body +
	                ", steeringWheel=" + steeringWheel +
	                ", wheels=" + Arrays.toString(wheels) +
	                '}';
	    }

	    public void makeSport(){
	        engine = 10.0f;
	        topSpeed = 360;
	        steeringWheel.makeSportWheel();
	        body.makeSportBody();
	        for (int i = 0; i < wheels.length; i++) {
	            wheels[i].makeSport();
	        }
	    }

	    public void makeOffRoad(){
	        engine = 6.0f;
	        topSpeed = 80;
	        steeringWheel.makeOffRoadWheel();
	        body.makeOffRoadBody();
	        for (int i = 0; i < wheels.length; i++) {
	            wheels[i].makeOffRoad();
	        }
	    }

	    public void makeStandart(){
	        engine = 2.5f;
	        topSpeed = 160;
	        steeringWheel.makeStandart();
	        body.makeStandartBody();
	        for (int i = 0; i < wheels.length; i++) {
	            wheels[i].makeStandart();
	        }
	    }
	}



