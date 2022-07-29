public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives --;
        System.out.println(lives);

        int gift = 100 + lives++;
        System.out.println(gift); //104

        gift = 100+  ++lives;
        System.out.println(gift); //106

    }
}
