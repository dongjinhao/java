import java.util.Scanner;
/**
 * @author shkstart
 * @create 2019-02-03 17:19
 */
public class Test3 {
    public static void main(String[] args) {
        //通过键盘输入声明初始化一个圆柱体的高和底面半径,π值是3.14,求圆柱体的体积,  并显示输出圆柱体的体积; π(r^2)。
        Scanner input = new Scanner(System.in);
        System.out.print("请输入高:");
        int h = input.nextInt();
        System.out.print("请输入半径:");
        int r = input.nextInt();
        System.out.println("圆柱体的体积为" + 3.14 * h * r *r);
    }
}
