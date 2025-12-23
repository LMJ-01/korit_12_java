package ch06_loops;
/*
    중첩 while문(Nested - while)
    형식 :
    while(조건식) {
        반복실행문1-a
        while(조건식) {
            반복실행문2
        }
        반복실행문1-b
    }
    1일차 1교시입니다.
    ...
    1일차 3교시입니다.
    ...
    5일차 1교시입니다.
    ...
    5일차 3교시입니다.
 */
public class Loop03While2 {
    public static void main(String[] args) {
//        int i= 0;
//        while (i <= 90) {
//            int j = 1;
//            while (j <= 10){
//                System.out.print(i + 1 + " ");
//                i++;
//                j++;
//            }
//            System.out.println();
//        }
//        int i= 0;
//        while (i < 100) {
//            int j = 0;
//            while (j < 10){
//                i++;
//                System.out.print(i + " ");
//                j++;
//            }
//            System.out.println();
//        }

//        int i = 1;
//        while (i <= 5){
//            int j = 1; // 초기화
//            while (j <= 3){
//                System.out.println(i + "일차 " + j +"교시 입니다.");
//                j++;
//            }
//            i++;
//
//        }

//        int i = 0;
//        while (i < 5){
//            int j = 0; // 초기화
//            while (j < 3){
//                System.out.println((i + 1) + "일차 " + (j + 1) +"교시 입니다.");
//                j++;
//            }
//            i++;
//        }

        for (int i = 0; i < 5; ++i){
            for (int j = 0; j < 3; ++j) {
                System.out.println((i + 1) + "일차 " + (j + 1) +"교시 입니다.");
            }
            System.out.println();
        }
    }
}

