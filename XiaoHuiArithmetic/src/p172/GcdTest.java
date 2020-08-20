package p172;

/**
 * 移位和更相减损法相结合
 * 1.java中1个&是两个数字进行比较,两个&&是布尔类型的值进行比较
 * 相同点:都是比较的意思
 *
 * 2.<<和>>是Java中的移位运算符,<<是左移位,>>是右位移,因为数据存储是二进制的,所以左移
 * 1相当于乘以2的1次方,右移相当于乘以2的-1次方,例如:
 * <<:左移运算符,num<<1,相当于num乘以2,num<<2,相当于num乘以2再乘以2
 * >>:右移运算符,num>>1,相当于num除以2,num>>2,相当于num除以2再除以2
 */
public class GcdTest {
    public static void main(String[] args) {
        System.out.println(gcd(25, 18));
        System.out.println(gcd(33, 27));
        System.out.println(gcd(25, 63));
    }

    private static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd(a >> 1, b >> 1) << 1;
        } else if ((a & 1) == 0 && (b & 1) != 0) {
            return gcd(a >> 1, b);
        } else if ((a & 1) != 0 && (b & 1) == 0) {
            return gcd(a, b >> 1);
        } else {
            int big = a > b ? a : b;
            int small = a < b ? a : b;
            return gcd(big - small, small);
        }
    }
}
