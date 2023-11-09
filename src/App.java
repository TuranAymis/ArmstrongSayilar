import java.util.Scanner;
    /*
    Proje Konusu 
    #Java ile girilen N sayınının bir Armstrong sayısı olup olmadığını bulan programı yazın.

    Armstrong Sayısı
    N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

    Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

    1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

    1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

    54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

    Örnek Çıktı
    Sayı Giriniz : 407
    407 bir Armstrong Sayıdır.
    Sayı Giriniz : 303
    303 bir Armstrong Sayı Değildir.
    */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int number;
        int digitCount = 0;
        int tempNumber;
        int total = 0;
        int digitNumber;
        int digitPow;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        input.close();
        //Sayı kaç basamaklı? n sayısı elde et

        tempNumber = number;
        do {
            tempNumber = tempNumber / 10;
            digitCount++;
        } while (tempNumber != 0);

        tempNumber = number;

         //Sayının her bir basamağına nasıl ulaşırım
         //Üs alma işlemini nasıl yaparım
        while (tempNumber != 0) {
            digitNumber = tempNumber % 10;
            digitPow = 1;
            for (int i = 1; i <= digitCount; i++){
                digitPow *= digitNumber;
            }
            total += digitPow;
            tempNumber = tempNumber / 10;
        }

        if (total == number) {
            System.out.println(number + " Sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " Sayısı Armstrong sayı değildir.");
        }
    }
}
