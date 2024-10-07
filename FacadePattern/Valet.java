public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void service() {
        pickUpVehicle();
    }

    public void pickUpVehicle() {
        System.out.println("Valet picked up vehicle with plate number: " + plateNumber);
    }
}