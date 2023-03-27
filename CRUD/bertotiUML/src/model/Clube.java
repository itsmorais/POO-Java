
package model;

import java.util.*;


public class Clube {
    private String clubeNome;
    private String clubeCampeonato;
    private List<Jogador> jogadores = new LinkedList<Jogador>();
    
    
    
    public void contratarJogador(Jogador jogador){
        jogadores.add(jogador);
        jogador.setJogadorContratado(true);
    }

    public String getClubeNome() {
        return clubeNome;
    }

    public void setClubeNome(String clubeNome) {
        this.clubeNome = clubeNome;
    }

    public String getClubeCampeonato() {
        return clubeCampeonato;
    }

    public void setClubeCampeonato(String clubeCampeonato) {
        this.clubeCampeonato = clubeCampeonato;
    }
 
    
    
}
