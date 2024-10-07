public class Cart implements HotelService {
    private int numberOfCarts;

    @Override
    public void service() {
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Requested " + numberOfCarts + " luggage cart/s.");
    }

    public void setNumberOfCarts(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }
}
