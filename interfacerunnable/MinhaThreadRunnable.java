package interfacerunnable;

public class MinhaThreadRunnable implements Runnable {

    private String name;
    private  int temp;

    public MinhaThreadRunnable (String name, int temp) {
        this.name = name;
        this.temp= temp;
         Thread t1 = new Thread(this);
         t1.start();
    }
    @Override
    public void run() {
try{
        for( int i= 0; i <6 ; i++ ){
            System.out.println( name + "Contador " + i);
            Thread.sleep(temp);
           
        }
    } catch( InterruptedException e ){
        e.printStackTrace();
    }
    System.out.println(name + "Terminou a execução");


    }

}
