/**
 * @author shkstart
 * @create 2019-02-09 14:23
 */
public class Test26 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=5;j>=1;j--){
                if (j<=i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
