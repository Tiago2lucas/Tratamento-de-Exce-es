package Excecoeschecked;
import java.io.File;
import java.io.IOException;

//Trabalhando com Exceção do tipo Checked
//Trabalhando com relançamento de Exceção
public class Checked{

public static void main(String[] args)throws IOException {
    criarNovoArquivo();
}

public static void criarNovoArquivo() throws IOException{
File file = new File("rquivo\\ text1.txt");
try{
    boolean isArqui = file.createNewFile();
        System.out.println("Arquivo criado:" + isArqui);
}   catch(IOException e){

e.printStackTrace();
//Relançando a Exceção
throw e;
}



}


}