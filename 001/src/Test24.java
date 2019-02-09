/**
 * @author shkstart
 * @create 2019-02-09 13:50
 */
//多重循环
public class Test24 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
