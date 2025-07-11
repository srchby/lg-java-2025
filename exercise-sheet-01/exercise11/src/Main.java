import java.util.Scanner;
// Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal  deetiqueta  e  a  escolha  da  condição  de  pagamento.  Utilize  os  códigos  da  tabela  a  seguir  para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado. Código Condição de pagamento 1 À vista em dinheiro ou cheque, recebe 10% de desconto 2 À vista no cartão de crédito, recebe 15% de desconto 3 Em duas vezes, preço normal de etiqueta sem juros 4 Em duas vezes, preço normal de etiqueta mais juros de 10% 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Preço do produto: ");
        double productPrice = scan.nextDouble();

        System.out.println("Pagamento:");
        System.out.println("1 - À vista em dinheiro ou cheque");
        System.out.println("2 - À vista no cartão de crédito");
        System.out.println("3 - Cartão de crédito, duas vezes");
        System.out.println("4 - Cartão de crédito duas vezes, juros de 10%");

        int paymentMethod = scan.nextInt();
        double finalValue;

        switch (paymentMethod) {
            case 1:
                finalValue = productPrice * 0.90;
                break;
            case 2:
                finalValue = productPrice * 0.85;
                break;
            case 3:
                finalValue = productPrice; 
                break;
            case 4:
                finalValue = productPrice * 1.10;
                break;
            default:
                scan.close();
                return;
            }
            
        scan.close();
        System.out.println("Valor final: " + finalValue);
    }
}
