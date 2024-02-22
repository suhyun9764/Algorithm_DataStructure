package src.algorithm.greedy.Problem_change;

public class Main {
    public static void main(String[] args) {
        int n = 1260;   //거슬러 줘야 할 금액
        int[] coinTypes = {500,100,50,10}; // 거슬러 줄 수 있는 동전의 종류
        int cnt = 0;
        for (int coinType : coinTypes) { // 큰 금액부터 거슬러주기
            cnt += n/coinType;
            n=n%coinType;
        }
        System.out.println(cnt);
    }
}
