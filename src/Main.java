import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //99 numero de elementos que voy a mostrar
        int a = (int)(Math.random()*99+1);
        int b = (int)(Math.random()*99+1);
        System.out.println("a es "+a+" b es "+b+", suma, multiplica o divide");
        int opcion= (int) (Math.random()*3);

        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a * b;

            if(opcion==1) {
                System.out.println("¡¡Has sido elegido por la suma!!. Genial procede a sumar :D");
                int numero = sc.nextInt();
                if(numero == suma){
                    System.out.println("Suma correcta");
                }else{
                    System.out.println("Suma incorrecta");
                }
            }else if(opcion==2) {
                System.out.println("¡¡Has sido elegido por la resta!!. Bueno procede a restar :|");
                int numero = sc.nextInt();
                if(numero == resta){
                    System.out.println("Resta correcta");
                }else{
                    System.out.println("Resta incorrecta");
                }
            }else if(opcion==3) {
                System.out.println("¡¡Has sido elegido por la multiplicación!!. Estupendo procede a multiplicar :*");
                int numero = sc.nextInt();
                if(numero == multiplicacion){
                    System.out.println("Multiplicación correcta");
                }else{
                    System.out.println("Multiplicación incorrecta");
                }
            }else{
                System.out.println("Opción invalida");
            }
        sc.close();
    }
}