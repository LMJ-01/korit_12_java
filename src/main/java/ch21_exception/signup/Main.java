package ch21_exception.signup;

import ch21_exception.scores.InvalidScoreException;

import java.util.Scanner;

public class Main {
    public static void checkId(String id) throws InvalidIdException {
        if (id.length() <  8) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 >>> ");

        try {
            String id = scanner.nextLine().trim();
            checkId(id);
            System.out.println(id + " 아이디가 성공적으로 저장되었습니다.");
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("시스템을 종료합니다.");
        }
    }
}
