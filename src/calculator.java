import java.util.*;
class main
{
    void addition(int a,int b)
    {
        int sum;
        sum=a+b;
        System.out.println("addition is :" +sum);

    }
    void subtraction(int a,int b)
    {
        int subt;
        subt=a-b;
        System.out.println("subtraction is :" +subt);
    }
    void multiplication(int a,int b)
    {
        int mult;
        mult=a*b;
        System.out.println("multiplication is :"+mult);
    }
    void division(int a,int b)
    {
        int div;
        div=a/b;
        System.out.println("division is :"+div);
    }
}
public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("value of a");
        a=sc.nextInt();
        System.out.println("value of b");
        b=sc.nextInt();
        main x=new main();
        int choice;
        System.out.println("Enter the choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                {
                x.addition(a, b);
                break;
            }
            case 2:
            {
                x.subtraction(a,b);
                break;
            }
            case 3:
            {
                x.multiplication(a,b);
                break;
            }
            case 4:
            {
                x.division(a,b);
                break;
            }
            default:
            {
                System.out.println("wrong choice");
            }
        }

    }
}
