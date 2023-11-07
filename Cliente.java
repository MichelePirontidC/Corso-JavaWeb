import java.util.ArrayList;

public class Cliente {
    String nome, indirizzoEmail, id;
    
    public Cliente(String nome, String indirizzoEmail){
        this.nome=nome;
        this.indirizzoEmail=indirizzoEmail;
        id++;
    }
    
   
    public void aggiungiCliente(Cliente c){
        clienti.add(c);
    }

}
