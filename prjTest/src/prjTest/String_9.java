package prjTest;

public class String_9 {

    public static void main(String[] args) {

        // 9. String 클래스
        // 불변 클래스이므로 값 수정 불가


        // 1) 같은 인스턴스를 참조하는 변수들
        String str1 = "hello";
        String str2 = "hello";

        // 2) new로 생성한 인스턴스
        //  -> 인스턴스가 새롭게 만들어지기 때문에 서로 다른 인스턴스 참조
        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2){
            System.out.println("str1 == str2");
        }

        if(str1!=str3){
            System.out.println("str1 != str3");
        }

        if(str3!=str4){
            System.out.println("str3 != str4");
        }
        
        // 3) 인스턴스가 아닌 변수가 저장한 문자열을 비교하고 싶을 때
        if (str1.equals(str3)){
            System.out.println("str1은 str3과 같은 값을 가진다");
        }else {
            System.out.println("str1 != str3s");
        }


        // 4) 필드 선언
        // 필드 : class가 가진 속성(객체의 속성)
        class Car{
            String name;    // 속성1
            int number;     // 속성2
        }

        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1004;
    }
}
