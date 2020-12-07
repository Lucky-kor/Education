i44mport java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        boolean run = true;
        int number;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);





        while(run){
            System.out.println("---------------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.println("선택 > ");
            number = scanner.nextInt();
            if(number==1){
                System.out.println("예금액>");
                balance+=scanner.nextInt();
            }else if(number==2){
                System.out.println("출금액>");
                balance-=scanner.nextInt();
            }else if(number==3){
                System.out.println("잔고>"+balance);
            }else if(number==4){
                System.out.println("");
                run=false;
            }else{
                System.out.println("오류!! 1~4까지의 숫자를 입력해주세요!!!");
            }
        }
        System.out.println("프로그램 종료");
    }
}
