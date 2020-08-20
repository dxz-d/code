package p200;

/**
 * 给出一个整数，从该整数中去掉k个数字，要求剩下的数字形成的新整数尽可能小
 * 依次球的局部最优解，最终得到全局最优解的思想，叫做贪心算法
 *
 * charAt()方法：用于返回指定索引处的字符。索引范围从0到length()-1
 *         语法：public char charAt(int index)
 *         参数：index--字符的索引
 *       返回值：返回指定索引处的字符
 *
 * substring()方法：返回字符串的子字符串
 *            语法：public String substring(int beginIndex)
 *               或public String substring(int beginIndex,int endIndex)
 *            参数：beginIndex--起始索引(包括)，索引从0开始
 *                 endIndex--结束索引(不包括)
 *           返回值：字符串
 *
 */
public class GreedyAlgorithm {
    public static void main(String[] args) {
        System.out.println(removeDigits("1593212", 3));
        System.out.println(removeDigits("30200", 1));
        System.out.println(removeDigits("10", 2));
        System.out.println(removeDigits("547120936", 3));
    }

    /**
     * 删除整数的k个数字，获得删除后的最小值
     *
     * @param num 原整数
     * @param k   删除数量
     * @return
     */
    private static String removeDigits(String num, int k) {
        String numNew = num;
        for (int i = 0; i < k; i++) {
            boolean hasCUt = false;
            //从左向右遍历，找到比自己右侧数字大的数字并删除
            for (int j = 0; j < numNew.length() - 1; j++) {
                if (numNew.charAt(j) > numNew.charAt(j + 1)) {
                    numNew = numNew.substring(0, j) + numNew.substring(j + 1, numNew.length());
                    hasCUt = true;
                    break;
                }
            }
            //如果没有找到要删除的数字，则删除最后一个数字
            if (!hasCUt) {
                numNew = numNew.substring(0, numNew.length() - 1);
            }
            //清除整数左侧的数字0
            numNew = removeZero(numNew);
        }
        //如果整数的所有数字都被删除了，直接返回0
        if (numNew.length() == 0) {
            return "0";
        }
        return numNew;
    }

    private static String removeZero(String num) {
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(0) != '0') {
                break;
            }
            num = num.substring(1, num.length());
        }
        return num;
    }
}
