package prjTest.InnerClass;

public class ActionExam {

    public static void main(String[] args) {

        // 익명 클래스 사용하지 않을떼
        Action action1 = new MyAction();
        action1.exec();

        // 익명 클래스 사용시
        Action action2 = new Action() {
            @Override
            public void exec() {
                System.out.println("익명 클래스");
            }
        };

        action2.exec();
    }
}
