package task1;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();

        System.out.print("Enter the size of the array: ");
        int size = validator.getIntNumber();

        int[] candles = initArray(size, validator);
        int numberOfMaxCandles = birthdayCakeCandles(candles);
        System.out.println("Number of highest candles: " + numberOfMaxCandles);
    }

    public static int[] initArray(int size, Validator validator) {
        int[] candles = new int[size];
        for (int i = 0; i < candles.length; i++) {
            System.out.print("candles[" + i + "] = ");
            candles[i] = validator.getIntNumber();
        }
        return candles;
    }

    public static int birthdayCakeCandles(int[] candles) {
        int max = getMax(candles);
        int counter = 0;
        for (int value : candles) {
            if (max == value) {
                counter++;
            }
        }
        return counter;
    }

    private static int getMax(int[] candles) {
        int max = candles[0];
        for (int i = 1; i < candles.length; i++) {
            int value = candles[i];
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
