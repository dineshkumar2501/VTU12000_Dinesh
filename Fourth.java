import java.util.*;
class Fourth{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Type your age ");
        int age=in.nextInt();
        if(age>=18)
        System.out.println("You are eligible");
        else
        System.out.println("You are not eligible");
    }
}