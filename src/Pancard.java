import java.util.Scanner;
class  InvalidPanException extends Exception{
    public InvalidPanException(String s){
        super(s);
    }
}
public class Pancard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Name:");
        String name=sc.nextLine();
        System.out.println("Enter  PanCard Number:");
        String p=sc.nextLine();
        String n1= String.valueOf(name.charAt(0));
        String p1= String.valueOf(p.charAt(4));
        try {
            if(n1.equalsIgnoreCase(p1) && p.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
                System.out.println("Valid pancard");
            }
            else {
                throw new InvalidPanException("Invalid PanCard");
            }
        }
        catch (InvalidPanException e1){
            System.out.println(e1.getMessage());
        }
    }
}