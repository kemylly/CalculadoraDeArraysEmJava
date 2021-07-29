import java.util.Scanner;

@SuppressWarnings("resource")
public class Entrada {
	/*Nomes e RA dos integrantes
	Kemylly Cavalcante Gonçalves dos Santos - RA:
	Anthony Charles Rezzaghi - RA:  1140782023008
	Francisco D.  Brito Duarte Filho RA:  1140782023036
	Gabrielle de Paula Bueno RA: 1140782023012 */
	
	/**
	 * Efetua leitura de um valor inteiro.
	 * @param prompt mensagem exibida para orientação do usuário.
	 * @return valor inteiro lido.
	 */
	public static int inteiro(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.print(prompt + ": ");
		int valor = sc.nextInt();
		return valor;
	}

	/**
	 * Efetua leitura de um valor inteiro restrita
	 * a uma faixa [min, max].
	 * @param prompt mensagem exibida para orientação do usuário.
	 * @param min valor mínimo da faixa aceitável
	 * @param max valor máximo da faixa aceitável
	 * @return valor inteiro lido.
	 */
	public static int inteiroNaFaixa(String prompt,
			int min, int max) {
		Scanner sc = new Scanner(System.in);
		System.out.print(prompt + "[" + min + "..." 
				+ max + "]? ");
		int valor = sc.nextInt();
		while (valor < min || valor > max) {
			System.out.println("Erro! Fora da faixa!");
			System.out.print(prompt + "[" + min + "..." 
					+ max + "]? ");
			valor = sc.nextInt();
		}
		return valor;
	}

	/**
	 * Efetua leitura de um valor real.
	 * @param prompt mensagem exibida para orientação do usuário.
	 * @return valor double lido.
	 */
	public static double real(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.print(prompt + ": ");
		double valor = sc.nextDouble();
		return valor;
	}

	/**
	 * Efetua leitura de um valor real restrita
	 * a uma faixa [min, max].
	 * @param prompt mensagem exibida para orientação do usuário.
	 * @param min valor mínimo da faixa aceitável
	 * @param max valor máximo da faixa aceitável
	 * @return valor real lido.
	 */
	public static double realNaFaixa(String prompt,
			double min, double max) {
		Scanner sc = new Scanner(System.in);
		System.out.print(prompt + "[" + min + "..." 
				+ max + "]? ");
		double valor = sc.nextDouble();
		while (valor < min || valor > max) {
			System.out.println("Erro! Fora da faixa!");
			System.out.print(prompt + "[" + min + "..." 
					+ max + "]? ");
			valor = sc.nextDouble();
		}
		return valor;
	}

	/**
	 * Efetua leitura de uma linha de texto.
	 * @param prompt mensagem exibida para orientação do usuário.
	 * @return valor String lido.
	 */
	public static String texto(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.print(prompt + "? ");
		String valor = sc.nextLine();
		return valor;
	}
}
