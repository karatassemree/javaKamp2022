public class miniProjeAsalSayi {
    public static void main(String[] args) {
        // Asal sayı bulma uygulaması demo
        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);

        // kendi basit cözümüm
        if (number % 2 == 1) {
            if (number / number == 1) {
                System.out.println("asal");
            } else {
                System.out.println("asal değil");
            }
        } else {
            System.out.println("asal değil");
        }

        // hoca cozum
        boolean isPrime = false;
        for (int i = 2; i < number; i++) {
            //
        }
    }
}
