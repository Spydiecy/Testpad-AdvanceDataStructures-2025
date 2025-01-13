import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner inp = new Scanner(System.in);
        int digits = Integer.parseInt(inp.nextLine());
        
        boolean flag = false;
        if ( digits < 0){
            digits *= -1;
            flag = true;
        }
        
        int sum = 0;
        while ( digits != 0){
            sum += digits % 10;
            digits /= 10;
        }
        
        if ( flag == true){
            sum *= -1;
        }
        
        System.out.println(sum);
    }
}
