/*agora aqui nessa clase irei fazer: Criar, além dos métodos básicos, 
também os métodos sacar, depositar e transferir. O método transferir
 (Conta destino, double valor) deve permitir a transferência de um valor entre duas contas.
 irei ter que alterar o saldo que esta na classe Conta.java*/

 public class Caixa extends Conta implements OperacoesBancarias{
    
    private double saque;
    private double depositar;

    public Caixa(int numerodaconta, double saldo){
        super(numerodaconta, saldo);
        this.saque = saque;
        this.depositar = depositar;
    }

     @Override
     public void depositar(double deposito) {
         setSaldo(getSaldo()+deposito);
     }

     @Override
     public void sacar(double saque) {
        if(saque <= getSaldo()){
            setSaldo(getSaldo()-saque);
        }
        else if(saque > getSaldo()){
            System.out.println("Saldo insuficiente!");
        }
     }
 }