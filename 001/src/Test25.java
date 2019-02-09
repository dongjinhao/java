/**
 * @author shkstart
 * @create 2019-02-09 14:16
 */
//九九乘法表
public class Test25 {
    public static void main(String[] args) {

        for (int i=1;i<=9;i++){     //控制行数
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
