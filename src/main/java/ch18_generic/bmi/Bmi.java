package ch18_generic.bmi;

public class Bmi {

    private double calcBmi(Person person) {
        double bmi =0;
        String name = person.getName();
        double height = person.getHeight() * 0.01;  // 여기서만 m법으로 쓰니까 별개의 변수를 선언하지 않았습니다.
        double weight = person.getWeight();

        bmi = weight / (height*height);
        System.out.println(bmi);
        return bmi;
    }

    public void printResult(Person person) {
        String name = person.getName();
        double height = person.getHeight();
        double weight = person.getWeight();
        double bmi = calcBmi(person);
        String bmiLevel = "";

        if (bmi > 35) {
            bmiLevel = "3단계 비만";
        } else if (bmi > 30) {
            bmiLevel = "2단계 비만";
        } else if (bmi > 25) {
            bmiLevel = "1단계 비만";
        } else if (bmi > 23) {
            bmiLevel = "비만 전 단계";
        } else if (bmi > 18.5) {
            bmiLevel = "정상";
        }
        else bmiLevel = "저체중";

        System.out.println(name  + " 님의 키는 " + height + " cm이고 몸무게는 " + weight + " kg이고 bmi 지수는 " + bmi + "으로 " + bmiLevel + " 입니다.");

    }
}
