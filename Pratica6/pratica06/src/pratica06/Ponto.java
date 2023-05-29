
package pratica06;

public class Ponto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    public float CalculoDistancia(Ponto p1,Ponto p2){
        double verticeX = (Math.pow((p2.x - p1.x), 2));
        double verticeY = (Math.pow((p2.y - p1.y), 2));
   
     
        double distancia = Math.sqrt(verticeX+verticeY);
        return  (float)distancia;
    
    }
}
