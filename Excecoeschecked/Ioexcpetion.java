package Excecoeschecked;

import java.io.File;
import java.io.IOException;

public class Ioexcpetion {
 
// Metodo para cria um Novo arquivo
protected void criaNovoArquivo(){
// Usando o obejto File
File file = new File("Arquivo\\teste.txt ");

try {
    // com objeto referenciado, usamos um metodo para cria esse Arquivo
    // Metodo createNewFile
    boolean isArqui= file.createNewFile();
    System.out.println("Arquivo criado ?" + isArqui);
// Exceção a ser tratada
}catch(IOException e){

e.printStackTrace();

}

}


}
