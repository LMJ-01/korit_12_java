package ch11_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    writeNameAndScore
    Array03Method 클래스를 생성해서 Array02에서 작성한 부분을 method화 하시오.
 */
public class Array02 {
    public static void main(String[] args) {
        // 여기 윗부분에 Array02 과제를 작성하시면 됩니다.
        // 사용할 class 선언
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        // humans 와 scores의 배열 element 개수를 받는 변수 선언 및 초기하
        int num = scanner.nextInt();
        scanner.nextLine(); // 배리어 역할을 하는 scanner.nextLine();
        // 빈 배열들을 선언
        String[] humans = new String[num];
        double[] scores = new double[num];
        // humans의 element 값을 채우기 위한 반복문 작성
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + " 번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine();
        }
        // scores의 element 값을 채우기 위한 반복문
        double sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.print(humans[i] + " 번 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }
        // 이상에 서 값을 입력하고 그 걸 그대로 double sum 변수에 더했을 확률이 높습니다.
//        for (int i = 0; i < num; i++) {
//            sum += scores[i];
//        }
        // 별개로 해보겠습니다.
//        System.out.println("영어권개발자들이 하는 방식 : " + Arrays.stream(scores).sum());
        System.out.println("(우리가 배운 방식)학생들의 점수 총합은 " + sum + "입니다.");

        // Array03Method 객체 만들어서 메서드를 호출하면 되겠네요.
//        Array03Method array03Method = new Array03Method();
//        array03Method.writeNameAndScore();
    }
}
