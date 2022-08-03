package prjTest;

public class This {


    // 자기 생상자 호출하는 this
    String name;
    int number;

    // ex1) 코드가 중복이 일어나 오류 발생
    public void This() {
        this.name = "이름없음";
        this.number = number;
    }


    // ex2) 자신의 생성자 호출

    public This() {
        this("이름 없름", 0);
    }

    public This(String name) {
        this(name, 0);
    }

    public This(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static void main(String[] args) {
        This t1 = new This();
        This t2 = new This("생성자");
        This t3 = new This("생성자", 10);

        System.out.println(t1.name + " " + t1.number);
        System.out.println(t2.name + " " + t2.number);
        System.out.println(t3.name + " " + t3.number);

    }

}
