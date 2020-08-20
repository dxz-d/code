package p174;

public class TwoPower {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(32));
        System.out.println(isPowerOf2(88));
    }

    private static boolean isPowerOf2(int num) {
        int temp = 1;
        while (temp <= num) {
            if (temp == num) {
                return true;
            }
            //第一次:temp = temp * 2;
            //第二种:
            temp = temp<<1;
        }
        return false;
    }
}
