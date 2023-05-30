package Excecoesmultiplas;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultExcecoes{


public static void main(String[] args) {
    

try {

    //Unchecked 
    throw new RuntimeException();
    //Multiplos captura de Exceção
    // Exceções especificadas
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(" Dentro do ArrayIndexOutOfBoundsException");
} catch ( IndexOutOfBoundsException e){
    System.out.println(" Dentro do IndexOutOfBoundsException");
} catch ( ArithmeticException e){
    System.out.println("Dentro do ArithmeticException");
    //Exceção generica Pai de todas a cima
}catch(RuntimeException e){
    System.out.println("dentro do RuntimeException");
}

//Checked 
try{
talvesLance();
//sintaxe conhecida como "multi-catch" introduzida no Java 7
// Uso do ou que é " | "
}catch (SQLException | FileNotFoundException e){
    e.printStackTrace();
}

}
    

private static void talvesLance()throws SQLException, FileNotFoundException{


}

}