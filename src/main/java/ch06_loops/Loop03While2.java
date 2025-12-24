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

//        for (int i = 0; i < 5; ++i){
//            for (int j = 0; j < 3; ++j) {
//                System.out.println((i + 1) + "일차 " + (j + 1) +"교시 입니다.");
//            }
//            System.out.println();
//        }

//        int day = 1;
//        while (day < 6) {
//            int lesson = 1;     // 반복실행문1-a
//            while (lesson < 4) {
//                System.out.println(day + "일차 " + lesson +"교시 입니다." );   // 반복실행문2
//                lesson++;
//            }
//            System.out.println("😎");
//            day++;  // 반복실행문1-b
//            System.out.println(lesson);
//        }
        //System.out.println(lesson);
        // 이상의 코드가 오류가 나는 이유는 추후 설명 예정이지만 도입된 개념은 scope(범위), global(전역), local(지역)에 해당합니다.

        /*
            이상의 중첩 while문을 분석하여
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            ...
            9 x 9 = 81
            을 출력하시오.
         */
        int num1 = 2;
        while (num1 < 10) {
            int num2 = 1;     // 반복실행문1-a
            while (num2 < 10) {
                System.out.println(num1 + " x " + num2 + " = " + num1 * num2);   // 반복실행문2
                num2++;
            }
            System.out.println("😎");
            num1++;  // 반복실행문1-b

        }
    }
}

