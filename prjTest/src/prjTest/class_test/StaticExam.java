package prjTest.class_test;

public class StaticExam {

    public static void main(String[] args) {
        Car taxi = new Car();
        Car suv = new Car();

        taxi.wheelCount = 10;
        suv.wheelCount = 4;

        System.out.println("taxi의 바퀴 수 : " + taxi.wheelCount);      // 4
        System.out.println("suv의 바퀴 수 : " + suv.wheelCount);        // 4

        taxi.globalVal = 10;
        suv.globalVal = 20;

        System.out.println("taxi의 수 : "+taxi.globalVal);            // 10
        System.out.println("suv의 수 : " + suv.globalVal);            // 20
    }
}
