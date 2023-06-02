package view;

import control.NumeroController;
import model.ListaString;

public class Main {
	
	
	public static void main(String[] args) {
		
		String[] vetor = {"11949973809","1138094593","3394832745"};
		NumeroController control = new NumeroController();
		int tamanho = vetor.length;
				
		for(int i=0;i<tamanho;i++) {
			control.insereNumero(vetor[i]); 
		}
		
		ListaString ddd = control.getNumerosRegiao("11");
		
		while(!ddd.isEmpty()) {
			try {
				System.out.println(ddd.get(0));
				ddd.removeFirst();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
