package Misc;

public class DefaultImpl implements DefaultExample {
    @Override
    public void cook() {
        System.out.println("Cooking");
    }

    @Override
    public void sell() {
        System.out.println("Selling");
    }

    @Override
    public double refund() {
        return 0.0;
    }

}
