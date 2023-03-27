
package bertotiuml;
import model.Campeonato;
import model.Clube;
import model.Jogador;

public class BertotiUML {

    public static void main(String[] args) {
        
        // LIBERTADORES
        Campeonato libertadores = new Campeonato();
        libertadores.setCampeonatoNome("Libertadores da América");
        
        Clube corinthians = new Clube();
        corinthians.setClubeNome("Corinthians Paulista");
         Clube palmeiras = new Clube();
        palmeiras.setClubeNome("Sociedade esportiva Palmeiras");
         Clube riverPlate = new Clube();
        riverPlate.setClubeNome("River Plate");
         Clube flamengo = new Clube();
        flamengo.setClubeNome("Clube de regatas Flamengo");
        Clube bocaJuniors = new Clube();
        bocaJuniors.setClubeNome("Boca Juniors");
        
        
        libertadores.incluirClubeNoCampeonato(corinthians);
        libertadores.incluirClubeNoCampeonato(palmeiras);
        libertadores.incluirClubeNoCampeonato(riverPlate);
        libertadores.incluirClubeNoCampeonato(flamengo);
        
        
        libertadores.iniciarCampeonato();
        // NÃO POSSO INCLUIR CLUBES
        libertadores.incluirClubeNoCampeonato(bocaJuniors);  
        
        System.out.println(libertadores.listarClubes());
     
    }
    
}
