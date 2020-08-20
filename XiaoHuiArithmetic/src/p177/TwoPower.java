package p177;

public class TwoPower {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(8));
        System.out.println(isPowerOf2(16));
    }

    private static boolean isPowerOf2(int num) {
        return (num&num-1)==0;
    }
}
