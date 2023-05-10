
package pratica5;

public class Cachorro  extends Animal{
    private String raca;
    
    public Cachorro(String raca, String nome, double peso){
        super(nome,peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
          public void imprimir(){
        System.out.println("Nome do Cão:"+nome);
        System.out.println("Peso:"+peso);
        System.out.println("Tipo de raça:"+raca);


    }
    
}
