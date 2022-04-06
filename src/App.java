public class App {

    public static void main(String[] args) {
        Salvadanaio i=new Salvadanaio();

        Azione azioneFatta=new Azione(i, true);
            azioneFatta.start();
        Azione azionePreleva=new Azione(i, false);
            azionePreleva.start();                                                           
        try {

            azioneFatta.join();
            azionePreleva.join();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.println(i.monete);
       
    }
    
}
