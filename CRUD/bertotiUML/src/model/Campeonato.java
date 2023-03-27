package model;
import java.util.*;


public class Campeonato {
    private String campeonatoNome;
    private boolean campeonatoAberto;
    private List<String> clubes = new LinkedList<>();
    
    
    public Campeonato(){
        this.campeonatoAberto = true;
        
    }
    
    
    public void incluirClubeNoCampeonato(Clube clube){
        if (this.campeonatoAberto){
            String clubeNome = clube.getClubeNome();
            clubes.add(clubeNome);
            clube.setClubeCampeonato(this.getCampeonatoNome());
        }else{
            System.out.println("Período de incrições fechou! Campeonato em andamento");
        }
        
        
        
    }
    
    public List listarClubes(){
        return clubes;
    }
    
    
    
    public void iniciarCampeonato(){
        this.campeonatoAberto = false;
    }

    public String getCampeonatoNome() {
        return campeonatoNome;
    }

    public void setCampeonatoNome(String campeonatoNome) {
        this.campeonatoNome = campeonatoNome;
    }

    
}
