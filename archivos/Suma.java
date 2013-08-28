public class Suma ()
{
	
	// constructor
	public Suma ()
	{

	}

	// metodo para hacer la suma de dos numeros
	public int sumaSencilla (int a, int b)
	{
		// suma
		return a + b;
	}

	// metodo para hacer una suma compleja
	public int sumaCompleja (int [] numeros)
	{
		// contador
		int contador = 0;

		for (int a : numeros)
		{
			// a contador se suma el valor que toma la variable a
			contador += a;		
		}

		return contador;
	}

}