import java.util.Scanner;
class HandCricketLegacy
{
    public static void main()
    {
          double a;
          String ab;
          int l;
          char abc;
          int abcd;
          int N;
          boolean toss;
          double ac;
          String aco;
          int lc;
          char abco;
          int abcod;
          String usc="";
          int ur=0;
          int cr=0;
          Scanner sc=new Scanner(System.in);
          toss= false;
          String uc;
          while(true)
          {
              System.out.println("Choose odd or eve");
              uc=sc.next();
              if(uc.equalsIgnoreCase("odd")||uc.equalsIgnoreCase("eve"))
              {
                 break;
              }
              System.out.println("Enter a valid Input");
          }
          a=Math.random();
          ab=String.valueOf(a);
          l=ab.length();
          abc=ab.charAt(l-1);
          abcd=Integer.parseInt(String.valueOf(abc));
          System.out.println("Enter a number");
          N=sc.nextInt();
          System.out.println("computer entered:"+abcd);
          System.out.println("you entered:"+N);
          if(uc.equalsIgnoreCase("odd")==true)
          {
          if((abcd+N)%2!=0)
          {
           System.out.println("You won the toss choose batting or bowling");
           usc=sc.next();
           toss=true;
          }
          else
          {
          System.out.println("You lost the toss");
          }
          }
          else if(uc.equalsIgnoreCase("eve")==true)
          {
              if((abcd+N)%2!=0)
              {
              System.out.println("You lost the toss");
              }
              else
              {
                System.out.println("You won the toss choose batting or bowling");
                usc=sc.next();
                toss=true;
              }
            } 
          if(toss==false)
          {
              ac=Math.random();
              aco=String.valueOf(a);
              lc=ab.length();
              abco=ab.charAt(l-1);
              abcod=Integer.parseInt(String.valueOf(abc));
              if(abcod%2==0)
              {
              System.out.println("Computer choose batting");
              usc="bowling";
              }
              else
              {
              System.out.println("Computer choose bowling");
              usc="batting";
              }
          }
          if(usc.equalsIgnoreCase("batting")==true)
          {
              for(int i=1;i>=0;i++)
              {
                  System.out.println("Enter a number");
                  N=sc.nextInt();
                  for(int j=1;j>=0;j++)
                  {
                      if(N>6 || N<=0)
                      {
                          System.out.println("Please enter a number between 1-6");
                          N=sc.nextInt();
                      }
                      else
                      {
                          break;
                      }
                  }
                  a=Math.random();
                  ab=String.valueOf(a);
                  l=ab.length();
                  abc=ab.charAt(l-1);
                  abcd=Integer.parseInt(String.valueOf(abc));
                  for(int k=1;k>=0;k++)
                  {
                      if(abcd>6 || abcd<=0)
                      {
                          a=Math.random();
                          ab=String.valueOf(a);
                          l=ab.length();
                          abc=ab.charAt(l-1);
                          abcd=Integer.parseInt(String.valueOf(abc));
                      }
                      else
                      {
                          break;
                      }
                  }
                  System.out.println("You entered:"+N);
                  System.out.println("Computer entered:"+abcd);
                  if(N==abcd)
                  {
                      System.out.println("Out");
                      break;
                  }
                  else
                  {
                      ur=N+ur;
                      System.out.println("Your Total runs:"+ur);
                  }
              }
              System.out.println("Your Total runs:"+ur);
              System.out.println("Computer Target:"+(ur+1));
              for(int i=1;i>=0;i++)
              {
                  if(cr>ur)
                  {
                    break;
                  }
                  System.out.println("Enter a number");
                  N=sc.nextInt();
                  for(int j=1;j>=0;j++)
                  {
                      if(N>6 || N<=0)
                      {
                          System.out.println("Please enter a number between 1-6");
                          N=sc.nextInt();
                      }
                      else
                      {
                          break;
                      }
                  }
                  a=Math.random();
                  ab=String.valueOf(a);
                  l=ab.length();
                  abc=ab.charAt(l-1);
                  abcd=Integer.parseInt(String.valueOf(abc));
                  for(int k=1;k>=0;k++)
                  {
                      if(abcd>6 || abcd<=0)
                      {
                          a=Math.random();
                          ab=String.valueOf(a);
                          l=ab.length();
                          abc=ab.charAt(l-1);
                          abcd=Integer.parseInt(String.valueOf(abc));
                      }
                      else
                      {
                          break;
                      }
                  }
                  System.out.println("You entered:"+N);
                  System.out.println("Computer entered:"+abcd);
                  if(N==abcd)
                  {
                      System.out.println("Out");
                      break;
                  }
                  else
                  {
                      cr=abcd+cr;
                      System.out.println("Computer Total runs:"+cr);
                      System.out.println("Computer Target:"+(ur+1));
                  }
              }
              System.out.println("Your total runs:"+ur);
              System.out.println("Computer Total runs:"+cr);
              if(ur>cr)
              System.out.println("You won the match");
              else if(ur<cr)
              System.out.println("You lost the match");
              else
              System.out.println("It's a draw");
          }
             else
             {
                for(int i=1;i>=0;i++)
              {
                  System.out.println("Enter a number");
                  N=sc.nextInt();
                  for(int j=1;j>=0;j++)
                  {
                      if(N>6 || N<=0)
                      {
                          System.out.println("Please enter a number between 1-6");
                          N=sc.nextInt();
                      }
                      else
                      {
                          break;
                      }
                  }
                  a=Math.random();
                  ab=String.valueOf(a);
                  l=ab.length();
                  abc=ab.charAt(l-1);
                  abcd=Integer.parseInt(String.valueOf(abc));
                  for(int k=1;k>=0;k++)
                  {
                      if(abcd>6 || abcd<=0)
                      {
                          a=Math.random();
                          ab=String.valueOf(a);
                          l=ab.length();
                          abc=ab.charAt(l-1);
                          abcd=Integer.parseInt(String.valueOf(abc));
                      }
                      else
                      {
                          break;
                      }
                  }
                  System.out.println("You entered:"+N);
                  System.out.println("Computer entered:"+abcd);
                  if(N==abcd)
                  {
                      System.out.println("Out");
                      break;
                  }
                  else
                  {
                      cr=abcd+cr;
                      System.out.println("Computer Total runs:"+cr);
                  }
              }
              System.out.println("User target:"+(cr+1));
              for(int i=1;i>=0;i++)
              {
                  if(ur>cr)
                  {
                      break;
                  }
                  System.out.println("Enter a number");
                  N=sc.nextInt();
                  for(int j=1;j>=0;j++)
                  {
                      if(N>6 || N<=0)
                      {
                          System.out.println("Please enter a number between 1-6");
                          N=sc.nextInt();
                      }
                      else
                      {
                          break;
                      }
                  }
                  a=Math.random();
                  ab=String.valueOf(a);
                  l=ab.length();
                  abc=ab.charAt(l-1);
                  abcd=Integer.parseInt(String.valueOf(abc));
                  for(int k=1;k>=0;k++)
                  {
                      if(abcd>6 || abcd<=0)
                      {
                          a=Math.random();
                          ab=String.valueOf(a);
                          l=ab.length();
                          abc=ab.charAt(l-1);
                          abcd=Integer.parseInt(String.valueOf(abc));
                      }
                      else
                      {
                          break;
                      }
                  }
                  System.out.println("You entered:"+N);
                  System.out.println("Computer entered:"+abcd);
                  if(N==abcd)
                  {
                      System.out.println("Out");
                      break;
                  }
                  else
                  {
                      ur=N+ur;
                      System.out.println("Your Total runs:"+ur);
                      System.out.println("User Target:"+(cr+1));
                  }
              }
              System.out.println("Computer total runs:"+cr);
              System.out.println("your total runs:"+ur);
              if(ur>cr)
              System.out.println("You won the match");
              else if(ur<cr)
              System.out.println("You lost the match");
              else
              System.out.println("It's a draw");
            }
        }
}
