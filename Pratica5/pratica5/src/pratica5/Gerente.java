
package pratica5;

public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String nome, int cpf, double salario,int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
        
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
                }else{
        return false;
        }
    }
    
}
