public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void service() {
        requestCart();
    }

    public void requestCart() {
        System.out.println("Requested " + numberOfCarts + " luggage cart/s.");
    }
}