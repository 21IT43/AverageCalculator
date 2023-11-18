import java.util.scanner;
public class Averagecalculator() {
   public static Void main (String [] args ) {
     scanner scanner = new scanner(system.in);
     system.out.println("Enter the value of n");
     int n = scanner.nextInt();
     system.out.println("Enter the value of elements ");
     double sum=0;
     for(int i=0; i<=n; i++) {
       double number = scanner.nextDouble();
       sum+=number;
       }
     double average = sum/n;  
     system.out.println("The average of " + n + "is" + average);
     scanner.close();
    }
   }
