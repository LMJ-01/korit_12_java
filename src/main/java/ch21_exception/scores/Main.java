package ch21_exception.scores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void checkScore(int score) throws  InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("점수는 0~100점 사이여야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");

        try {
            int score = scanner.nextInt();
            checkScore(score);
            System.out.println(score + " 점수가 성공적으로 저장되었습니다.");
        }
        catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다.");
        }
        finally {
            System.out.println("시스템을 종료합니다.");
        }

    }
}
