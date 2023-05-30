package Excecoesunchecked;
public class Unchecked {
    

public static void main(String[] args) {
    try {
 divisao(2, 0);
    } catch(RuntimeException e){
 e.printStackTrace();
System.out.println("Codigo finalizado");
    }
}

/**
 * @param a  
 * @param b não pode ser zero
 * @param IllegalArgumentException caso b seja zero
 */


private static int divisao(int a, int b){

if(b== 0){
    throw new IllegalArgumentException("Argumento ilegal, divisao por zero");
}

    return a/b;
}




}
