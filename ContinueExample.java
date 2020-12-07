import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        number = sc.nextInt();
        System.out.println("홀수를 제외한 짝수만 출력합니다.");
        for (int i=0;i<=number;i++){
            if ( i%2 !=0 ){ continue; }
            System.out.println(i);
        }
    }
}
