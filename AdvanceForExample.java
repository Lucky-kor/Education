import java.util.Scanner;


public class AdvanceForExample {
    public static void main(String[] args) {
        int count;
        int[] scores;
        int sum = 0;
        double avg;

        Scanner scan = new Scanner(System.in);
        System.out.println("몇명의 점수를 입력할까요?");
        count = scan.nextInt();
        scores = new int[count];

        for(int i = 0; i<count; i++){
            System.out.println((i+1)+" 의 점수를 입력해 주세요");
            scores[i]=scan.nextInt();
        }
        for(int j=0; j<scores.length; j++){
            System.out.println((j+1)+" 의 점수는 : "+scores[j]);
        }

        for(int score : scores){
            sum = sum + score;
        }
        avg = (double) sum / scores.length;
        System.out.println("모든 점수의 총합은 "+sum+" 입니다.");
        System.out.println("점수의 평균값은 "+avg+" 입니다.");
    }
}
