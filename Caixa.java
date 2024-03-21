/*agora aqui nessa clase irei fazer: Criar, além dos métodos básicos, 
também os métodos sacar, depositar e transferir. O método transferir
 (Conta destino, double valor) deve permitir a transferência de um valor entre duas contas.
 irei ter que alterar o saldo que esta na classe Conta.java*/

 public class Caixa extends Conta{
    
    private double saque;
    private double depositar;

    public Caixa(Int numerodaconta, double saldo){
        super(numerodaconta, saldo);
        this.saque = saque;
        this.depositar = depositar;
    }
    
    //metodo sacar, ira retirar um valor do saldo
    public void sacar(double saque){
        if(saque <= saldo){
            sacar = saque - saldo;
        }
        else if(saque > saldo){
            System.out.println("Saldo insuficiente!")
        }
    }

    //metodo depositar, ira adicionar um valor ao saldo
    public void deposito(double depositar){
        deposito = depositar + saldo;
    }  

   


 }