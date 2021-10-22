package parte2;

import java.util.*;

public class TesteScanner2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String Texto="";
		String chat=":-(";
		String diver = ":-)";
		int contd=0;
		int contc =0;

		do {
		System.out.println("Escreva sua mensagem aqui... Ou pressione 0 para sair ");
		Texto = sc.nextLine();
		
		for (int i = 0;i<Texto.length();i++) {
			contc=0;
			contd=0;
		if (Texto.indexOf(chat) != -1) { contc++;}
		if (Texto.indexOf(diver) != -1) { contd++;}
		}
		if (contd<contc) {
		System.out.println("Você está chateado");
		} if(contd>contc) {
		System.out.println("Você está divertido");}
		if (contd==contc) {System.out.println("Você está neutro");}
		} while (Texto != "0");
		if (Texto=="0");{
		System.out.println("Saindo...");
		}
		}
		
	}

