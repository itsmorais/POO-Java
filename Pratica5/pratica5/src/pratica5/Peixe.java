
package pratica5;

public class Peixe extends Animal{
    private String tipoHabitat;
    
    
    public Peixe(String nome,String tipoHabitat, double peso){
        super(nome,peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
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
        System.out.println("Nome do peixe:"+nome);
        System.out.println("Peso:"+peso);
        System.out.println("Tipo de habitat:"+tipoHabitat);


    }
    
    
}
