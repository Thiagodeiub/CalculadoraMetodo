import java.util.Scanner;

public class CalculadoraMetodo {





        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Calcular calc = new Calcular();

            System.out.println("Entre com o primeiro numero: ");
            calc.n1 = scan.nextDouble();
            System.out.println("Entre com o segundo numero: ");
            calc.n2 = scan.nextDouble();
            System.out.println("Entre com o operador (+ ou - ou * ou /): ");
            calc.operador = scan.next().charAt(0);

            System.out.println(calc);


            scan.close();
        }

    }

