package view;

import lib.model.Pilha;

public class Principal
{
	public static void main(String[] args)
	{
		int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		Pilha p = new Pilha();
		
		for (int n: vetor) {
			if (n >= 0)
				p.push(n);
			if (n < 0) {
				try {
					int n1 = p.pop();
					n1 += p.pop();
					p.push(n);
					p.push(n1);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		System.out.println("Número de valores na pilha: " + p.size());
	}	
}