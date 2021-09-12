package comissionemployee;

// BasePlusCommissionEmployee herda de CommissionEmployee e tem
// acesso a membros protected de CommissionEmployee

public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // salario-base por semana

   // construtor de seis argumentos
   public BasePlusCommissionEmployee( String first, String last, 
      String ssn, double sales, double rate, double salary )
   {
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); // valida e armazena salario-base
   } // fim do construtor BasePlusCommissionEmployee de seis argumentos
   
   // configura o salario-base                                    
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
   } // fim do metodo setBaseSalary                         

   // retorna o salario-base                                   
   public double getBaseSalary()
   {
      return baseSalary;
   } // fim do metodo getBaseSalary                            

   // calcula os lucros                 
   public double earnings()
   {
      return baseSalary + ( commissionRate * grossSales );
   } // fim do metodo earnings              

   // retorna a representacao String de BasePlusCommissionEmployee
   public String toString()
   {
      return String.format(                                           
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",           
         "base-salaried commission employee", firstName, lastName,    
         "social security number", socialSecurityNumber,              
         "gross sales", grossSales, "commission rate", commissionRate,
         "base salary", baseSalary );                                 
   } // fim do metodo toString
} // fim da classe BasePlusCommissionEmployee


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/