public class switchDemo {
    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Notunuz : " + grade + " - Mükemmel. Geçtiniz");
                break;
            case 'B':
                System.out.println("Notunuz : " + grade + " - Çok Güzel. Geçtiniz");
                break;
            case 'C':
                System.out.println("Notunuz : " + grade + " - İyi. Geçtiniz");
                break;
            case 'D':
                System.out.println("Notunuz : " + grade + " - Fena Değil. Geçtiniz");
                break;
            case 'F':
                System.out.println("Notunuz : " + grade + " - Malesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
