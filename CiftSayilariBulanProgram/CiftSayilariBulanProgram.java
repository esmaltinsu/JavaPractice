import java.util.Scanner;
public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Değer Giriniz: ");
        k = input.nextInt();

        for (int i=1 ; i<=k ; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
