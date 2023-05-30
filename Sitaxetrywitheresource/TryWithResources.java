package Sitaxetrywitheresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


//Sintaxe do Try with Resource
public class TryWithResources{

public static void main(String[] args)   {
lerArquivo();

}

/*Usando a Sintaxe do Try with resourse */
public static void lerArquivo()  {
try ( Leito1 leitor1 = new Leito1();
    Leito2 leitor2 = new Leito2()) {

}catch( IOException e ) {
    e.printStackTrace();
}
}

public static void lerArquivo1(){
Reader reader = null;
try {
    // o nossa Classe FileReader Automaticamente ja lança uma Exceção chamada FileNotFoundException
    //Ela pede para que você capture ela e trate
    reader = new BufferedReader(new FileReader("teste.txt"));
} catch (FileNotFoundException e) {
   e.printStackTrace();
} finally{
try{
    reader.close();
}catch(IOException e){
    e.printStackTrace();
}
}


}

}