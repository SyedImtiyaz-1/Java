import java.util.*;
public class function1 {
    public static void main(String[] args) {
        System.out.print(sum());
    }

static int sum(){
    int a,b,c;
    Scanner i = new Scanner(System.in);
    System.out.println("Enter First number: ");
    a = i.nextInt();
    System.out.println("Enter Second number: ");
    b = i.nextInt();
    return c = a + b;
}
}