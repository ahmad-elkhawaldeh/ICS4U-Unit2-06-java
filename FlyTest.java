/*
* This program test classes.
*
* @author  Ahamd El-khawaldeh
* @version 1.0
* @since   2021-12-07
*/

/**
* FlyTest.
*/
final class FlyTest {
    /**
    * Constant.
    */
    public static final int TWO_ONE_TWO = 212;

    /**
    * Constant.
    */
    public static final int FOUR_HOUNDRED_TWENTY_TWO = 422;

    /**
    * Constant.
    */
    public static final int FOUR = 4;

    /**
    * Constant.
    */
    public static final int FIVE_THOUSAND = 5000;

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private FlyTest() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Main.
    *
    * @param args are null.
    */
    public static void main(String[] args) {
        final Airplane biplane = new Airplane();
        biplane.setSpeed(TWO_ONE_TWO);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(FOUR_HOUNDRED_TWENTY_TWO);
        System.out.println(boeing.getSpeed());
        int counter = 0;
        while (counter < FOUR) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > FIVE_THOUSAND) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
