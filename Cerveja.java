import java.util.Scanner;

public class Cerveja {
	
	public static void main(String[] args) {
		
		int cervejas = 99;
		int resposta;
		Scanner leitor = new Scanner(System.in);
		
		while (cervejas > 1){
			
			System.out.println( cervejas + " cervejas na freezer.");
			System.out.println("Pego uma garrafa, passo pra frente.");
			cervejas--;
			System.out.println("Agora são " + cervejas + " na freezer.");
			
			if (cervejas == 1){
				
				System.out.println("Comprar mais cervejas?");
				System.out.println("Digite 1 para sim.");
				System.out.println("Digite 2 para nao");
				resposta = leitor.nextInt();
				
				if (resposta == 1){
					
					System.out.println("Comprar quantas cervejas?");
					cervejas = leitor.nextInt();
					
				}else {
					
					if (resposta == 2){
						
						System.out.println("Vá dormir");
						
					}else {
						
						System.out.println("Opção inválida! Digite 1 ou 2!");
						resposta = leitor.nextInt();
						
						if (resposta == 1){
							
							System.out.println("Comprar quantas cervejas?");
							cervejas = leitor.nextInt();
							
					}else {
						
						System.out.println("Vá dormir!");
					}
				}
				
			}
			
		}
	}

}
}
