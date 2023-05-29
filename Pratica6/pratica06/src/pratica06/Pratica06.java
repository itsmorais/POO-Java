
package pratica06;

public class Pratica06 {

    public static void main(String[] args) {
        Ponto p1 = new Ponto(4,5);
        Ponto p2 = new Ponto(1,1);
        float result = p1.CalculoDistancia(p1, p2);
        System.out.println(result);
    }
    
}
