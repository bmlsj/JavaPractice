package prjTest.Overriding;

public class BusExam {

    public static void main(String[] args) {
        Bus b = new Bus();
        b.run();    // 항상 자식클래스의 run 메소드가 먼저 호출됨
                    // 부모 클래스의 run 메소드를 사용하려면 super() 사용

        // 클래스 형변환
        Car car = new Bus();
        car.run();

        Bus bus = (Bus)car;
        bus.run();
        bus.ppangppang();
    }
}
