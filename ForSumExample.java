import java.util.Scanner;

public class ForSumExample {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i=0; i<number; i++){
            int j;
            j = i+1;
            sum += j;
        }
        System.out.println("1부터 "+number+" 까지의 합을 구합니다.");
        System.out.println("총 합은 "+sum+" 입니다.");
    }
}
