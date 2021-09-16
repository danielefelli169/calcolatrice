package Calcolatricepackage;


public class Main 
{
		 
	public static void main(String[] args)
	{	
		
		Operazione somma = new Somma();
		int risultato = somma.calcola(10, 25);      
		System.out.println("La somma é: " + risultato);
		
		Operazione sottrazione = new Sottrazione();
		risultato = sottrazione.calcola(10, 2);      
		System.out.println("La sottrazione é: " + risultato);
		
		Operazione moltiplicazione = new Moltiplicazione();
		risultato = moltiplicazione.calcola(10, 2);      
		System.out.println("La moltiplicazione é: " + risultato);
		
		Operazione divisione = new Divisione();
		risultato = divisione.calcola(10, 2);      
		System.out.println("La divisione é: " + risultato);
		              
	}
	
}

	