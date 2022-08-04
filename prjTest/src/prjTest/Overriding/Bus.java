package prjTest.Overriding;

public class Bus extends Car{
    
    // 오버라이딩
    @Override
    public void run(){
        super.run();        // 부모의 run 메소드 호출
        System.out.println("Bus의 run 메소드");
    }
    
    // 클래스 형변환
    public void ppangppang(){
        System.out.println("빵빵");
    }
}
