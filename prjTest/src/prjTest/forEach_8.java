package prjTest;

public class forEach_8 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // 기존 배열 출력
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = {10, 20, 30, 40, 50};
        // forEach 구문
        for(int i:arr2){
            System.out.println(i);
        }
    }
}
