package prjTest;

public class SumOfDivisor {

    // 약수의 합
    public int solution(int n){
        int ans = 0;
        int i = 1;

        for(;i<=n;i++){
           if(n%i==0){
               ans += i;
           }
        }

        return ans;
    }

    public static void main(String[] args) {

        SumOfDivisor s = new SumOfDivisor();
        int sum = s.solution(12);
        System.out.println(sum);
    }
}
