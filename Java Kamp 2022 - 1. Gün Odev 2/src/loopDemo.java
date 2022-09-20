public class loopDemo {
    public static void main(String[] args) {

        // for
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Sayı : " + i);
        }
        System.out.println("For Döngüsü Bitti.");

        // while
        int i = 2;
        while (i < 10) {
            System.out.println("Sayı : " + i);
            i += 2;
        }
        System.out.println("While Döngüsü Bitti.");

        // do-while
        int j = 0;
        do {
            System.out.println("Sayı : " + j);
            j ++;
        } while (j < 10);
        System.out.println("do-While Döngüsü Bitti.");

        //do-while örnek
        int k =11;
        do {
            System.out.println("Log alındı.");
        } while (k==9);
        System.out.println("Do-While örnek döngüsü bitti.");
    }
}
