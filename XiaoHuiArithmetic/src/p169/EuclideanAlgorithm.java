package p169;

/**
 * 找出最大公约数
 * 辗转相除法又称欧几里得算法
 * Ctul+L+Alt  快速整个代码格式
 * Alt+Insert   快速创建类
 */
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisortV2(25, 5));
        System.out.println(getGreatestCommonDivisortV2(100, 80));
        System.out.println(getGreatestCommonDivisortV2(27, 14));
    }

    private static int getGreatestCommonDivisortV2(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        return getGreatestCommonDivisortV2(big % small, small);
    }
}
