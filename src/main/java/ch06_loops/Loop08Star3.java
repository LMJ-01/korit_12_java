package ch06_loops;

import java.util.Scanner;

/*
               *
              **
             ***
            ****
           *****

           *****
            ****
             ***
              **
               *
 */
public class Loop08Star3 {
    public static void main(String[] args) {
        // 개행을 책임지는 for-i문
                // 공백을 책임지는 for-j문 : 공백을 줄여들어야 함.

                // 별을 책임지는 for-k문 ㅣ 별 개수는 늘어나야 함.
        for (int i = 0; i < 6 ; i++) {
            for (int j = 5; j > i; j--){
                System.out.print(" ");
            }
            for( int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for( int k = 5; k  >  i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        //ch07_methods 패키지 생성 -> Method01 -> main을 만들지 않습니다.
    }
}
