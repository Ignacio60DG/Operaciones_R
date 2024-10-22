import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)Math.floor(Math.random()*100-1);
        int b = (int)Math.floor(Math.random()*100-1);
        System.out.println("a es "+a+" b es "+b+", dime si los quieres sumar=1, multiplicar=2 o dividir=3");
        int opcion= sc.nextInt();

        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a * b;

        if(a>=1 && a<=99 && b>=1 && b<=99) {
            if(opcion==1) {
                System.out.println("¡¡Has elegido la suma!!. Genial procede a sumar :D");
                int numero = sc.nextInt();
                if(numero == suma){
                    System.out.println("Suma correcta");
                }else{
                    System.out.println("Suma incorrecta");
                }
            }else if(opcion==2) {
                System.out.println("¡¡Has elegido la resta!!. Bueno procede a restar :|");
                int numero = sc.nextInt();
                if(numero == resta){
                    System.out.println("Resta correcta");
                }else{
                    System.out.println("Resta incorrecta");
                }
            }else if(opcion==3) {
                System.out.println("¡¡Has elegido la multiplicación!!. Estupendo procede a multiplicar :*");
                int numero = sc.nextInt();
                if(numero == multiplicacion){
                    System.out.println("Multiplicación correcta");
                }else{
                    System.out.println("Multiplicación incorrecta");
                }
            }else{
                System.out.println("Opción invalida");
            }
        }else{
            System.out.println("Los datos no cumplen con las características de ser mayores o iguales que uno y menores de 100");
        }
        sc.close();
    }
}