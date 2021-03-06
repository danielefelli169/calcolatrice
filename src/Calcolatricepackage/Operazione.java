package Calcolatricepackage;


public abstract class Operazione
{

	private int operando1;
	private int operando2;

	public int calcola(int operando1, int operando2)
	{
		this.operando1 = operando1;
		this.operando2 = operando2;
		int risultato = this.esegui(operando1,operando2);
		return risultato;
	}

	
	
	public int getOperando1() {
		return operando1;
	}



	public void setOperando1(int operando1) {
		this.operando1 = operando1;
	}



	public int getOperando2() {
		return operando2;
	}



	public void setOperando2(int operando2) {
		this.operando2 = operando2;
	}



	public abstract int esegui(int operando1, int operando2);
		

}
	

