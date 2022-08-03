package prjTest.AnotherPackageAM;

import prjTest.AccessModifier.AccessObj;

public class AccessObjInheritExam extends AccessObj {

    public static void main(String[] args) {
        AccessObjInheritExam obj = new AccessObjInheritExam();

        System.out.println(obj.p);      // protected    // 다른 패키지에서는 사용 불가하지만, AccessObj를 상속 받으므로 사용 가능
        System.out.println(obj.p2);     // public
        // System.out.println(obj.k);      // default  -> 다른 패키지에서 사용 불가
        // System.out.println(obj.i);      // private

    }
}
