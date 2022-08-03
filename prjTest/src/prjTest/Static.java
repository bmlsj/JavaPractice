package prjTest;

public class Static {

    // 12. static 변수
    // - 같은 클래스 내에 있어도 해당 변수들을 사용할 수 없다.
    // - static한 필드나 메소드는 Class가 인스턴스화 되지 않아도 사용 가능하다
    // - static한 변수는 공유된다
    //     -> 저장할 수 있는 공간이 하나만 생성되기 때문

    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;
    }

    public static void main(String[] args) {
        System.out.println(staticVal);      // 사용 가능

        Static s1 = new Static();
        Static s2 = new Static();

        s1.globalScope = 20;
        s2.globalScope = 30;

        System.out.println(s1.globalScope);     // 20
        System.out.println(s2.globalScope);     // 30

        s1.staticVal = 10;
        s2.staticVal = 20;

        System.out.println(s1.staticVal);       // 20 -> 제일 마지막 값이 출력됨
        System.out.println(s2.staticVal);       // 20
    }
}
