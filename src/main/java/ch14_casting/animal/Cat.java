package ch14_casting.animal;

public class Cat extends Ainmal{
    @Override
    public void makeSound() {
        System.out.println("고양이가 웁니다.");
    }

    // 고유 메서드
    public void undadada() {
        System.out.println("고양이가 우다다다 거립니다.");
    }
}
