import java.util.Scanner;

public class ReplaceBitProblem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = s.nextInt();
        System.out.println("Input: "+Integer.toBinaryString(n));
        System.out.println("Output:"+Integer.toBinaryString(n|n+1));
    }
}
