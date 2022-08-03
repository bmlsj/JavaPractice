package prjTest;

public class Scope {

    // 11. Scope : 변수의 사용 가능한 범위

    int globalScope = 10;

    public void scopeTest(int value){
        int localScope = 10;
        System.out.println(globalScope);    // 전역 변수
        System.out.println(localScope);     // 지역 변수
        System.out.println(value);          // 함수 매개변수
    }

    public static void main(String[] args) {

        Scope s = new Scope();
        s.scopeTest(5);

        // System.out.println(globalScope); // 오류
        // 같은 클래스 안이지만 globalScope 변수를 사용 할 수 없다.
        // main은 static한 메소드이기 때문 -> static 한 메서드에서는 static 하지 않은 필드를 사용할 수 없다.
    }


}
