import java.util.Scanner;

public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("몇단까지 계산해드릴까요? (숫자로 입력해주세요)");
        number = sc.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println(" *** "+i+"단 *** ");
            for(int j=1;j<10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
    }
}
