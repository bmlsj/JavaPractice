package prjTest.Interface;

public class MyCalculator implements Calculator{

    @Override
    public int plus(int i, int j) {
        return i+j;
    }

    @Override
    public int multi(int i, int j) {
        return i*j;
    }

    // default 메소드 overriding 해보기
    public int exec(int i, int j){
        return i-j;
    }
}
