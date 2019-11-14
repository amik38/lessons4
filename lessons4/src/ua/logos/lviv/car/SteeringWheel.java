package ua.logos.lviv.car;

public class SteeringWheel {
	
	    private int diametr;
	    private String material;
	    private boolean audioControl;

	     public int getDiametr() {
	        return diametr;
	    }

	    public void setDiametr(int diametr) {
	        this.diametr = diametr;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    public boolean isAudioControl() {
	        return audioControl;
	    }

	    public void setAudioControl(boolean audioControl) {
	        this.audioControl = audioControl;
	    }

	    @Override
	    public String toString() {
	        return "SteeringWheel{" +
	                "diametr=" + diametr +
	                ", material='" + material + '\'' +
	                ", audioControl=" + audioControl +
	                '}';
	    }

	    public void makeSportWheel(){
	        diametr = 12;
	        audioControl = false;
	        material = "leather";
	    }

	    public void makeOffRoadWheel(){
	         diametr = 16;
	         audioControl = false;
	         material = "metal";
	    }

	    public void makeStandart(){
	         diametr = 14;
	         audioControl = true;
	         material = "plastic";
	    }

	}


