public class Valet implements HotelService {
    private String plateNumber;

    @Override
    public void service() {
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet picked up vehicle with plate number: " + plateNumber);
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}