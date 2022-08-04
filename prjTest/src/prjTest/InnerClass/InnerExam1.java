package prjTest.InnerClass;

public class InnerExam1 {

    // 1. Class안 인스턴스 변수(필드)를 선언하는 위치에 선언된 내부 클래스
    class Cal{
        int value = 10;
        public void plus(){
            value++;
        }
    }

    public static void main(String[] args) {

        // 객체를 생성해주고 내부 클래스 사용
        InnerExam1 t = new InnerExam1();
        InnerExam1.Cal cal = t.new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
