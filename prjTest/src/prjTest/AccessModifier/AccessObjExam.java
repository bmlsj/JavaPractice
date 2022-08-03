package prjTest.AccessModifier;

public class AccessObjExam {

    public static void main(String[] args) {
        AccessObj obj = new AccessObj();

//        System.out.println(obj.i);    -> private로 선언했으므로 사용 불가
        System.out.println(obj.k);       // default : 다른 패키지에 있을 경우 사용 불가
        System.out.println(obj.p);
        System.out.println(obj.p2);      // protected : 다른 패키지에 있을 경우 사용 불가
    }

}
