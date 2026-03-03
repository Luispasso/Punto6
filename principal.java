import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, con;
        metodo o= new metodo();
        System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ");
        int n = sc.nextInt();
        objsup[][] m=new objsup[n][n];
        m = o.LlenarMatris(m);

        while (true) {
            System.out.println("1. VER PRODUCTOS DISPONIBLES");
            System.out.println("2. VER EL TOTAL DE LOS PRODUCTOS QUE ESTAN EN OFERTA");
            System.out.println("3. SALIR");
             opc = sc.nextInt();
             if(opc == 3)
                break;
             con = o.mercado(m, opc);
             if(opc == 2)
                o.imprimir(m, opc, con);
        }
        
    }
    
}
