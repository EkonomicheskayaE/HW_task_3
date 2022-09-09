// Задача № 3. Написать программу вычисления n-ого треугольного числа. url

package Task_3;

import java.util.Scanner;

public class triangular_numbers {

    // Возвращает true, если 'num' > 0 и false, если 'num' < 0.
   
    static boolean Triangular(int num)
    {
        if (num < 0)
            return false;
      
        int sum = 0;
        for (int n = 1; sum <= num; n++)
        {
            sum += n;
            System.out.println(sum);
            if (sum == num)
                return true;
        }
        return false;
    }
    
    static int triangular_list(int num) {
        // метод вывода всех треугольных чисел.
        int x = 1;
        int treug = 1;
        while (x < num) {
            System.out.println(x + " = " + treug);
            x++;
            treug += x;
        } return treug;
    }
    public static void main (String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        
        if (Triangular(n))
            System.out.print("Число n является треугольным числом!\n");
        else
        System.out.print("Число n не является треугольным числом!\n");
        System.out.printf("Сколько вывести на экран треугольных чисел? ");
        int num = iScanner.nextInt();
        iScanner.close();
        System.out.println(triangular_list(num));
    }
}