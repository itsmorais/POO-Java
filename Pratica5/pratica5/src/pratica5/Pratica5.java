
package pratica5;

public class Pratica5 {

    public static void main(String[] args) {
        Gerente Alexandre = new Gerente("Alexandre Jonas", 12345678, 7000, 1234);
        Gerente Alita = new Gerente("Alita Amancio", 98765432, 7000, 4321);
        
        System.out.println(Alexandre.autentica(3345));
        System.out.println(Alita.autentica(4321));
   
    }
    
}
