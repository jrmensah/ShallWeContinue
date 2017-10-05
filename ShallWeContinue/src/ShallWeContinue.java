import java.util.Scanner;
public class ShallWeContinue
{
    public static void main (String args[])
    {
        String input= null;

        Scanner keyboard = new Scanner(System.in);

    //Prompt the user if they want to continue
        do
        {
            System.out.println("Do you want to continue?");
            input= keyboard.nextLine();
            
    //User inputs value that is not 'Y' or 'N'
            if((!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")))
            {
                System.out.println("Invalid entry! Please type Y or N");
                System.out.println("Do you want to continue?");
            }

            keyboard.nextLine();
            System.out.println("");

        }while((input.equalsIgnoreCase("y")&& !input.equalsIgnoreCase("n")));

        System.out.println("Thank you!");
    }

}
