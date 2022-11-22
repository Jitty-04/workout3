import java.util.Scanner;

public class Substring {
    public static void main(String[] a){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.next();

        System.out.println("All substring of "+s );
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
