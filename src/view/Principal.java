package view;

import br.gui.arvoreint.Arvore;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {30, 15, 60, 10, 20, 40, 80};
		Arvore arvore = new Arvore();
		
		for (int i : vetor) {
			arvore.insert(i);
		}
		
		try {
			arvore.remove(60);
			arvore.infixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());	
		}
	}

}
