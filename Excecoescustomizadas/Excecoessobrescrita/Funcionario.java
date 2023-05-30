package Excecoescustomizadas.Excecoessobrescrita;

import javax.management.RuntimeErrorException;

import Excecoescustomizadas.LoginInvalidoException;

public class Funcionario  extends Pessoas{
    
    //Sobrescrevendo o método
    //Podendo Sobrescrever o que vai ser lançado
    //Podendo colocar as que foram lançada de Pessoas
    // Ou so uma que pessoa lançou, e opitar para um Do tipo Runtime.
public void salvar()  throws LoginInvalidoException, RuntimeErrorException {
System.out.println("Slsvando funcionário");
}

}
