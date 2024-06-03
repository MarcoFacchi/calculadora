import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        int n1, n2;
        String operacao;
        Scanner scInt = new Scanner (System.in);
        Scanner scStri = new Scanner (System.in);

        System.out.println("informe sua operação \nsoma  \\nsubtracao \nmultiplicacao");
               operacao = scStri.nextLine();
        System.out.println("informe primeiro numero");
               n1 = scInt.nextInt();
        System.out.println("informe segundo numero");
               n2 = scInt.nextInt();
               
         if ((operacao.equals("soma"))){
             System.out.println("sua soma = " +(n1+n2));
         }else if ((operacao.equals("subtracao"))){
            System.out.println("sua subtraçao = "+(n1-n2));
         }else if (operacao.equals("multiplicacao")){
            System.out.println("sua multiplicacao ="+(n1*n2));
         }else{
             System.exit(0);
         }
    }
}
