import java.util.Scanner;

/**
 * @author shkstart
 * @create 2019-02-09 15:22
 */
//三目运算符
public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.println(s>=60?"及格":"挂科");

        int i = 7> 9? 3:4;
        System.out.println(i);
    }
}
