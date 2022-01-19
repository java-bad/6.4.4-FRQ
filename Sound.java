import java.util.Arrays;

public class Sound {
    // the array of values in this sound; guaranteed not to be null
    private int[] samples = { 40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223 };

    /**
     * Changes those values in this sound that have an amplitude greater than limit
     * Values greater than limit are changed to limit.
     *
     * @param limit the amplitude limit
     *              Precondition: limit >= 0
     * @return the number of values in this sound that this method changed
     */
    public int limitAmplitude(int limit) {
        // Complete this method
        int numChanges = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                numChanges++;
            }
            if (samples[i] < -limit) {
                samples[i] = -limit;
                numChanges++;
            }
        }
        return numChanges;
    }

    public static void main(String[] args) {

        Sound s = new Sound();
        System.out.println("The original array is: " + Arrays.toString(s.samples));
        System.out.println("limitAmplitude(2000) should return 5 " +
                "and returned " + s.limitAmplitude(2000));
        System.out.println("The changed array is: " + Arrays.toString(s.samples));
    }
}
