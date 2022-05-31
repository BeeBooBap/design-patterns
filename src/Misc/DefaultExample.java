package Misc;


/**
 * Contains an implemented method that all classes will inherit when implementing interface
 */
public interface DefaultExample {

    void cook();

    void sell();

    double refund();

    default double takePayment() {
        return 100 * 0.5;
    }

}
