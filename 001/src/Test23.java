/**
 * @author shkstart
 * @create 2019-02-09 13:40
 */
//输出10个斐波那契（Fibonacci）数列：1 1 2 3 5 8 13 21 34 55。（特点：第1,2两个数值为1，从第三个数开始，该数是其前面两个数之和）
public class Test23 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        for (int i=3;i<=10;i++){
            int num = n1 + n2;
            n1 = n2;
            n2 = num;
            System.out.print(" " + num);
        }
    }
}
