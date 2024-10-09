import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//Duas palavras são um "par inverso" se uma for o contrário da outra. Escreva um programa em Java
		//que leia um conjunto de palavras em em seguida encontre todos os pares inversos na lista de palavras
		
		Scanner in = new Scanner(System.in);
		String[] palavras = new String[5];
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.print("Digite uma palavra: ");
			palavras[i] = in.next();	
		}
		
		in.close();
		
		parInverso(palavras);

	}
	
	public static void parInverso (String[] palavras) {
		
		String palavra, aux;
		boolean status = false;
		
		for (int i = 0; i < palavras.length; i++) {
			palavra = palavras[i];
			for (int j = 0; j < palavra.length() - 1; j++) {
				aux = palavras[j + 1];
				if (palavra.charAt(i) == aux.charAt(aux.length() - i - 1)) {
					status = true;
				}
	
			}
			
		}
		if (status) {
			System.out.println("Par Inverso");
			return;
		}
		System.out.println("Não é um par inverso");
	}
}
		
		/*Resolução do professor
			
			String[] lista = new String[5];
			
			lerPalavra(lista);
			localizarPar(lista);
			
			public static void lerPalavra (String[] lista) {
				Scanner in = new Scanner(System.in);
				for (int i = 0; i < lista.lengh(); i++) {
					System.out.print(" --> ");
					lista[i] = in.next();
				}
				
			}
			
			public static void localizarPar (String[] lista) {
				char[] invertida;
				for (String palavra : lista) {
					invertida = inverter(palavra);
				}
				
			}
			
			public static String inverter (String[] palavra) {
				char[] letra =  new char[palavra.lenght()];
				for (int i = palavra.lenght() - 1; i >= 0; i++) {
					letra[palavra.length() - 1 - i] = palavra.charAt(i);
				}
				String aux = new String(letra);
				return aux;
			}
			
			*/


