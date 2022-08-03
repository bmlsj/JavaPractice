package prjTest;

public class Enum {

    // 13. Enum 열거형
    // 기존 : 상수 사용의 문제점
    //   - 원했던 값이 아닌 다른 값이 들어와도 전혀 문제가 발생하지 않는다.

    // 상수 예제
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;

        gender1 = Enum.MALE;
        gender1 = "소년";         // female이나 male 외에 다른 값이 들어가도 오류 발생x

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
    }

    // enum 열거형
    enum Gender {
        MALE, FEMALE;
    }


}
