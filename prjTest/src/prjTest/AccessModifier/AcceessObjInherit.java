package prjTest.AccessModifier;

public class AcceessObjInherit extends AccessObj{

    public static void main(String[] args) {
        AcceessObjInherit obj = new AcceessObjInherit();

        System.out.println(obj.p);      // protected
        System.out.println(obj.p2);     // public
        System.out.println(obj.k);      // default
        // System.out.println(obj.i);      // private

    }
}
