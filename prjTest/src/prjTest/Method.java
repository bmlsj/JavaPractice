package prjTest;

public class Method {

    // 10. 메소드
    // 함수 역할

    // 1) 매개 변수x, 리턴x
    public void method1() {
        System.out.println("method1");
    }

    // 2) 매개 변수O, 리턴X
    public void method2(int x) {
        System.out.println("method2");
    }

    // 3) 매개 변수X, 리턴o
    public int method3() {
        System.out.println("method3");
        return 10;
    }

    // 4) 매개 변수O, 리턴O
    public int method4(int y) {
        System.out.println(y + "를 이용한 method4");
        return y;
    }

    public static void main(String[] args) {
        Method m1 = new Method();

        m1.method1();
        m1.method2(10);

        int x = m1.method3();
        System.out.printf("method3이 리턴한 %d\n", x);

        int x2 = m1.method4(50);
        System.out.println(x2);
    }


}
