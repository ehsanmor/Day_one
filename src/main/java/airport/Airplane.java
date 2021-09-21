package airport;

public class Airplane {

    private String planeIdentification;
    private int maxNumberOfPassenger;
    private int currentNumberOfPasenger;
    private boolean isCurrentlyFlying;
    private float cruiseSpeed;

    public void loadPassengersWithNumberOfPassengers(String planeIdentification, int numberOfPasenger) {
        this.planeIdentification = planeIdentification;
        this.currentNumberOfPasenger = numberOfPasenger;
        System.out.println("Airplane " + this.planeIdentification +
                " loads " + this.currentNumberOfPasenger +
                " passengers.");
    }

    public void unloadPassengers() {
        System.out.println("Airplane " + this.planeIdentification +
                " unloads " + this.currentNumberOfPasenger +
                " passengers.");
    }

    public void takeOff() {
        System.out.println("Airplane " + this.planeIdentification +
                " takes off.");
    }

    public void land() {
        System.out.println("Plane " + this.planeIdentification +
                " lands.");
    }

    public Airplane() {
    }

    public Airplane(String planeIdentification, int maxNumberOfPassenger, int currentNumberOfPasenger, boolean isCurrentlyFlying, float cruiseSpeed) {
        this.planeIdentification = planeIdentification;
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.currentNumberOfPasenger = currentNumberOfPasenger;
        this.isCurrentlyFlying = isCurrentlyFlying;
        this.cruiseSpeed = cruiseSpeed;
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public int getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public void setMaxNumberOfPassenger(int maxNumberOfPassenger) {
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    public int getCurrentNumberOfPasenger() {
        return currentNumberOfPasenger;
    }

    public void setCurrentNumberOfPasenger(int currentNumberOfPasenger) {
        this.currentNumberOfPasenger = currentNumberOfPasenger;
    }

    public boolean isCurrentlyFlying() {
        return isCurrentlyFlying;
    }

    public void setCurrentlyFlying(boolean currentlyFlying) {
        isCurrentlyFlying = currentlyFlying;
    }

    public float getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(float cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }
}
