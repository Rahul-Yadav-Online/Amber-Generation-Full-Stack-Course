/**
 * Program to demonstrate different types of loops in java
 */
public class Loops {
    public static void main(String[] args) {
        // Print 1 to 10 using For loop
        System.out.println("For Loop : \n===========");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        // Print 1 to 10 using while loop
        System.out.println("While Loop : \n=============");
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        // Print 1 to 10 using do while loop
        // do while loop runs atleast once even if the condition is false
        System.out.println("Do-While Loop : \n================");
        i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
