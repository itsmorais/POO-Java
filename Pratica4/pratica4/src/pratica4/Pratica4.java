
package pratica4;

public class Pratica4 {

    public static void main(String[] args) {
        Curso curso1 = new Curso(1, "História do Brasil");
        Disciplina disciplina1 = new Disciplina(1, 10);
        Disciplina disciplina2 = new Disciplina(2, 5);
        
        curso1.addDisciplina(disciplina1);
        curso1.addDisciplina(disciplina2);
        
        System.out.println("O curso 1 tem a carga horária total de:"+curso1.calcularTotalHora());
        curso1.exibeDisciplinaCargaMaior();
        curso1.imprimir();

        


    }
    
}
