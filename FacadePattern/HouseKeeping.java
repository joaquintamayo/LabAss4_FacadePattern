public class HouseKeeping implements HotelService {
    private int roomNumber;

    @Override
    public void service() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping cleaned room number: " + roomNumber);
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}