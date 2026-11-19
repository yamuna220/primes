import java.util.Scanner;
import java.lang.Math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        boolean prime=true;
        n = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}