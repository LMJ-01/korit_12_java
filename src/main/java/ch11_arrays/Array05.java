package ch11_arrays;
/*
    메서드로 정의하셔도 되고, main에 바로 해도 상관없는 과제
    String[] scores 배열에
    A / B / C / D / F element로 초기화하고
    실행 예
    A+ / B+ / C+ / D+ / F
    가 되도록 코드를 작성하시오.
 */
public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A" , "B", "C", "D", "F"};
        // 전체 +를 붙인다면
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i].equals("F")) {
//                System.out.println(scores[i]);
//                break;
//            }
//            System.out.print(scores[i] + "+ /");
//        }
        Array05 array05 = new Array05();
        array05.printElement(scores);
    }

    public void printElement(String[] addPlus) {
        for (int i = 0; i < addPlus.length - 1; i++) {
            System.out.print(addPlus[i] + "+ /");
        }
        System.out.print(addPlus[addPlus.length - 1]);
    }

    // addPlus() 메서드로 정의하시오. - 과제
}
