public class FrontDesk {
    private Valet valet;
    private HouseKeeping hk;
    private Cart cart;

    public void valetService(String plateNumber) {
        this.valet = new Valet(plateNumber);
        valet.service();  
    }

    public void hkService(int roomNumber) {
        this.hk = new HouseKeeping(roomNumber);
        hk.service(); 
    }

    public void cartService(int numberOfCarts) {
        this.cart = new Cart(numberOfCarts);
        cart.service();  
    }

    public void allServices(String plateNumber, int roomNumber, int numberOfCarts) {
        valetService(plateNumber);
        hkService(roomNumber);
        cartService(numberOfCarts);
    }
}