import java.util.Scanner;
import java.util.Random;
class HandCricketRemastered
{
    Scanner sc=new Scanner(System.in);
    Random r=new Random();
    int CompInput()
    {
        int rm=(r.nextInt(6))+1;
        return rm;
    }
    int UserInput()
    {
        int UI;
        System.out.println("Enter a number");
        while(true)
        {
            while(true)
            {
               if(sc.hasNextInt())
               {
                   UI=sc.nextInt();
                   break;
               }
               else
               {
                  System.out.println("Please Enter only a number");
                  sc.next();
               }
            }
            if(UI>0 && UI<7)
            {
                break;
            }
            System.out.println("Please enter a number between 1-6");
        }
        return UI;
    }
    int UserBat(int target)
    {
        if(target==0)
        {
            int run=0;
            while(true)
            {
                int UI=UserInput();
                int CI=CompInput();
                System.out.println("You entered : "+UI);
                System.out.println("Computer entered : "+CI);
                if(UI==CI)
                {
                   System.out.println("OUT!");
                   System.out.println("Computer Target is: "+(run+1));
                   break;
                }
                run=run+UI;
                System.out.println("Total runs : " +run);
            }
            return run;
        }
        else
        {
            int run=0;
            String win = "false";
            while(true)
            {
                if(run>=target)
                {
                    win="true";
                    break;
                }
                int UI=UserInput();
                int CI=CompInput();
                System.out.println("You entered : "+UI);
                System.out.println("Computer entered : "+CI);
                if(UI==CI)
                {
                   System.out.println("OUT!");
                   if(run==(target-1))
                   win="draw";
                   break;
                }
                run=run+UI;
                System.out.println("Total runs : " +run);
                System.out.println("Target : " +target);
            }
            if(win.equals("true"))
            return -2;
            else if(win.equals("draw"))
            return -1;
            else
            return run;
        }
    }
    int CompBat(int target)
    {
        if(target==0)
        {
            int run=0;
            while(true)
            {
                int UI=UserInput();
                int CI=CompInput();
                System.out.println("You entered : "+UI);
                System.out.println("Computer entered : "+CI);
                if(UI==CI)
                {
                   System.out.println("OUT!");
                   System.out.println("User Target is: "+(run+1));
                   break;
                }
                run=run+CI;
                System.out.println("Total runs : " +run);
            }
            return run;
        }
        else
        {
            int run=0;
            String win = "false";
            while(true)
            {
                if(run>=target)
                {
                    win="true";
                    break;
                }
                int UI=UserInput();
                int CI=CompInput();
                System.out.println("You entered : "+UI);
                System.out.println("Computer entered : "+CI);
                if(UI==CI)
                {
                   System.out.println("OUT!");
                   if(run==(target-1))
                   win="draw";
                   break;
                }
                run=run+CI;
                System.out.println("Total runs : " +run);
                System.out.println("Target : " +target);
            }
            if(win.equals("true"))
            return -2;
            else if(win.equals("draw"))
            return -1;
            else
            return run;
        }
    }
    boolean toss()
    {
        System.out.println("Enter odd or eve");
        String UC;
        while(true)
        {
            UC = (sc.next()).toLowerCase();
            if(UC.equals("odd")||UC.equals("eve"))
            break;
            System.out.println("Enter a valid input");
        }
        int UI= UserInput();
        int CI = CompInput();
        System.out.println("You entered: "+UI);
        System.out.println("Computer entered: "+CI);
        String num;
        if(((UI+CI)%2)==0)
        num="eve";
        else
        num="odd";
        if(UC.equals(num))
        {
            System.out.println("You won the toss");
            return true;
        }
        else
        {
            System.out.println("You lost the toss");
            return false;
        }
    }
    String Game()
    {
        String Endresult="";
        String UTC="";
        if((toss())==true)
        {
            System.out.println("Choose Batting or Bowling");
            while(true)
            {
                UTC=(sc.next()).toLowerCase();
                if(UTC.equals("batting") || UTC.equals("bowling"))
                break;
                System.out.println("Enter a valid input");
            }
        }
        else
        {
            int CC = r.nextInt(2);
            if(CC==0)
            {
                UTC="batting";
                System.out.println("Computer chose Bowling");
            }
            else
            {
                System.out.println("Computer chose Batting");
                UTC="bowling";
            }
        }
        if(UTC.equals("batting"))
        {
            int Ctarget=(UserBat(0))+1;
            int result=CompBat(Ctarget);
            if(result==-2)
            {
                System.out.println("Computer won");
                Endresult="Computer";
            }
            else if(result==-1)
            {
                System.out.println("Draw");
                Endresult="Draw";
            }
            else
            {
                System.out.println("Player won by "+((Ctarget-1)-result)+" runs");
                Endresult="Player";
            }
        }
        else
        {
            int Utarget=(CompBat(0))+1;
            int result = UserBat(Utarget);
            if(result==-2)
            {
                System.out.println("Player won");
                Endresult="Player";
            }
            else if(result==-1)
            {
                System.out.println("Draw");
                Endresult="Draw";
            }
            else
            {
                System.out.println("Computer won by "+((Utarget-1)-result)+" runs");
                Endresult="Computer";
            }
        }
        return Endresult;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HandCricketRemastered obj=new HandCricketRemastered();
        int Cscore=0;
        int Uscore=0;
        int Draw=0;
        while(true)
        {
           System.out.println("======================================== HAND CRICKET ========================================");
           System.out.println("==================== SCOREBOARD ====================");
           System.out.println("PLAYER WINS : "+Uscore);
           System.out.println("COMPUTER WINS : "+Cscore);
           System.out.println("DRAW : "+Draw);
           String result = obj.Game();
           if(result.equals("Computer"))
           Cscore++;
           else if(result.equals("Player"))
           Uscore++;
           else
           Draw++;
           String choice="";
           while(true)
           {
               System.out.println("Do you want to continue ? (Write yes or no)");
               choice=(sc.next()).toLowerCase();
               if(choice.equals("yes")||choice.equals("no"))
               break;
               else
               System.out.println("Please enter a valid input");
           }
           if(choice.equals("no"))
           break;
        }
    }
}
