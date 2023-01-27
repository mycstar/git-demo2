import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int side1, side2, side3;

        System.out.println("\nTo determine the type of triangle please enter the lengths of the sides. " +
                "\nEach length MUST be entered in INCREASING order of size.\n");

        System.out.println("Side 1: ");
        side1 = keyboard.nextInt();

        System.out.println("Side 2: ");
        side2 = keyboard.nextInt();

        System.out.println("Side 3: ");
        side3 = keyboard.nextInt();

        if((side1 + side2 > side3))
        {
            //To check to see if it an Equilateral triangle (3 equal sides)
            if((side1==side2) && (side2==side3))
            {
                System.out.print("\n RESULT: An Equilateral Triangle.");
            }//if

            //To check to see if it is an Isosceles triangle (2 of the same size and 1 different)
            else if ((side1 == side2) & (side2 == side3) || (side2 == side3) & (side3!= side1))
            {
                System.out.print("\n RESULT: An Isosceles Triangle.");
            }//else if

            //To check to see if it is a Scalene triangle (3 different sizes)
            else if((side1 != side2) & (side2 != side3))
            {
                System.out.print("\n RESULT: A Scalene Triangle.");
            }
        }else
        {
            System.out.print("\n RESULT: This Triangle is NOT possible.");
        }//else
    }//main

    public int show(){
        System.out.print("\n RESULT: This Triangle is NOT possible.");
        return 1;
    }

    public int show2(){
        System.out.print("\n RESULT: This Triangle is NOT possible.");
        return 1;
    }
}//class



