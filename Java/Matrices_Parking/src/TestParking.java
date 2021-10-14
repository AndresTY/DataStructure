import java.util.Scanner;

public class TestParking {
    public static void main(String[] args) {
    	boolean system = true;
    	int option;
    	String id;
    	String name;
    	String lastName;
    	String idCar;
    	String marca;
    	String color;
    	String model;
    	String date;
    	String hour;
    	String vehiculo;
    	
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        Parking lugar = new Parking();
        
        
        System.out.println("(dd/mm/aa) fecha: ");
        date = input.next();
        
        do {
        	System.out.println("-------parkeadero-------");
            System.out.println("1.ingreso");
            System.out.println("2.salida");
            System.out.println("3.buscar");
            System.out.println("4.Cerrar sistema");
            option = input.nextInt();
            
            switch(option) {
            
            	case 1:
            		System.out.println("digite la siguiente infomarción del conductor");
            		System.out.println("nombre: ");
            		name=input.next();
            		System.out.println("apellido: ");
            		lastName=input.next();
            		System.out.println("identificacion: ");
            		id=input.next();
            		System.out.println("==========================================");
            		System.out.println("digite la informacion del vehiculo");
            		System.out.println("tipo de carro: ");
            		vehiculo = input.next();
            		System.out.println("placa: ");
            		idCar = input.next();
            		System.out.println("marca: ");
            		marca = input.next();
            		System.out.println("color: ");
            		color = input.next();
            		System.out.println("modelo");
            		model = input.next();
            		hour = lugar.hora();
            		
            		conductor driver = new conductor(id,name,lastName);
                    vehiculo cars = new vehiculo(idCar, marca,color,model,date,driver,hour);
                    lugar.ingreso(vehiculo.toLowerCase(), cars);
                    
                    break;
            	
            	case 2:
            		System.out.println("digite la posicion del carro a salir y luego los minutos de parqueo");
            		lugar.salir(input.nextInt(), input.nextDouble());
            		
            		break;
            	
            	case 3:
            		System.out.println("digite el parqueadero a buscar");
            		System.out.println(lugar.buscar(input.nextInt()));
            		break;
            		
            	case 4:
            		System.out.println("Sistema Cerrado");
                    System.out.println("Dinero ganado"+lugar.producido);
                    system = false;
                    break;
                
                default:
                	break;
            }
        }while(system == true);
        
    }
}
