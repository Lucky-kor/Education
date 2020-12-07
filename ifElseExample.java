import java.util.Scanner;

public class ifElseExample {
    public static <scanner> void main(String[] args) {
//        int score = 85;
        Scanner sc = new Scanner(System.in);
        int score;
        score = sc.nextInt();
        if(score >= 90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }else{
            System.out.println("점수가 90보다 낮습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
