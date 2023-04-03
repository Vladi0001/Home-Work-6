public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1 ){
            System.out.println("Итерация цикла " + i);
        }

        //task 2
        System.out.println("Задача 2");
        for (int a = 10; a >= 1; a = a - 1 ){
            System.out.println("Итерация цикла " + a);
        }

        //task 3
        System.out.println("Задача 3");
        for (int s = 0; s < 17; s = s + 2 ){
            System.out.println("Итерация цикла " + s);
        }

        //task 4
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a = a - 1 ){
            System.out.println("Итерация цикла " + a);
        }

        //task 5
        System.out.println("Задача 5");
        for (int y = 1904; y < 2096; y = y + 4 ){
            System.out.println("Високосные года являются " + y);
        }

        //task 6
        System.out.println("Задача 6");
        for (int d = 7; d < 98; d = d + 7 ){
            System.out.println("последовательность чисел " + d);
        }

        //task 7
        System.out.println("Задача 7");
        for (int f = 1; f <= 512; f = f * 2 ){
            System.out.println("последовательность чисел " + f);
        }

        //task 8 - 9
        System.out.println("Задача 8 - 9");
        int geld = 29000;
        int monat = 0;
        for (int z = 1; z <= 12; z = z + 1 ){
            monat = monat + monat/100;
            monat = monat + geld;
            System.out.println("Месяц " + z + " Итого " + monat);
        }

        //task 10
        System.out.println("Задача 10");
        int m = 2;

        for (int b = 1; b <= 10; b = b + 1 ){
            int n = b*2;
            System.out.println( m + " * " +b+ " = " + n);
        }
    }
}