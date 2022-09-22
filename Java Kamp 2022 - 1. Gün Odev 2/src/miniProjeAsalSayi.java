public class MiniProjeAsalSayi {
    public static void main(String[] args) {
        // Asal sayı bulma uygulaması demo
        int number = 3;
        int remainder = number % 2;
        System.out.println(remainder);

        // kendi basit cözümüm
        // bulamadım :(

        // hoca cozum
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}
