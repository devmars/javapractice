package practice;

public class RandomNumber {

    public static void main(String[] args) {
        System.out.println(getRandomNumber());
    }

    public static int getRandomNumber() {
        while (true) {
            int num = (int) (Math.random() * 20) * 1;
            if (num != 12) {
                return num;
            }
        }
    }
}
