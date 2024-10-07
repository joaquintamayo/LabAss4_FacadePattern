public class FrontDesk {
    private Valet valet;
    private HouseKeeping hk;
    private Cart cart;

    public void valetService(String plateNumber) {
        valet = new Valet();
        valet.setPlateNumber(plateNumber);
        valet.service();
    }

    public void hkService(int roomNumber) {
        hk = new HouseKeeping();
        hk.setRoomNumber(roomNumber);
        hk.service();
    }

    public void cartService(int numberOfCarts) {
        cart = new Cart();
        cart.setNumberOfCarts(numberOfCarts);
        cart.service();
    }

    public void allServices(String plateNumber, int roomNumber, int numberOfCarts) {
        valetService(plateNumber);
        hkService(roomNumber);
        cartService(numberOfCarts);
    }
}