
public class RecursionQEasy {

    public static void main(String[] args) {
        fun(6);
        System.out.println();
        funRev(6);
        System.out.println();
        funBoth(6);
        System.out.println(factorial(5));
    }

    public static void fun(int num) {

        if (num == 0) {
            return;
        }
        // before func call it will print 5,4,3,2,1
        // while it forming the Recursion it print it
        System.out.print(num + " ");

        fun(num - 1);

    }

    public static void funRev(int num) {

        if (num == 0) {
            return;
        }

        funRev(num - 1);
        // After Func call it will print 1,2,3,4,5.
        // when it was removing the recursion calls from stack it print it.
        System.out.print(num + " ");

    }

    public static void funBoth(int num) {

        if (num == 0) {
            return;
        }

        // while forming.
        System.out.print(num + " ");
        fun(num - 1);
        // while removing.
        System.out.println(num + " ");

    }

    public static int factorial(int fact) {
        //base conditions
        if (fact <= 1) {
            return 1;
        }

        return fact * factorial(fact - 1);

    }
    void func(int n)
    {

        if(n==0)
        {
            return;
        }
        System.out.println(n)
        ;

        // n-- will cause infinte recursion
        //so, use --n.
        func(--n);

    }


}