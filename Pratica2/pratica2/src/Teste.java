public class Teste {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();

        aluno1.setRa(22142509);
        aluno1.setNome("Michael Aparecido de Morais");
        aluno1.setCpf("46607827762");
        aluno1.setRg("38779876");
        aluno1.setSexo('m');

        aluno1.imprimir(aluno1);

        Data data1 = new Data();
        
        data1.setDia(22);
        data1.setMes(7);
        data1.setAno(1997);
        // Imprimir data formada
        System.out.println(data1.formatarData());

    }
}
