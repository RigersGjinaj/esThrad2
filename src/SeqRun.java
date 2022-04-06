class SeqRun implements Runnable{
    @Override
    public void run() {
     System.out.println("nel metodo che va " + Azione.currentThread().getName());
    } 
   }