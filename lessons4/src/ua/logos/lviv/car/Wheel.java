package ua.logos.lviv.car;

public class Wheel {
	
	    private int diametr;
	    private int tire_Width;
	    private String manufacturer;
	    private double price;

	    public int getDiametr() {
	        return diametr;
	    }

	    public void setDiametr(int diametr) {
	        this.diametr = diametr;
	    }

	    public int getTire_Width() {
	        return tire_Width;
	    }

	    public void setTire_Width(int tire_Width) {
	        this.tire_Width = tire_Width;
	    }

	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Wheel{" +
	                "diametr=" + diametr +
	                ", tire_Width=" + tire_Width +
	                ", manufacturer='" + manufacturer + '\'' +
	                ", price=" + price +
	                '}';
	    }


	    public void giveDiscount(){
	        price *= 0.9;
	    }

	    public void makeSport(){
	        diametr = 26;
	        tire_Width = 320;
	    }

	    public void makeOffRoad(){
	        diametr = 14;
	        tire_Width = 180;
	    }

	    public void makeStandart(){
	        diametr = 16;
	        tire_Width = 120;
	    }

	}



