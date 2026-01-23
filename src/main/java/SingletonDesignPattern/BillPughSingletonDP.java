package src.main.java.SingletonDesignPattern;

public class BillPughSingletonDP {

    private BillPughSingletonDP() {

    }

    private static class Holder {
        private static final BillPughSingletonDP INSTANCE = new BillPughSingletonDP();

    }

    public static BillPughSingletonDP getInstance() {
        return Holder.INSTANCE;
    }

}
