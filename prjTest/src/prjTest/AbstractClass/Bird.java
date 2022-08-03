package prjTest.AbstractClass;

public abstract class Bird {

    // 추상 클래스
    // : 구체적이지 않는 클래스
    // 내용이 없고 구현되지 않은 메소드를 가짐
    public abstract void sing();
    public void fly(){
        System.out.println("fly");
    }

}
