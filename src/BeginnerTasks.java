import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BeginnerTasks {
    static void main() {

        //TASK-1
        // 1-dən 10-a qədər ədədin faktorialını hesablayan proqram yazın.
     /*
        for (int i = 1; i < 10; i++) {
            int temp = i;
            int result = 1;

            while (temp > 0) {
                result = result * temp;
                temp--;
            }
            System.out.println(i + "!=" + result);

      */


//        TASK-2
//        Verilmiş n ədədi üçün vurma cədvəlini (məs. 5x1=5, 5x2=10...) çap edin.

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin:");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            int result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }
        */


        // TASK-3
        // İstifadəçidən alınan ədədin rəqəmlərinin cəmini for dövrü ilə tapın

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = num; i > 0; i = i / 10) {
            int remainder = i % 10;
            sum = sum + remainder;

        }
        System.out.println(sum);

*/

//      TASK-4
//      for dövrü ilə ulduz (*) simvolundan ibarət düz xətt (məs. *****) çap edin.

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("nehce * chap olunacaq?");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("*");

        }
         */

        //TASK-6
        // İstifadəçidən alınan iki ədəd (başlanğıc və son) arasındakı bütün ədədləri çap edin.

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("bashlangic ededi daxil edin:");
        int startNumber = sc.nextInt();
        System.out.println("son ededi daxil edin:");
        int endNumber = sc.nextInt();

        for (int i = startNumber + 1; i < endNumber; i++) {
            System.out.println(i);

        }
         */

        //TASK-5
        // for dövrü ilə geriyə sayaraq (10-dan 1-ə) hər ədədin kvadratını çap edin.

      /*
        Scanner sc = new Scanner(System.in);
        System.out.println("hansi ededin kvadrati chapa verilecek:");
        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            int square = i * i;
            System.out.println(i + "*" + i + "=" + square);
        }

       */


    }
}

