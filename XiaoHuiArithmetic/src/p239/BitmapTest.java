package p239;

/**
 * a+=b的意思a=a+b
 * 同理：a|=b就是a=a|b
 */
public class BitmapTest {

    //每一个word是一个long类型元素，对应一个64位二进制数据
    private long[] words;
    //Bitmsp的位数大小
    private int size;

    public BitmapTest(int size){
        this.size = size;
        this.words = new long[(getWordIndex(size-1)+1)];
    }

    public static void main(String[] args) {
        BitmapTest bitmap = new BitmapTest(128);
        bitmap.setBit(126);
        bitmap.setBit(75);
        System.out.println(bitmap.getBit(126));
        System.out.println(bitmap.getWordIndex(78));
    }

    /**
     * 把Bitmap某一位设置为true
     * @param bitIndex  位图的第bitIndex位
     */
    private void setBit(int bitIndex) {
        if (bitIndex<0||bitIndex>size-1){
            throw new IndexOutOfBoundsException("超出Bitmap有效范围");
        }
        int wordIndex = getWordIndex(bitIndex);
        //意思就是word[wordIndex]=words[wordIndex]|(1L<<bitIndex)
        words[wordIndex] |= (1L<<bitIndex);

    }


    /**
     * 判断Bitmap某一位的状态
     *
     * @param bitIndex 位图的第bitIndex位
     * @return
     */
    private boolean getBit(int bitIndex) {
        if (bitIndex < 0 || bitIndex > size - 1) {
            throw new IndexOutOfBoundsException("超过Bitmap有效范围");
        }
        int wordIndex = getWordIndex(bitIndex);
        return (words[wordIndex] & (1L<<bitIndex))!=0;
    }

    /**
     * 定位Bitmap某一位所对应的word
     * @param bitIndex  位图的第bitIndex位
     * @return
     */
    private int getWordIndex(int bitIndex) {
        return bitIndex >> 6;
    }
}
