package prjTest.Exception;

public class ExceptionExam1 {

    // 예외 처리
    public static void main(String[] args) {
        
        int i = 10, j = 0;
        
        try{
            int k = i/j;
            System.out.println(k);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다 : "+e.toString());
        }finally {
            System.out.println("무조건 실행되는 부분");
        }
    }
    
}
