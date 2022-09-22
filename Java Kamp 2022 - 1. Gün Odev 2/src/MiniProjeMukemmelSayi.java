public class MiniProjeMukemmelSayi {
    public static void main(String[] args) {
        // örn mükemmel sayı 6 > 1,2,3 e bölünür toplamları da 6 olur.
        // 28 >1,2,4,7,14 bölünür toplamı gene 28 olur

        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println("Sayı mükemmel");
        } else {
            System.out.println("Mükemmel sayı değil");
        }
    }
}
