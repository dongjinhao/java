/**
 * @author shkstart
 * @create 2019-02-03 12:12
 */

/**
 * Java 标识符命名规则
 * 由字母,数字,下划线(_)和美元符号($)组成
 * 不能以数字开头
 * 区分大小写
 * 长度无限制
 * 不能是Java中的关键字和保留字
 * 标识符命名习惯:驼峰命名法,见名知意.以单词或单词组合来命名
 */
public class Test1 {
//    private  int c = 30;
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int myAge = 18;
//        int c;
        //......
//        c = 20;
//        System.out.println(c);

        //八种基本数据类型
//        boolean flag = true;//false
//        byte b = 10;        //一个字节
//        short s = 20;       //两个字节
//        int i = 30;         //四个字节
//        long l = 40;        //八个字节
//        char c = 'A';       //两个字节
//        float f = 20.0F;    //四个字节
//        double d= 30.0D;    //八个字节

        //面试题
//        byte a = 10;
//        byte b1 = 1;
//        a = (byte) (a + 1);
//        System.out.println(a);
        //字节型转换成整型进行计算 所以会报错
        //byte short int 它们三者在计算是都会转换成int类型进行计算
//        int i1 = 0x20;
//        System.out.println(i1);

//        byte b2 = 11;
//        short s2 = b2;
//        int i2 = s2;
//        long l2 = i2;

//        char c2 = 'C';
//        int i3 = c2;
//        System.out.println(i3);

        int i4 = 123456789;
        float f2 = i4;
        System.out.println(f2);
        //整型转换为浮点型 不需要强制转换 但可能会丢失精度 转换为近似值

        //只要涉及货币 不能用double和float

        //boolean类型不能转换为其他类型



    }
}
