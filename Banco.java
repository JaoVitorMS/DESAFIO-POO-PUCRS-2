public class Banco {
   public static void main(String[] args) {
      Conta accout = new Conta(235, 1000);
      System.out.println("Seu numero da conta é: " + accout.numerodaconta);
      System.out.println("Seu digito verificador é: " + accout.metodoVerificador);
      System.out.println("Seu saldo é de: " + accout.getSaldo);
      accout.depositar(500);
      accout.sacar(250);
      System.out.println("Seu saldo é de: " + accout.getSaldo);
      
   
   
   
   
   
   
   
   
   }
}