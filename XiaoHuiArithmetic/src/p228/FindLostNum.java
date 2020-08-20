package p228;

/**
 * 假设一个无序数组里有若干个正整数，范围1~100，其中有98个整数出现了偶数
 * 次，只有2个整数出现了奇数次，如何找出这2个出现奇数次的整数
 */
public class FindLostNum {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 2, 5, 1, 4, 3};
        int[] result = findLostNum(array);
    }

    private static int[] findLostNum(int[] array) {
        //用于存储2个出现奇数次的整数
        return new int[0];
    }
}
