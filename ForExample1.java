import java.util.Scanner;

public class ForExample1 {
    public static void main(String[] args) {
        int maxnumber;
        int sum = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("구하고자 하는 최대값을 입력해주세요");
        maxnumber = sc.nextInt();
        System.out.println("배수로 사용하는 숫자를 입력해주세요");
        number = sc.nextInt();
        for (int i=1; i<=maxnumber; i++){
            if(i%number == 0){ sum+=i; } //나머지가 0일경우 number의 배수값이며, 총합에 더해준다.
        }
        System.out.println("1부터 "+maxnumber+"까지의 숫자중 "+number+"까지의 값을 더한 값은 "+sum+"입니다.");
    }
}
