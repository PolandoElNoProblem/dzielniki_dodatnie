import java.util.Scanner;
public class Main {

    // A method of finding and printing divisor
    static void dzielniki(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.printf("%d ",i);
    }


    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Podaj numer wiekszy od 0:");
        int num= sc.nextInt();
        while (num<=0) {
            System.out.println("Miales podac wiekszy numer od 0 galganie");
             num= sc.nextInt();
        }
            if (num > 0) {
                System.out.println("Dzielinki numera " + num + " to: ");
                dzielniki(num);


            }

    }

}