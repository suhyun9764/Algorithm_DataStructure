package src.algorithm.greedy.until_its_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         1. n을 k로 몇 번 나누어 지는지를 구한다
         2. n을 k로 나눈 나머지를 구한다 (1로 나눈다)
         3. 두 개의 구한 값을 더하고 출력
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(get_result(n, k));


    }

    private static int get_result(int n, int k) {
        int result = 0;
        while (true) {
            int target = (n / k) * k;
            result += (n-target);
            n = target;
            if(n<k){
                break;
            }
            result+=1;
            n/=k;
        }
        result +=(n-1);
        return result;
    }
}
