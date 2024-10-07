public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void service() {
        cleanRoom();
    }

    public void cleanRoom() {
        System.out.println("Housekeeping cleaned room number: " + roomNumber);
    }
}