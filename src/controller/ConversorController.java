package controller;

import br.edu.fateczl.vinicius.pilhaint.Pilha;

public class ConversorController {
	Pilha p = new Pilha();
	public String decTobin(int nDecimal){
		String resultado ="";
		int resto=0;
		while(nDecimal!=0){
			resto =  nDecimal%2;
			nDecimal = nDecimal/2;
			empilhar(resto);
		}
		resultado = desempilhar();	
		return resultado;
	}
	
	public String desempilhar() {
		String resultado="";
		while(p.isEmpty()==false) {
			try {
				int valor = p.pop();
				resultado += Integer.toString(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}

	public void empilhar(int resto) {
		p.push(resto);
	}
}
