public class WhileExample1 {
    public static void main(String[] args) {
        int i=0; //1번 주사위의 값
        int j=0; //2번 주사위의 값
        int sum=0; //주사위의 합계
        while(sum!=5){
            i=(int)(Math.random()*6)+1;
            j=(int)(Math.random()*6)+1;
            System.out.println("("+i+", "+j+")");
            sum=i+j;
        }
        System.out.println("두 주사위의 합이 5이므로 더이상 주사위를 굴리지 않습니다.");
    }
}
