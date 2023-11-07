import java.util.ArrayList;

public class Giocattolaio {
    public static void main(String[]args){
        ArrayList<Vendita> storicoVendite = new ArrayList<>();
        ArrayList<Giocattolo> giocattoli=new ArrayList<>();
         ArrayList<Cliente> clienti=new ArrayList<>();
        
    Giocattolo g=new Giocattolo("Orsacchiotto", 10, 2);
    Cliente c=new Cliente("MIchele", "ciccio@123.com");
    Vendita v= new Vendita();
    v.aggiungiVendita(0, 0);
    v.stampaVendite();

        
    



    }
}
