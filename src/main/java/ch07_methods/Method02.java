package ch07_methods;

import java.util.Scanner;

/*
    지시 사항
    3 개 과목의 점수를 입력 받아서, 총합과 평균 점수를 콘솔창에 표시하시오.

    실행 예
    몇 과목의 점수를 입력하시겠습니까? >>> 3
    1 과목의 점수를 입력하세요 >>> 100
    2 과목의 점수를 입력하세요 >>> 90
    3 과목의 점수를 입력하세요 >>> 95
    총합은 285.0이며, 평균 95.0입니다.
 */
public class Method02 {
    public static void main(String[] args) {
        double sum = 0;
        double avg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        int num = scanner.nextInt();
        for (int j = 0; j < num; j++) {
            System.out.print((j+1) + " 과목의 점수를 입력하시겠습니까? >>> ");
            sum += scanner.nextDouble();
        }
        avg = sum / num;
        System.out.println("총합은 : " +sum + "이며, 평균은 " + avg + "입니다.");
    }
}
