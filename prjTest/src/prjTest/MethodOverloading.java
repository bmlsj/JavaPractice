package prjTest;

public class MethodOverloading {

    // 15. 메소드 오버로딩
    // 이름은 같지만 매개변수가 다른 메소드 생성 가능

    public int plus(int x, int y) {
        return x + y;
    }

    public int plus(int x, int y, int z) {
        return x + y + z;
    }

    public String plus(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();

        System.out.println(m.plus(5, 10));
        System.out.println(m.plus(1, 2, 3));
        System.out.println(m.plus("hello", " world"));
    }
}
