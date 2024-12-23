package src.main.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

    public static void main(String[] args)
    {
//        TVSet tvSet1 = TVSet.getTvSetInstance();
//        TVSet tvSet2 = TVSet.getTvSetInstance();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(()-> TVSet.getTvSetInstance());
        executorService.execute(()-> TVSet.getTvSetInstance());
        executorService.execute(()-> TVSet.getTvSetInstance());
        executorService.execute(()-> TVSet.getTvSetInstance());
        executorService.execute(()-> TVSet.getTvSetInstance());
        executorService.execute(()-> TVSet.getTvSetInstance());



    }

}
