package ch11_arrays;

import java.util.Scanner;

/*

 */
public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        students = scanner.nextInt();
        scanner.nextLine();

        String[] student = new String[students];

        for (int i = 0; i < student.length; i++) {
            System.out.print((i + 1) + " 번 학생의 이름을 등록하세요 >>> ");
            student[i] = scanner.nextLine();
        }

        double[] score = new double[students];

        double sum = 0;

        for (int i = 0; i < student.length; i++) {
            System.out.print((i + 1) + " 번 학생의 점수를 입력하세요 >>> ");
            score[i] = scanner.nextDouble();
            sum += score[i];
        }
        System.out.println("학생들의 점수 총합은 " + sum + "입니다.");
    }
}
