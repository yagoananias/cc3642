package comissionemployee;

/**
 * Classe principal
 * Utilizar a herança é mais natural pois ao pensar em manutenções futuras
 * o programa não ficaria tão complexo, já a composição começa a "amarrar"
 * mais as classes, dificultando assim sua manutenibilidade.
 * @author Yago
 */

public class Main {
    public static void main(String[] args) {
       // instancia o objeto BasePlusCommissionEmployee
      BasePlusCommissionEmployee employee =             
         new BasePlusCommissionEmployee(                
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
      
      BasePlusCommissionEmployee2 employee2 =             
         new BasePlusCommissionEmployee2(                
         "Ozzy", "Osbourne", "666-33-3333", 25000, .05, 700 );
      
      // obtem os dados do empregado comissionado com salario-base 
      System.out.println(
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee.getCommissionRate() );
      System.out.printf( "%s %.2f\n", "Base salary is",
         employee.getBaseSalary() );

      employee.setBaseSalary( 1000 ); // configura o salario-base                                    
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee information obtained by toString",
         employee.toString());
      
      System.out.println(
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee2.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee2.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee2.getSocialSecurityNumber());
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee2.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee2.getCommissionRate() );
      System.out.printf( "%s %.2f\n", "Base salary is",
         employee2.getBaseSalary() );

      employee2.setBaseSalary( 30000 ); // configura o salario-base                                    
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee2 information obtained by toString",
         employee2.toString());
    }
    
}
