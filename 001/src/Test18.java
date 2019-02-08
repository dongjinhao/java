/**
 * @author shkstart
 * @create 2019-02-08 8:22
 */
/**
 * 打印100以内所有的奇数，偶数和3的倍数（不包括100）
 */
public class Test18 {
    public static void main(String[] args) {
        int i = 1;
        while (i<100){

            if (i%2 == 0){
                System.out.println(i + "为偶数");
            }
            else {
                System.out.println(i + "为奇数");
            }

            if (i%3 == 0){
                System.out.println(i + "为3的倍数");
            }
            i++;

        }
    }
}
