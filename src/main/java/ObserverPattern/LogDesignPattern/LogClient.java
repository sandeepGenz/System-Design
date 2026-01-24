package src.main.java.ObserverPattern.LogDesignPattern;

public class LogClient {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.addObserver(new ConsoleLogger());
        logger.addObserver(new FileLogger());

        logger.log("TO DOCKER");
        logger.log("TO K8's");
    }
}
