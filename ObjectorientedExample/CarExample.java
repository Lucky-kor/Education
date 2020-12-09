package sec03.exam03;

public class CarExample{
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.Company : " + car1.company);
        System.out.println();

        Car car2 = new Car("Own Car");
        System.out.println("car2.Company : " + car2.company);
        System.out.println("car2.Model : " + car2.model);
        System.out.println();

        Car car3 = new Car("Own Car" , "Red");
        System.out.println("car3.Company : "+ car3.company);
        System.out.println("car3.Model : " + car3.model);
        System.out.println("car3.Color : " + car3.color);
        System.out.println();

        Car car4 = new Car("Taxi", "Black" , 200);
        System.out.println("car4.Company : "+ car4.company);
        System.out.println("car4.Model : " + car4.model);
        System.out.println("car4.Color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();
    }
}