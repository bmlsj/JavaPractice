package prjTest.Exception;

public class ExceptionExam3 {

    // throw
    // 강제로 오류를 발생시킴
    // throws와 보통 같이 사용된다.

    public static void main(String[] args) {
        int i = 10, j = 0;

        try {
            int k = divide(i, j);

            System.out.println(k);
        } catch (IllegalAccessError e){
            System.out.println("0으로 나누면 안됩니다. " + e.toString());
        }

    }

    public static int divide(int i, int j) throws IllegalAccessError{
        if(j ==0){
            throw new IllegalAccessError("0으로 나눌 수 없어요");
        }
        int k = i/j;
        return k;
    }
}
