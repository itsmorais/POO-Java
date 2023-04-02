public class Aluno {
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private String dataNasc;

    public Aluno(int ra, String nome, char sexo, String rg, String cpf, String dataNasc) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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
        System.out.println("Nome: "+this.nome+
        "\nCPF: "+this.cpf+
        "\nRA: "+this.ra+
        "\nRG: "+this.rg+
        "\nData de nascimento: "+this.dataNasc);
        if(this.sexo == 'm'){
            System.out.println("Sexo: Masculino");
        }else{
            System.out.println("Sexo: Feminino");
        };
    }
    
}
