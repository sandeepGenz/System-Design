package src.main.java.SingletonDP;

public class TVSet {

    private static TVSet tvSetInstance = null;

    private TVSet(){

    }

    public static TVSet getTvSetInstance()
    {
        if(tvSetInstance == null)
        {
            tvSetInstance = new TVSet();
        }

        return tvSetInstance;
    }

}
