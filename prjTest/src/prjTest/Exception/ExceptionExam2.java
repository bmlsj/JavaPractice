package prjTest.Exception;

public class ExceptionExam2 {

    // Throw
    // 예외를 호출한 쪽에서 처리하도록 던져줌

    public static void main(String[] args) {
        int i = 10, j = 0;

        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다. " + e.toString());
        }

    }

    public static int divide(int i, int j) throws ArithmeticException{
        int k = i/j;
        return k;
    }
}
