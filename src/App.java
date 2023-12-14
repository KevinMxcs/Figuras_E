import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int lados;
        double longitud;
        
        System.out.println("De cuantos lados es su poligono regular?");
        lados = input.nextInt();
        System.out.println("Cunato mide uno de sus lados? (en cm) ");
        longitud = input.nextDouble();
        PoligonoRegular poligono = new PoligonoRegular(lados,longitud);
        poligono.setLados(lados);
        poligono.setLongitudLado(longitud);
        
        System.out.println(poligono.getAnguloRad());
        System.out.println("Ángulo interior: " + poligono.obtenerAnguloInterior() 
       + " grados");
        System.out.println("Ángulo exterior: " + 
       poligono.obtenerAnguloExterior() + " grados");
        System.out.println("Radio: " + poligono.obtenerRadio() + "cm.");
        System.out.println("Semiperimetro: " + 
       poligono.obtenerSemiperimetro()+ "cm.");
        System.out.println("Vertices:" + "" + poligono.obtenerVertice());
        System.out.println("Perimetro:" + "" + poligono.obtenerPerimetro()+ 
       "cm.");
        System.out.println("Angulo central:" + "" + 
       poligono.obtenerAnguloCentral() + " grados");
        System.out.println("Apotema: "+ poligono.obtenerApotema()+ "cm.");
        System.out.println("Lados: "+ poligono.getLados()+ "cm.");
        System.out.println("Longitud de un lado: " + poligono.getLongitudLado());
        }
    }

