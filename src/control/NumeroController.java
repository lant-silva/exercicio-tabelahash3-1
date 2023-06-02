package control;

import model.ListaString;

public class NumeroController {
	ListaString[] codigoRegiao;
	
	public NumeroController() {
		codigoRegiao = new ListaString[100];
		int tamanho = codigoRegiao.length;
		for(int i=0;i<tamanho;i++) {
			codigoRegiao[i] = new ListaString();
		}
	}
	
	public void insereNumero(String ddd) {
		int hash = hashCode(ddd.substring(0, 2));
		ListaString regiao = codigoRegiao[hash];
		if(regiao.isEmpty()) {
			regiao.addFirst("("+hash+")"+ddd.substring(2));
		}else {
			try {
				regiao.addLast("("+hash+")"+ddd.substring(2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ListaString getNumerosRegiao(String ddd) {
		int hash = hashCode(ddd.substring(0, 2));
		ListaString aux = new ListaString();
		int tamanho = codigoRegiao[hash].size();
		
		for(int i=0;i<tamanho;i++) {
			try {
				if(aux.isEmpty()) {
					aux.addFirst(codigoRegiao[hash].get(0));
				}else {
					aux.add(codigoRegiao[hash].get(i), i);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return aux;
	}
	
	public int hashCode(String ddd) {
		int dddnum = Integer.parseInt(ddd);
		int aux = dddnum >= 11 ? dddnum %= 100 : 0;
		return aux;
	}
}
