package ua.logos.lviv.car;

public class Body {
	
	    private String bodyType;
	    private String color;
	    private int lenght;

	    public String getBodyType() {
	        return bodyType;
	    }

	    public void setBodyType(String bodyType) {
	        this.bodyType = bodyType;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public int getLenght() {
	        return lenght;
	    }

	    public void setLenght(int lenght) {
	        this.lenght = lenght;
	    }

	    @Override
	    public String toString() {
	        return "Body{" +
	                "bodyType='" + bodyType + '\'' +
	                ", color='" + color + '\'' +
	                ", lenght=" + lenght +
	                '}';
	    }

	    public void makeSportBody(){
	        color = "red";
	        lenght = 6;
	        bodyType = "sport";
	    }

	    public void makeOffRoadBody(){
	        color = "black";
	        lenght = 4;
	        bodyType = "sedan";
	     }

	     public void makeStandartBody(){
	        color = "blue";
	        lenght = 5;
	        bodyType = "universal";
	     }
	}



