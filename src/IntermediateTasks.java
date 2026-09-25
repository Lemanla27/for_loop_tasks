import java.sql.SQLOutput;
import java.util.Scanner;

public class IntermediateTasks {
    static void main() {
        /*
14. Nested for dövrü ilə şahmat lövhəsi kimi növbələşən naxış (məs. X və O) çap edin.
         */


//        TASK-1.
//        Nested for-loop ilə düzbucaqlı formada ulduz naxışı
//                (məs. 5 sətir, 5 sütun) çap edin.

/*
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
 */

        //TASK-2. Nested for-loop ilə üçbucaq formalı ulduz naxışı çap edin
        // (hər sətirdə artan sayda *).
        //*
        //**
        //***
        //****

        /*
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */

//        TASK-8
//   break operatorundan istifadə edərək, ilk 100-ə bölünən ədədi tapan proqram yazın(1-dən başlayaraq).

        /*
        for (int i = 1; ; i++) {
            if (i % 100 == 0) {
                System.out.println(i);
                break;
            }
        }
 */


        //TASK-9
        // continue operatorundan istifadə edərək, 1-50 arasında yalnız 7-yə bölünməyən ədədləri çap edin.

     /*   for (int i = 1; i < 50; i++) {
            if (i % 7 == 0){
                continue;
            }
            System.out.println(i);
        }*/


        //TASK-3.
        // Verilmiş n ədədinin sadə (prime) olub-olmadığını for dövrü ilə yoxlayan proqram yazın.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin:");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count == 1 && num > 1 ? "eded sadedir" : "eded sade deyil");*/


        //TASK-11
        // Verilmiş n ədədinin bütün bölənlərini tapıb, mükəmməl ədəd (perfect number)
        //olub-olmadığını yoxlayın

       /* Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin:");//6
        int num = sc.nextInt();
        int cem = 0;
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                System.out.println(i);
                cem = cem + i;
            }
        }
        System.out.println(cem == num ? "eded mukemmeldir" : "eded mukemmel deyil");*/

        //TASK-6.
        // Nested for-loop ilə tam vurma cədvəlini (1-dən 10-a qədər) cədvəl şəklində çap edin.

       /* for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + "*" + j + "=" + result);
                }
            }*/


        //TASK-4. 1-dən n-ə qədər bütün sadə ədədləri tapıb çap edin.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("hansi edededek chap olunacaq?");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            int count = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1)
                System.out.println(i);
        }*/


        //TASK- 13.
        // for dövrü ilə istifadəçidən daxil edilən ədədin ikilik (binary) sistemdəki
        // qarşılığını tapın (bölmə/qalıq üsulu ilə).

   /*     Scanner sc=new Scanner(System.in);
        System.out.println("eded daxil edin");
        int num=sc.nextInt();//13

        String binary="";
        for (int i = num; i >0; i=i/2) {//
             int remainder=i%2;
             binary=remainder+binary;
        }
        System.out.println(binary);
        }*/

        //TASK-5
        // Verilmiş n ədədinə qədər Fibonaççi ardıcıllığını for dövrü ilə çap edin.

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin:");
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;

        for (int i = num2; i < num; i++) {
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
    }*/


        //TASK- 15.
        // for dövrü ilə istifadəçinin daxil etdiyi n qədər ədədlər arasında ən böyük və ən kiçik
        //ədədi (əgər istifadəçi ardıcıl daxil edirsə Scanner ilə) tapan proqram yazın.

/*        Scanner sc = new Scanner(System.in);
        System.out.println("neche eded daxil olunacaq?");
        int count = sc.nextInt();

        System.out.println("eded daxil edin:");
        int num = sc.nextInt();

        int max = num;
        int min = num;

        for (int i = 2; i <= count; i++) {
            System.out.println("eded daxil edin:");
            num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            if (eded < min) {
                min = num;
            }

        }
        System.out.println("max eded=" + max);
        System.out.println("min eded=" + min);


//        TASK-7.
//    İç-içə for dövrü ilə say piramidası (məs. 1, 12, 123, 1234...) çap edin.

     /*   for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/


//        TASK-10
//        İki ədədin ən böyük ortaq bölənini (EBOB) for dövrü ilə hesablayan proqram yazın.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("1.eded daxil edin:");
        int num1 = sc.nextInt();
        System.out.println("2.eded daxil edin:");
        int num2 = sc.nextInt();
        int ebob = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }

        }
        System.out.println(ebob);*/


//        TASK - 12
//        12. Etiketli dövrlər (labeled loop)istifadə edərək iç - içə for dövründən break label ilə
//        çıxan nümunə yazın.

      /*  label:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 2 && j == 2) {
                    break label;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }*/


    }


}


