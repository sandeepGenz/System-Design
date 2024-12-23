// Singleton DP with and without multithreading


package src.main.java;


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
