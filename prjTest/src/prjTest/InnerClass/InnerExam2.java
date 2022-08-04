package prjTest.InnerClass;

public class InnerExam2 {

    // 2. 내부 클래스가 static으로 정의된 경우

    static class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }

    public static void main(String[] args) {

        // InnerExam2 객체를 생성할 필요없이 바로 객체 생성
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
