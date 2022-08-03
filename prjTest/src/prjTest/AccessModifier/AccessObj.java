package prjTest.AccessModifier;

public class AccessObj {

    // 1. public
    //      : 어떤 클래스든 접근할 수 있다는 것을 의미
    // 2. protected
    //      : 자기 자신, 같은 패키지, 서로 다른 패키지라도 상속받은 자식 클래스에서는 접근할 수 있다는 것을 의미
    // 3. private
    //      : 자기 자신만 접근할 수 있다는 것을 의미
    // 4. default
    //      : 접근 제한자를 적지 않는 경우. 자기 자신과 같은 패키지에서만 접근할 수 있다는 것을 의미


    private int i = 1;
    int k = 2;      // default 접근 제한자
    public int p = 3;
    protected int p2 = 4;


}
