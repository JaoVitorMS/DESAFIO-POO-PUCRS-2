import java.util.Scanner;

public class Banco {
   public static void main(String[] args) {
      Caixa Conta = new Caixa(502, 3000.0);
      Scanner tec = new Scanner(System.in);
      int opcao;
      Conta.MetodoVerificador(502);
      System.out.println(Conta.getSaldo());

      do {
         System.out.println("1 - Sacar");
         System.out.println("2 - Depositar");
         System.out.println("3 - Consultar saldo");
         System.out.println("4 - Sair");
         System.out.println("Digite a opção desejada: ");
          opcao = tec.nextInt();
         if (opcao == 1){

            System.out.println("Digite o quanto gostaria de sacar");
            double quantia = tec.nextDouble();
            Conta.Sacar(quantia);
            System.out.println(Conta.getSaldo());
         }
         else if (opcao == 2){

            System.out.println("Quanto você gostaria de depositar: ");
            double quantia = tec.nextDouble();
            Conta.Depositar(quantia);
            System.out.println(Conta.getSaldo());
         }
         else if (opcao == 3){
            System.out.println(Conta.getSaldo());
         }

      }while(opcao != 4);
   }
}
