package prjTest.Interface;

public class MyCalculatorExam {

    public static void main(String[] args) {
        Calculator cal = new MyCalculator();
        // default 메소드 호출
        int value = cal.exec(5, 10);
        System.out.println(value);

        // static 메소드 호출
        int value2 = Calculator.exec2(5, 10);
        System.out.println(value2);
    }
}
