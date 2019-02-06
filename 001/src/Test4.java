import java.util.Scanner;
/**
 * @author shkstart
 * @create 2019-02-06 17:03
 */
public class Test4 {
    public static void main(String[] args) {
        //定义一个五位整数，求各个位上的数的和。
        int num = 98765;
        int w = num / 10000;
        int q = num / 1000 % 10;
        int b = num / 100 % 10;
        int s = num / 10 % 10;
        int g = num % 10;
        System.out.println("和为:" +( w + q + b + s + g ));
    }
}
