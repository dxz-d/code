package iterview;

/**
 * i++是先赋值，然后再自增；++i是先自增，后赋值
 * 用代码表示    a = i++;则等价于a=i;i=i+1
 * a = ++i;则等价于i=i+1;a=i
 */
public class IandI {
    /*public static void main(String[] args) {
        int i = 1;
        int s = ++i;
        int x = i++;
        System.out.println(i);//i++改变的只有i,++i既改变i,又改变赋值变量
        System.out.println(s);
        System.out.println(x);
    }*/
    /*public static void main(String[] args) {
     *//*int i = 1;
        i = ++i;
        System.out.println(i);*//*
        int i = 1;
        i = i++;
        System.out.println(i);
    }*/
    static int i = 0;

    public static void main(String[] args) {
        /*int i = 0;
        i = i++;
        System.out.println(i);*/
        i = lastAdd();
        System.out.println(i);
        i = firstAdd();
        System.out.println(i);
    }

    //模拟++i的机制
    private static int firstAdd() {
        i = i + 1;
        return i;
    }

    //模拟i++机制
    private static int lastAdd() {
        //操作i前对其值保留副本
        int temp = i;
        i = i + 1;
        //返回副本
        return temp;
    }


}
