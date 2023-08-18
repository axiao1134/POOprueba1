
public class Main {
    public static void main(String[] args) {
        String Invertida= invertir_cadena();
        System.out.println("la cadena invertida es"+Invertida);
        int numero1= sumar();
        System.out.println("la suma de los numero apres es"+numero1);
        double promedio_final= calcular_promedio();
        resultado(promedio_final);
    }
    public  static String invertir_cadena(){
        String cadena_original="hola mundo";
        String cadena_invertida="";
        for (int indice = cadena_original.length() - 1; indice >= 0 ; indice--){
            cadena_invertida += cadena_original.charAt(indice);

        }
        return cadena_invertida;


    }
    public static int sumar(){
        int[] arrgelo={1,2,3,4,5,98,79,82,9,10};
        int sumar_total=0;
        for (int numero=0;numero<arrgelo.length;numero++){
            if (arrgelo[numero]%2==0){
                sumar_total= sumar_total+arrgelo[numero];



            }


        }
        return  sumar_total;

    }
    public static double calcular_promedio(){
        double[] notas={5.6,6.2,4.6};
        double sumar_notas=0;
        for (int nota=0;nota<notas.length;nota++){
            sumar_notas += notas[nota];
        }
        double promedio = sumar_notas/notas.length;
        return promedio;
    }
    public static void resultado(double promedio_final){
        if (promedio_final<3.6){
            System.out.println("reprobado");
        } else if (promedio_final>=3.6 && promedio_final<4) {
            System.out.println("examne");

        }else {
            System.out.println("aprobado");
        }

    }
}