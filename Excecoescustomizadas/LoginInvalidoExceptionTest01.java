package Excecoescustomizadas;
import java.util.Scanner;

//Utilizando a Exceção customized.
public class LoginInvalidoExceptionTest01 {
 public static void main(String[] args) {

    try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();;
        }
    }
private static void logar() throws LoginInvalidoException{
try (Scanner teclado = new Scanner(System.in)){
String usernameDB= "Veve";
String senhaDB= "123";


System.out.println("Usuário");
String usernameDigitado= teclado.nextLine();
System.out.println("Senha");
String senhaDigitals= teclado.nextLine();
//Verificação se Usuário que digitamos não  é igual ao que esta Na variavel usernameDB
// Mesma verificação  para a senha.
if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitals)){
    throw new LoginInvalidoException();

}
}
System.out.println("Usuário logado com sucess");
}

}
