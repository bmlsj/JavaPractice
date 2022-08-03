package prjTest;

public class StringMethod {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.length());

        String str1 = new String("hello");

        // 문자열 붙이기 - concat
        System.out.println(str1.concat(" world"));  // 문자열 합치기 => hello world
        System.out.println(str1);       // hello

        // 문자열 자르기 - subString
        System.out.println(str1.substring(1, 3));   // index 1~3번까지의 결과
        System.out.println(str1.substring(2));      // index 2에서 마지막까지의 결과

    }
}
