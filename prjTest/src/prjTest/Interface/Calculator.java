package prjTest.Interface;

public interface Calculator {

    public int plus(int i, int j);
    public int multi(int i, int j);

    // default 메소드
    default int exec(int i, int j){
        return i + j;
    }

    // static 메소드
    public static int exec2(int i, int j){
        return i*j;
    }
}
