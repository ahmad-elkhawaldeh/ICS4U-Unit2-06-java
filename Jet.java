/*
* This is the Jet class.
*
* @author Ahmad El-khawaldeh
* @version 1.0
* @since 2021-12-27
*/

/**
 * Jet.
 */
public class Jet extends Airplane {
    /**
     * Constant.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Method.
     *
     * @param speed ok.
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * Method.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }

}
