import java.util.*;

public class Menu {

	public static void main(String[] args) {
		
		System.out.println("Para inserir ofertas digite: 1");
		System.out.println("Para atualizar a primeira oferta digite: 2");	 
		System.out.println("Para excliur a segunda oferta digite: 3");
		System.out.println("Se quiser sair digite: 0");
		
		Scanner sc = new Scanner (System.in);
		int menu = sc.nextInt();
		
		boolean salir =false;
		int op;
		
		while(!salir) {
			System.out.println("Para inserir ofertas digite: 1 \nPara atualizar a primeira oferta digite: 2 \nPara excliur a segunda oferta digite: 3 \nSe quiser sair digite: 0");
				op=sc.nextInt();
		
				
			switch(op) {
			case 1: 
				System.out.println("Você criou tres novas ofertas:");
		break;
			case 2:
				System.out.println("A primeira oferta foi atualizada com sucesso");
		break;
			case 3:
				System.out.println("Você excluiu a segunda oferta ");
		break;
			case 0:
				salir=true;
				System.out.println("Saindo... ");
			break;
		}
		}}
}
		
			

			
	
		
