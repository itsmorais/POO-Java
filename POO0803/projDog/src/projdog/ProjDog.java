
package projdog;

public class ProjDog {

    public static void main(String[] args) {
        Dog primeiro = new Dog();
        primeiro.setNome("Nina");
        primeiro.setPeso(1);
        
        
        Dog segundo = new Dog();
        segundo.setNome("Bravo");
        segundo.setPeso(10);
        
        
        primeiro.latir();
        segundo.latir();
         DatabaseConnection db = new DatabaseConnection();
           db.getConexaoMySQL();
           System.out.println( db.statusConnection());
                
    }
    
}
