package src.main.java.FacadeDesignPattern;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }

    public void placeOrder(String productId , int amount) {
        if(inventoryService.checkStock(productId)) {
            paymentService.makePayment(amount);
            shippingService.shipProduct(productId);
        } else {
            System.out.println("Product Out of stock");
        }
    }
}
