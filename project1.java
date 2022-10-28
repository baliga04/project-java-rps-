import java.util.Random;
import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {
        int  c;
        Random r = new Random();
        c = r.nextInt(3);
        String computer=null;
        if (c == 0) {
            computer = "S";
            System.out.println("computer plays " + computer);
        } else if (c == 1) {
            computer = "R";
            System.out.println("computer plays " + computer);
        } else if (c == 2) {
           computer = "P";
            System.out.println("computer plays " + computer);
        }
        System.out.println("0 is equal to scissor \n 1 is equal to rock \n 2 is equal to paper");

        System.out.println("enter your move of choice");
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        String user = null;

        if (a == 0)
        {
           user = "S";
        }
        else if (a==1)
        {
           user = "R";
        }
        else if (a==2) {
            user = "P";
        }

        if (a==c)
        {
            System.out.println("its a tie");
        }
        else if (computer.equals("R"))
        {
            if (user.equals("S"))
            {
                System.out.println("computer wins");
            }
            else if (user.equals("P")){
                System.out.println("you win");
            }
            else if(computer.equals("S"))
            {
                if(user.equals("P")){
                    System.out.println("computer wins");
                }
                else if(user.equals("R")){
                    System.out.println("you win");
                }
            }
            else if(computer.equals("P"))
            {
                if (user.equals("S"))
                {
                    System.out.println("you win");
                }
                else if (user.equals("R"))
                {
                    System.out.println("computer wins");
                }
            }
        }

    }
}
