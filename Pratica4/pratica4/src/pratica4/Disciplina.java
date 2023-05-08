
package pratica4;

public class Disciplina {
    private int codigo;
    private int cargaHoraria;

    public Disciplina(int codigo, int cargaHoraria) {
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }
    
    
 
    public void imprimir(){
        System.out.println("Código:"+codigo);
        System.out.println("Carga Horária"+cargaHoraria);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
}
