package prjTest.Exception;

public class BizService {
    public void bizMethod(int i) throws BizException {
        System.out.println("비즈니스 로직이 시작합니다.");

        if(i<0){
            throw new BizException("매개변수 i는 0이상이어야 한다.");
        }
        System.out.println("비즈니스 로직이 종료됩니다.");
    }
}
