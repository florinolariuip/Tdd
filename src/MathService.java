public class MathService {
    public static boolean isLeapYear(final int year) {
        return isDivisible(year, 4) && (!isDivisible(year, 100) || isDivisible(year, 400));
    }

    private static boolean isDivisible(int value, int denominator) {
        return value % denominator == 0;
    }
}
