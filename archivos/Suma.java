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

	// metodo para hacer la resta de dos numeros
	public int restaSencilla (int a, int b)
	{
		// resta
		return a - b;
	}

	public int restaCompleja(int [] numeros)
	{
		// contador
		int contador = 0;

		// se inicia el contador
		contador = numeros[0] * 2;

		for (int a : numeros)
		{
			// a contador se le resta el valor que toma la variable a
			contador -= a;
		}

	}

}