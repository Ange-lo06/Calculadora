import java.util.Scanner;

public class operacao {
    public String operacao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Selecione qual a operação------");
        System.out.println("-----Adição (+)------");
        System.out.println("-----Subtração (-)------");
        System.out.println("-----Multiplicador (*)------");
        System.out.println("-----Divisão (/)------");
        return sc.next();

    }
}
class calculo extends operacao{
    public void calcular(){
        Scanner sc = new Scanner(System.in);
        String obteroperecao = operacao();

        System.out.println("Digite o primeiro número");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = sc.nextDouble();

        double resultado = 0;
        boolean operacaovalida = true;

        switch (obteroperecao) {
            case "+":
                resultado = num1+num2;
                break;

            case "-":
                resultado = num1-num2;
                break;

            case "*":
                resultado = num1*num2;
                break;

            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                }else {
                    System.out.println("Erro. Divisão por zero não é permitida");
                    operacaovalida = false;
                }break;
            default:
                System.out.println("Operação inválida");
                operacaovalida = false;

    }
        if (operacaovalida){
            System.out.println("O resultado é:" + resultado);
        }
    }

}
