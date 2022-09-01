import java.util.Scanner;

public class Pruebagit {

	public static void main(String[] args) {
		int num;
		String mensaje;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingrese mensaje: ");
		mensaje = in.nextLine();
		
		System.out.print("Ingrese cantidad: ");
		num = in.nextInt();
		
	for(int i = 1; i <= num; i++){
			System.out.println(mensaje);
		}

	}

}
