import java.util.Scanner;

public class DoubleForExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 x \"a\"의 값 + 정수 x \"y\"의 값 = 합계 를 구하는 공식입니다.");
        System.out.println("x와 y는 1 부터 10 까지의 정수이며 합계도 정수여야 합니다.");
        System.out.println("a의 값을 입력해주세요");
        int a = sc.nextInt();
        System.out.println("y의 값을 입력해주세요");
        int y = sc.nextInt();
        System.out.println("합계의 값을 입력해주세요");
        int sum = sc.nextInt();

        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if ((i*a)+(j*y)==sum){
                    System.out.println("("+i+", "+j+")"); }
            }
        }
    }
}
