//Gurpreet singh  11/7/2021 block 5
import java.util.*; 
import java.io.*;
import javax.swing.JOptionPane;

public class Taxlab
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(null, "Welcome to the tax calculator lab!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
      Scanner input = new Scanner(System.in);
      String inc = JOptionPane.showInputDialog("Please enter your anual income from 2016!"); 
      String income = String.valueOf(inc);
      int x = 0;
         
      double i = 0;
      try
      { i = Double.valueOf(income);  
         x = 0; }
      catch (Exception e)
      {JOptionPane.showMessageDialog(null, "Invalid value, please enter a valid value next time", "GOODBYE", JOptionPane.ERROR_MESSAGE); 
      }
      if(x == 0)
      {
         tax(i);}
      
   }
      
     
        
   public static void tax(double x)
   {
      double val = x;
      if (val >= 0.0 && val < 9275.0)
      {System.out.println("Income = "+val+ " ");
         System.out.println("tax rate = 10%");
         double tax = val * 0.100;
         System.out.println("Tax Owed = "+tax+ " ");
         double aftax = val - tax;
         System.out.println("Income after tax = "+aftax+ " "); } 
        
      else 
        
         if (val >= 9275.0 && val < 37650.0)
         {System.out.println("Income = "+val+ " ");
            System.out.println("tax rate = 15%");
            double tax = val * 0.150;
            System.out.println("Tax Owed = "+tax+ " ");
            double aftax = val - tax;
            System.out.println("Income after tax = "+aftax+ " "); } 
         
         else 
             
            if (val >= 37650.0 && val < 91150.0)
            {System.out.println("Income = "+val+ " ");
               System.out.println("tax rate = 25%");
               double tax = val * 0.250;
               System.out.println("Tax Owed = "+tax+ " ");
               double aftax = val - tax;
               System.out.println("Income after tax = "+aftax+ " "); } 
            
            else 
            
               if (val >= 91150.0 && val < 190150.0)
               {System.out.println("Income = "+val+ " ");
                  System.out.println("tax rate = 28%");
                  double tax = val * 0.280;
                  System.out.println("Tax Owed = "+tax+ " ");
                  double aftax = val - tax;
                  System.out.println("Income after tax = "+aftax+ " "); } 
               
               else 
               
                  if (val >= 190150.0 && val < 413350.0)
                  {System.out.println("Income = "+val+ " ");
                     System.out.println("tax rate = 33%");
                     double tax = val * 0.330;
                     System.out.println("Tax Owed = "+tax+ " ");
                     double aftax = val - tax;
                     System.out.println("Income after tax = "+aftax+ " "); } 
                  
                  else 
                  
                     if (val >= 413350.0 && val < 415050.0)
                     {System.out.println("Income = "+val+ " ");
                        System.out.println("tax rate = 35%");
                        double tax = val * 0.350;
                        System.out.println("Tax Owed = "+tax+ " ");
                        double aftax = val - tax;
                        System.out.println("Income after tax = "+aftax+ " "); } 
                        
                        else 
                        
                        if (val >= 415050.0)
                     {System.out.println("Income = "+val+ " ");
                        System.out.println("tax rate = 39.6%");
                        double tax = val * 0.396;
                        System.out.println("Tax Owed = "+tax+ " ");
                        double aftax = val - tax;
                        System.out.println("Income after tax = "+aftax+ " "); } 
   
   
      
   }

}
