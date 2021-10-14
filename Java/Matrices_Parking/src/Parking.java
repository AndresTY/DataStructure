
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Parking {
    private Object [] parqueadero;
    private float posicion;
    private int precio = 98;
    private int motos;
    private int carros;
    private int camiones;
    private double PrecioTotal;
    protected double producido;
    protected int t=0;
    
    public Parking(){
        this.parqueadero = new Object [150];
    }
    
    public String hora(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return (dateFormat.format(date));
    }
    
    public void ingreso(String b, Object a){
        
        if("moto".equals(b)){
            motos++;
            System.out.println("entro a motos");
        }
        if("carro".equals(b)){
            carros++;
            System.out.println("entro a carro");
        }
        if("camion".equals(b)){
            camiones++;
            System.out.println("entro a camion");
        }
        
        while(t<parqueadero.length){
            if(parqueadero[t]==null){
                parqueadero[t]=a;
                System.out.println("ingresado");
                break;
            }
            t++;
        }
        
        recibo(a);
    }
    
    public void salir(int a,double min){
        parqueadero[a]=null;
        valor(min);
    }
    
    public float cantidad(){        
        posicion = (parqueadero.length)-(((motos/2))+(carros)+(camiones*2));
        System.out.println(motos);
        System.out.println(carros);
        System.out.println(camiones);
        return posicion;
    }
    public void valor(double min){
        double temp;
        temp = min*precio;
        
        if(min<720){
        	System.out.println(temp);
            PrecioTotal = temp - (temp*0.15);
            System.out.println(temp);
        }
        if(min==720 || min<1440){
        	System.out.println(min);
            PrecioTotal = (720*0.15)+(precio*(min-720));
        }
        if(min>1440){
        	System.out.println(min);
        	System.out.println((int)(min/24));
        	temp=(precio*((int)(min/24)))*0.2;
            PrecioTotal = (precio*min)-temp;
        }
        
        System.out.println("debe pagar: "+PrecioTotal);
        producido();
    }
    
    public void recibo(Object a){
        System.out.println("cliente: "+a);
        System.out.println("su parqueadero es: "+t);
        System.out.println(cantidad());

    }
    
    
    public double producido() {
    	producido += PrecioTotal;
    	return producido;
    }
    
    public Object buscar(int indice) {
    	return (parqueadero[indice]);
    }
}
