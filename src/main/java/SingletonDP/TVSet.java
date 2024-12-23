package src.main.java.SingletonDP;

public class TVSet {

    private static volatile TVSet tvSetInstance = null;

    private TVSet(){
//        System.out.println("Called");
    }

    public static TVSet getTvSetInstance()
    {
        if(tvSetInstance == null)
        {
            synchronized(TVSet.class) { // locking

                if(tvSetInstance == null)
                {
                    tvSetInstance = new TVSet();
                }

            }

        }

        return tvSetInstance;
    }

}
