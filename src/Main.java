import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora= new Calculadora();
        Scanner input = new Scanner(System.in);
        String operacion;

        do {
            // MenÃº para seleccionar la operaciÃ³n a realizar.
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println(" + para sumar.");
            System.out.println(" - para restar.");
            System.out.println(" * para multiplicar.");
            System.out.println(" / para dividir.");
            System.out.println(" % para obtener el módulo");
            System.out.println(" = para terminar");
            operacion = input.nextLine();
            if(!operacion.equals("=") && (operacion.equals("+") || operacion.equals("-") || operacion.equals("*")
                    || operacion.equals("/") || operacion.equals("%"))){
                // llamado del mÃ©todo que define la operaciÃ³n segun lo ingresado por el usuario
                System.out.println(calculadora.ejecutarOperacion(operacion));
                System.out.println("Oprima enter para continuar.");
                input.nextLine();
            }else {
                if(operacion.equals("=")){
                    System.out.println(calculadora);
                    System.out.println("Operación finalizada");
                    System.out.println("Hasta pronto");
                }else {
                    System.out.println("Operación no válida");
                    System.out.println("Oprima enter para continuar.");
                    input.nextLine();
                }
            }

        }while (!operacion.equals("="));
    }
}