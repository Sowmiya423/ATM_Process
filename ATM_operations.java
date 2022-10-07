
import java.util.*;
public class ATM_operations
{
      int amt,total=0;
      int two_thou;
      int five_hund;
      int hund;
      String a[]= {"101","102","103","104","105"};
      String b[]= {"Suresh","Ganesh","Magesh","Naresh","Harish"};
      String c[]= {"2343","5432","7854","2345","1907"};
      int d[]= {25234,34123,26100,80000,103400};
      public void loadcash()
      {    System.out.println("-----------------CUSTOMER BANK DETAILS AND ATM PROCESS-------------");
           System.out.println("                                                                   ");
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter number of two thousands:");
           two_thou=sc.nextInt();
           System.out.print("Enter number of five_hundreds:");
           five_hund=sc.nextInt();
           System.out.print("Enter number of  hundreds:");
           hund=sc.nextInt();
           total=(2000*two_thou)+(500*five_hund)+(100*hund);
           System.out.println("                                               ");
           System.out.println("Denomination"+" "+"Number"+" "+"Value");
           System.out.println("2000"+"         "+two_thou+"       "+(2000*two_thou));
           System.out.println("500"+"          "+five_hund+"         "+(500*five_hund));
           System.out.println("100"+"          "+hund+"         "+(100*hund));
           System.out.println("                                    "); 
           System.out.println("Total cash available: "+total);
           System.out.println("                                    "); 
        }  
      public void custdetails()
      {
           String a[]= {"101","102","103","104","105"};
           String b[]= {"Suresh","Ganesh","Magesh","Naresh","Harish"};
           String c[]= {"2343","5432","7854","2345","1907"};
           int d[]= {25234,34123,26100,80000,103400};
           System.out.println("------------------------------------------------------------------");
           System.out.println("-------------------------CUSTOMER DETAILS-------------------------");
           System.out.println("------------------------------------------------------------------");
           for(int i=0;i<5;i++)
            {
                   System.out.println(a[i]+"    "+b[i]+"    "+c[i]+"    "+d[i]);
            }
           System.out.println("-------------------------------------------------------------------");
       }
       public void operations()
      {
           int ch;
           do
           {
                 System.out.println("1.Check Balance");
                 System.out.println("2.Withdraw Money");
                 System.out.println("3.Transfer Money");
                 System.out.println("4.Check ATM Balance");
                 System.out.println("5.Exit");
                 System.out.println("Enter the choice: ");
                 Scanner sc=new Scanner(System.in);
                 ch=sc.nextInt();
             switch(ch)
             {
              case 1:
                {
                     String acn=sc.next();
                     String apin=sc.next();
                     for(int i=0;i<5;i++)
                     {
                       if(a[i].equals(acn)&&c[i].equals(apin))
                       {
                            System.out.println(d[i]);
                            break;
                        }
                       else
                       {
                    	   System.out.println("There is no Valid Balance to display...!!!"); 
                    	   break;
                       } 
                     } 
                     break;
                 }
              case 2:
                 {
                        int i;
                        String acn=sc.next();
                        String apin=sc.next();
                        for( i=0;i<5;i++)
                        {
                          if(a[i].equals(acn)&&c[i].equals(apin))
                          {
                             System.out.println("Enter the amount to be withdraw:");
                             amt=sc.nextInt();
                             if(amt<=d[i])
                             {
                                  System.out.println("Please take your Money...!!!");
                                  d[i]-=amt;    
                              }
                            else
                            System.out.println("Withdrawal failed...!!!");
                           }
                        }
                        break;
                   }
               case 3:
                 {
                  System.out.println("Enter the account no of the sender:");
                  String ac_no_s=sc.next();
                  System.out.println("Enter the pin number of the sender:");
                  String pin_no_s=sc.next();
                  System.out.println("Enter the  of the account no of the receiver:");
                  String ac_no_r=sc.next();
                  System.out.println("Enter the amount to be transfer:");
                  int amt_to_be_transfer=sc.nextInt();
                  for(int i=0;i<5;i++)
                  {
                  if(a[i].equals(ac_no_s)&&c[i].equals(pin_no_s))
                  {
                      if((amt_to_be_transfer<=d[i])&&(amt_to_be_transfer>1000&&amt_to_be_transfer<10000))
                      {
                            System.out.println("Transaction Successfull...!!!");
                      }
                    else
                      {
                          System.out.println("Transaction failed...!!!");
                      }
                   }
                  }
                 int i;
                 for(i=0;i<5;i++)
                 {
                    if(a[i].equals(ac_no_r))
                   {
                     d[i]+=amt_to_be_transfer;
                     System.out.println(d[i]+" is the amount resides at the receiver side after the transaction...!!!");
                   }
                 }
                 for(i=0;i<5;i++)
                 {
                    if(a[i].equals(ac_no_s))
                   {
                     d[i]-=amt_to_be_transfer;    
                     System.out.println(d[i]+" is the amount resides at the sender side after the transaction...!!!");
                   }
                 }
            break;
             }
          case 4:
           {
             int total1=total-amt;
             two_thou -= amt/2000;
             amt -= amt/2000;
             five_hund -= amt/1000;
             amt -= amt/1000;
             hund -= amt/100;
             amt -= 100;
             System.out.println("Denomination"+" "+"Number"+" "+"Value");
             System.out.println("2000"+"    "+two_thou+"    "+(2000*two_thou));
             System.out.println("500"+"    "+five_hund+"    "+(500*five_hund));
             System.out.println("100"+"    "+hund+"    "+(100*hund));
             System.out.println("                                                          ");
             System.out.println("Total cash available in ATM after some process:"+total1);
             break;
           }
          case 5:
          {
        	  System.out.println("Entered incorrect choice...!!!");
        	  break;
          }
           }
      }while(ch!=5);
           System.out.println("---------------SUCCESSFULLY PERFORMED ALL THE PROCESS...!!!-------------");
   }

        public static void main(String[] args)
        {
            ATM_operations ATM=new ATM_operations();
            ATM.loadcash();
            ATM.custdetails();
            ATM.operations();
        }
}
