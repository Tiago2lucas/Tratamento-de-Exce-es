package threadstartrunsleep;

public class  MinhaThread extends Thread {

private String name;
private int tempo;


public  MinhaThread(String name, int tempo){
this.name = name;
this.tempo= tempo;
start();
}

@Override
public void run (){

try {
    for (int i =0; i<6; i++){
        System.out.println(name + "Contador" +i);
        Thread.sleep(tempo);
    }

} catch (InterruptedException e) {
    //
    e.printStackTrace();
}

System.out.println(name + " terminou a execução!!");
}

}