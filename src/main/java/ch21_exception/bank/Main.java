package ch21_exception.bank;

import ch10_access_modifier.bank.BankMain;
import ch21_exception.scores.InvalidScoreException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private int balance = 10000;    // 이렇게 쓰면 getter 써서 불러와서 따져야하네요.

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException( "잔액이 부족합니다. (부족 금액: " + (amount - balance) + "원 )");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main bank = new Main();

        try {
            System.out.println("현재 잔액 : " + bank.balance + "원");
            System.out.print("출금할 금액을 입력하세요. >>> ");
            int amount = scanner.nextInt();
            bank.withdraw(amount);
            bank.balance =bank.balance - amount;
            System.out.println(amount + " 금액이 출금되었습니다.");
            System.out.println("출금 후 잔액 : " + (bank.balance) + "원");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
        System.out.println(bank.balance);
    }
}
