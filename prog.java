import java.util.Scanner;

public class DivisaoDeNumeros {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o valor do dividendo: ");
		int dividendo = input.nextInt();
		
		System.out.println("Insira qual o valor do divisor: ");
		int divisor = input.nextInt();
		
		if(divisor==0){
			System.out.println("-1");
		}
		else if ((dividendo / divisor < 0)){
			System.out.println("Valor encontrado: 0")
		}
		else{
			System.out.println("Valor calculado: " + dividendo / divisor)
		}
	}
}