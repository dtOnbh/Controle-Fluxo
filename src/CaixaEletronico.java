public class CaixaEletronico {
     public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 30.0;
 
        if(valorSolicitado < saldo){
              saldo = saldo - valorSolicitado;
              System.out.println("Seu Saldo é: " + saldo +" reais");
 
     
          }
        else
            System.out.println("Saldo Insuficiente");
     }   
}
