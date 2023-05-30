package BlocoFinaly;
public class BlocoFinaly{

public static void main(String[] args) {

  abreConexao();
}
  private static String abreConexao(){
try{

    System.out.println("Abrindo arquivo");
  
  System.out.println("Escrevendo dados no arquivo");
  throw new RuntimeException();

    }catch(Exception e){
     e.printStackTrace();
    //Bloco finally finaliza o programa, para não da estouro de memoria
    }finally{
        System.out.println("FECHANDO RECURSO LIBERADO PELO SO");
    }

    return null;
    
  }

  /*private static void abreConexao1(){
    //abrindo arquivo e escrevendo os dados
    try{
    System.out.println("Abrindo arquivo");
      
      System.out.println("Escrevendo dados no arquivo");
      throw new RuntimeException();
            //Bloco finally fechando o arquivo aberto pelo bloco try
        }finally{
            System.out.println("FECHANDO RECURSO LIBERADO PELO SO");
        }
  }
*/  
}
