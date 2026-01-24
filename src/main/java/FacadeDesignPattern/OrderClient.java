package src.main.java.FacadeDesignPattern;

public class OrderClient {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("OLPN8978",500);
    }
}
