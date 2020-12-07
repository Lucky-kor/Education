import java.util.Scanner;

public class ForStarExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별의 갯수를 입력해주세요");
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
