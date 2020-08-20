package p167;

/**
 * 问题描述:如何求出休达公约数
 */

//暴力枚举法,哈哈,效率有点吃力+
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(getGreatCommonDivisor(25, 5));
        System.out.println(getGreatCommonDivisor(100, 80));
        System.out.println(getGreatCommonDivisor(27, 14));
    }

    private static int getGreatCommonDivisor(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        for (int i = small / 2; i > 1; i--) {
            if (small % i == 0 && big % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

