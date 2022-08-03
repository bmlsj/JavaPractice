package prjTest;

public class Constructor {

    // 14. 생성자
    // 모든 클래스는 인스턴스화 될 때, 생성자 사용
    // 객체가 될 때, 필드를 초기화 하는 역할

    // 특징
    // 1. 리턴 타입이 없다
    // 2. 매개변수가 없어도 생성자가 컴파일 시 자동으로 생성해줌
    // 3. 매개변수가 없는 생성자 = 기본 생성자
    // 4. 생성자를 하나라도 프로그래머가 만들었다면, 기본 생성자는 만들어지지 않는다.



    // this : 현지 객체, 자기자신을 나타냄
    // 클래스 내부에서 자기 자신이 가지고 있는 메소드를 사용할 때도, this.메소드명() 으로 호출 가능

    // ex1) this 사용하지 않을 때
    String name;
    int number;

    public void Constructor(String n){
        name = n;       // 가독성 감소
    }

    // ex2) this 사용 시
    public void Constructor(String name, int number){
        this.name = name;
        // this.name = 클래스의 필드(변수) name
        // 뒤에 name : 매개 변수

        this.number = number;
    }

    public static void main(String[] args) {
        Constructor c2 = new Constructor();
        c2.name = "생성자";
    }
}
