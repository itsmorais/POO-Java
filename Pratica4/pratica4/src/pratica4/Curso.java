

package pratica4;

import java.util.ArrayList;
import java.util.*;

public class Curso {
    private int numero;
    private String nome;
    private List<Disciplina> listaDisciplina;
    
    
    public Curso(int numero, String nome){ 
        this.numero = numero;
        this.nome = nome;
        listaDisciplina = new ArrayList <Disciplina>();
    }
    
    public void addDisciplina(Disciplina disciplina){
        listaDisciplina.add(disciplina);
    }
    
      public void imprimir(){
            System.out.println("Número:"+numero);
            System.out.println("Nome:"+nome);
            System.out.println("Disciplinas vinculadas a esse curso:");
            
            for(int i = 0; i < listaDisciplina.size(); i++){
                System.out.println("Disciplina:");
              listaDisciplina.get(i).imprimir();
            
                
            }
            
      }
         public void exibeDisciplinaCargaMaior(){
             int maior = 0;
             Disciplina disciplina = listaDisciplina.get(1);
             
             for(int i = 0; i < listaDisciplina.size(); i++){
                 if (maior < listaDisciplina.get(i).getCargaHoraria()){
                     maior = listaDisciplina.get(i).getCargaHoraria();
                     disciplina = listaDisciplina.get(i);
                 }
                 
             }
             System.out.println("A disciplina com maior carga horária é:");
             disciplina.imprimir();
         }
         
        public int calcularTotalHora(){
            int soma = 0;
            
            for(int i = 0; i < listaDisciplina.size(); i++){
                soma += listaDisciplina.get(i).getCargaHoraria();
                
               
            }
            return soma;
            
            
        
        }
         
        
       
    }

 