import java.util.Scanner;

public class ForStarExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별의 갯수를 입력해주세요");
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            for(int j=number;j>0;j--){
                if(j>i+1){ System.out.print(" "); }
                else { System.out.print("*"); }
            }
            System.out.println("");
        }
    }
}
