import java.util.Scanner;

class Calculadora {

	public static void main(String[] args) {
		
		/*Nomes e RA dos integrantes
		Kemylly Cavalcante Gonçalves dos Santos - RA: 1140482022041
		Anthony Charles Rezzaghi - RA:  1140782023008
		Francisco D.  Brito Duarte Filho RA:  1140782023036
		Gabrielle de Paula Bueno RA: 1140782023012 */
		
		Scanner sc = new Scanner(System.in);
		
		int resp = 0;
		
		while(resp != 8)
		{
			resp = Inicio();
			
			if(resp == 1 || resp == 2 || resp == 3 || resp == 4 || resp == 5 || resp == 6 || resp == 7)
			{
				
				int tam = tamanhoArray();
				
				double X[] = new double[tam];
				double Y[] = new double[tam];
				double Z[] = new double[tam];
				
				if(resp == 1 || resp == 2 || resp == 3 || resp == 4)
				{	
					lerArray(X);
					lerArray(Y);
					
					if(resp == 1)
					{
						somarArrays(X, Y);
					}	
					if(resp == 2)
					{
						subtracaoArrays(X, Y);
					}
					
					if(resp == 3)
					{	
						ArraysMultiplicao(X, Y);
					}
					
					if(resp == 4)
					{
						ArraysDivisao(X, Y);
					}

					apresentarArray(X, Y);
				}
				
				if(resp == 5)
				{
					lerArray(X);
					lerArray(Y);
					
					apresentarUnicoArray(X, "Valor incial do Array A");
				    apresentarUnicoArray(Y, "Valor incial do Array B");
					
					inverterArray(X, Y, Z);
				}
				
				if(resp == 6)
				{
					lerArray(X);
					
					System.out.print("Digite o numero da constante: ");
					double K = sc.nextInt();
					
					ArraysMultiplicaoConstante(X, K);
					
					apresentarUnicoArray(X, "Valores final do array");
				}
				
				if(resp == 7)
				{
					lerArray(X);
					lerArray(Y);
					
					SomarTodosElementos(X);
					SomarTodosElementos(Y);
				}
				
			}
			
			else{
				System.out.println("*** Resposta Invalida! ***");
			}
		}
		
		System.out.println("Fim do programa! :) ");
	}
	
	public static int Inicio() //menu
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("\nCalculadora de Arrays");
		System.out.println("Digite o numero da operação que deseja fazer: ");
		System.out.println("===========");
		System.out.println("1 - Somar Arrays");
		System.out.println("2 - Subtrair Arrays");
		System.out.println("3 - Multiplicar Arrays");
		System.out.println("4 - Dividir Arrays");
		System.out.println("5 - Trocar Arrays");
		System.out.println("6 - Multiplicar Array por uma constante");	
		System.out.println("7 - Somar todos elementos dos Arrays");
		System.out.println("8 - Sair");
		System.out.print("Resposta: ");
		int resp = sc.nextInt();
		
		return resp;
		
	}
	
	private static int tamanhoArray()
	{
		System.out.println(" ");
		
		int TAM = Entrada.inteiro("Digite o tamanho que terá os arrays ");
		
		return TAM;
	}
	
	private static void lerArray(double[] x) {
		System.out.println(" ");
		System.out.println("Leitura de Array");
		
		for (int i = 0; i < x.length; i++) {
			x[i] = Entrada.real("Digte o valor da posicao[" + i + "]");
		}
	}
	
	private static void somarArrays(double[] x, double[] y) {
		System.out.println(" ");
		System.out.println("Soma dos Arrays");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " + " + y[i]);
			x[i] = x[i] + y[i];
			System.out.println(" = " + x[i]);
		}
	} 	
	
	private static void subtracaoArrays(double[] x, double[] y) {
		System.out.println(" ");
		System.out.println("Subtração dos Arrays");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " - " + y[i]);
			x[i] = x[i] - y[i];
			System.out.println(" = " + x[i]);
		}
	} 
	
	private static void ArraysMultiplicao(double[] x, double[] y) {
		System.out.println(" ");
		System.out.println("Multiplicação dos Arrays");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " * " + y[i]);
			x[i] = x[i] * y[i];
			System.out.println(" = " + x[i]);
		}
	}
	
	private static void ArraysDivisao(double[] x, double[] y) {
		System.out.println(" ");
		System.out.println("Divisão dos Arrays");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " / " + y[i]);
			x[i] = x[i] / y[i];
			System.out.println(" = " + x[i]);
		}
	}
	
	private static void ArraysMultiplicaoConstante(double[] x, double cont) {
		System.out.println(" ");
		System.out.println("Multiplicação do Array por " + cont);
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("\n" + x[i] + " * " + cont);
			x[i] = x[i] * cont;
			System.out.println(" = " + x[i]);
		}
	}

	private static void apresentarArray(double[] x, double[] y)
	{
		System.out.println(" ");
		System.out.println("Resultado final dos arrays: ");
		
		System.out.print("\nValores no Array B: ");
		for (int i = 0; i < y.length; i++) {
			System.out.print(" [" + y[i] + "] ");
		}
		
		System.out.print("\nResultados no Array A: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(" [" + x[i] + "] ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
	}
	
	private static void inverterArray(double[] arrayA, double[] arrayB, double[] arrayC) 
	{
		arrayC = arrayA;
	    arrayA = arrayB;
	    arrayB = arrayC;
	    
	    apresentarUnicoArray(arrayA, "Valor trocado do Array A");
	    apresentarUnicoArray(arrayB, "Valor trocado do Array B");

	}
	
	private static void SomarTodosElementos(double[] x)
	{
		double total = 0;
		
		System.out.println(" ");
		System.out.println("Somar todos os elementos do Array");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " + ");
			total += x[i];
		}
		
		System.out.println("\nTotal = " + total);
	}
	
	private static void apresentarUnicoArray(double x[], String conteudo)
	{
		System.out.println(" ");
		
		System.out.print("\n" + conteudo + ": ");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(" [" + x[i] + "] ");
		}
	}
}
