package p170;

/**
 * 更相减损法
 */
public class MorePhaseSubtraction {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisorV3(25, 5));
        System.out.println(getGreatestCommonDivisorV3(100, 80));
        System.out.println(getGreatestCommonDivisorV3(27, 14));
    }

    private static int getGreatestCommonDivisorV3(int a, int b) {
        if (a == b) {
            return a;
        }
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        return getGreatestCommonDivisorV3(big - small, small);
    }
}
