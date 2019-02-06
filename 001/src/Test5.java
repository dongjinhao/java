import java.util.Scanner;

/**
 * @author shkstart
 * @create 2019-02-06 17:36
 */
public class Test5 {
    public static void main(String[] args) {
        //根据天数计算周数和剩余的天数，天数是通过键盘输入。
        Scanner input = new Scanner(System.in);
        System.out.print("请输入天数:");
        int day = input.nextInt();
        System.out.println("周数:" + (day/7));
        System.out.println("剩余:"+ day%7 +"天");
    }
}
