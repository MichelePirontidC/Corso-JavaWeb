import java.util.ArrayList;

public class Vendita {
  
   
    public Vendita(Giocattolo g, Cliente c){
        
    }
    public void aggiungiVendita(Giocattolo g, Cliente c){
        storicoVendite.add(g.id, e.id);
    }
    public void stampaVendite(ArrayList storicoVendite){
        for (Vendita v : storicoVendite) {
            System.out.println(v);
        }
    }
}
