import java.until.Scanner;
public class Questao5M
{
	public static void main(String a[])
	{
		Scanner cin = new Scanner(System.in);
		float altura;
		String sexo;
		float pesoIdeal;
		System.out.print("Digite a altura: "); altura = cin.nextFloat();
		System.out.print("Digite o sexo: "); sexo = cin.next();
		
		if (sexo.equals("M"))
		{
			pesoIdeal = 72.7f * altura - 58;
		}
		else
		{
			pesoIdeal = 62.1f * altura - 44.7f;
		}
		System.out.print("Peso ideal calculado: " + pesoIdeal);
	}
}