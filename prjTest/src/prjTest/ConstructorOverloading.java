package prjTest;

public class ConstructorOverloading {

    // 15. 생성자 오버로딩
    // 이름은 같지만 매개변수가 다른 생성자 여러개 생성 가능

    String name;
    int number;

    public void ConstructorOverloading(String name){
        this.name = name;
    }

    public void ConstructorOverloading(String name, int number){
        this.name = name;
        this.number = number;
    }

    public static void main(String[] args) {

        ConstructorOverloading c2 = new ConstructorOverloading();
        c2.name = "소방차";
        ConstructorOverloading c3 = new ConstructorOverloading();
        c3.name = "구급차";
        c3.number = 1234;


    }

}
