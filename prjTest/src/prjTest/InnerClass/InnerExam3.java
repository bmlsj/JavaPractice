package prjTest.InnerClass;

public class InnerExam3 {

    // 3. 메소드 안에 선언된 내부 클래스

    public void exec(){
        class Cal{
            int value = 0;
            public void plus(){
                value++;
            }
        }

        // 메소드 안에서 해당 클래스 이용 가능
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
