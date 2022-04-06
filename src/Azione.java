public class Azione extends Thread{

Salvadanaio salvadanaio;
boolean inserisci;

public Azione(Salvadanaio salvadanaio,boolean inserisci){
    this.salvadanaio=salvadanaio;
    this.inserisci=inserisci;

}



public void run() {

    if(inserisci){
        for(int i=0;i<1000;i++)
        {
            salvadanaio.inserisci();
        }
        

    }else{
        for(int i=0;i<1000;i++)
        {
            salvadanaio.preleva();
        }
    }
    
}
    
}
