
package projdog;

public class Dog {
    private String nome;
    private int peso;
            
    public String getNome(){
        return nome;
    }    

    public int getPeso(){
        return peso;
    }
    
    public void setNome(String n){
        nome=n;
    }
    public void setPeso(int p){
        peso=p;
    }
    
    
    void latir(){
        if (peso >= 9){
            System.out.println(getNome()+": AUUUUUUUUUUU!");
        }else if(peso < 9){
            System.out.println(getNome()+": au");
        }
    }
    
    }
    

