public class Teste {
    public static void main(String[] args) {
        int ra = (22142509);
        String nome = ("Michael Aparecido de Morais");
        String cpf = ("46607827762");
        String rg = ("38779876");
        char sexo = ('m');
        
        int dia = 22;
        int mes = 07;
        int ano = 1997;
        
        Data data1 = new Data(dia,mes,ano);
        Aluno aluno1 = new Aluno(ra,nome,sexo,rg,cpf,data1.formatarData());

        aluno1.imprimir(aluno1);
    }
}
