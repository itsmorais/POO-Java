public class Aluno {
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;


    public Aluno(){
        System.out.println("Instanciando novo aluno");
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir(Aluno aluno){
        System.out.println("Nome: "+aluno.getNome()+
        "\nCPF: "+aluno.getCpf()+
        "\nRA: "+aluno.getRa()+
        "\nRG: "+aluno.getRg());
        if(aluno.getSexo() == 'm'){
            System.out.println("Sexo: Masculino");
        }else{
            System.out.println("Sexo: Feminino");
        };
    }
    
}
