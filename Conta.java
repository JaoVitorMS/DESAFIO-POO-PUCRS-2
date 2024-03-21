/* Crie a classe Conta. Toda conta tem número e saldo. 
O número da conta corrente deve ter 3 dígitos, não pode ser zero 
e deve ser definido logo que o objeto é criado. Em seguida, 
crie um método que calcula e devolve o dígito verificador
 desse número de conta da seguinte forma: Some o número da conta 
 com o valor que corresponde ao número da conta na ordem inversa.
  (Ex: para número = 235, o valor inverso é 532. Faça 235 + 532 = 767)
Multiplique cada dígito do valor encontrado em (a) pela sua ordem posicional
 e some os valores encontrados. (Ex:7x1 + 6x2 + 7x3 = 40)
O último dígito do valor encontrado em (b) é o dígito verificador (Ex:40 → 0).*/

public class Conta{

    private int numerodaconta;
    private int saldo;


    public Conta(int numerodaconta, int saldo){
        this.numerodaconta = numerodaconta;
        this.saldo = saldo;

    }

    //Método que calcula e devolve o dígito verificador
    public int metodoVerificador(int numerodaconta){
        StringBuilder frase = new StringBuilder(numerodaconta); //aqui uso o StringBuilder para inverter a frase
        frase.reverse(); //metodo reverse para inverter a frase
        int reverso = Integer.parseInt(frase.toString()); //converto para int usando o parseInt,
        int soma = numerodaconta + reverso; //somo o numero da conta com o reverso
        int result = 0;
        String rereverse = Interger.toString(soma); //aqui eu faço com que o resultado em int vire string usando o Interger.toString
        for(int i = 0; i < soma.length(); i++){ //neste for eu crio o i e faco com que ele receba 1 enquanto ele for menor que o length
            int reresult = Character.getNumericValue(soma.charAt(i)); //aqui eu pego os valores de i
            result += reresult * (i + 1); // aqui fazemos o reresult recebe as info de result e multiplica os digitos de i 
        }

    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}