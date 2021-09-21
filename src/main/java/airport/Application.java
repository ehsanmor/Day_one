package airport;

public class Application {
    public static void main(String[] args) {
        //System.out.println("test");
        Airplane abc123=new Airplane();
        Airplane ddd888=new Airplane();

        abc123.loadPassengersWithNumberOfPassengers("ABC123",43);
        ddd888.loadPassengersWithNumberOfPassengers("DDD888",23);

        abc123.takeOff();
        ddd888.takeOff();

        abc123.unloadPassengers();
        ddd888.unloadPassengers();

        abc123.land();
        ddd888.land();

    }
}
