package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Juego {
	private static final String TIJERAS = "tijeras";
	private static final String PAPEL = "papel";
	private static final String PIEDRA = "piedra";
	private static final String JUGADOR_1_GANA = "Jugador 1 GANA";
	private static final String JUGADOR_2_GANA = "Jugador 2 GANA";

	public static void main(String args[])
    {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego = false;  
        Integer rondasjugadas = 0;    // Número de rondas jugadas
        Integer exitosJugador1 = p1.getExitos();
        Integer exitosJugador2 = p2.getExitos();
        Integer empates = 0;
        String opcionJugador1, opcionJugador2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasjugadas + " *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            opcionJugador1=p1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcionJugador2 = p2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcionJugador1.equals(PIEDRA)) && (opcionJugador2.equals(PAPEL)))
            {
                System.out.println(JUGADOR_2_GANA);
                exitosJugador2++;
                
            }
            else if((opcionJugador1.equals(PAPEL)) && (opcionJugador2.equals(PIEDRA)))
            {
            	exitosJugador1++;
                System.out.println(JUGADOR_1_GANA);
            }
            else if((opcionJugador1.equals(PIEDRA)) && (opcionJugador2.equals(TIJERAS)))
            {
            	exitosJugador1++;
                System.out.println(JUGADOR_1_GANA);
            }
            else if((opcionJugador1.equals(TIJERAS)) && (opcionJugador2.equals(PIEDRA)))
            {
            	exitosJugador2++;
                System.out.println(JUGADOR_2_GANA);
            }
            else if((opcionJugador1.equals(TIJERAS)) && (opcionJugador2.equals(PAPEL)))
            {
            	exitosJugador1++;
                System.out.println(JUGADOR_1_GANA);
            }
            else if((opcionJugador1.equals(PAPEL)) && (opcionJugador2.equals(TIJERAS)))
            {
            	exitosJugador2++;
                System.out.println(JUGADOR_2_GANA);
            }
            if(opcionJugador1 == opcionJugador2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasjugadas++;
            if((exitosJugador2 >= 3) || (exitosJugador2 >= 3))
            {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finDeJuego != true);
    }
}

/**
 *
 */
class Jugador {

	private static final String TIJERAS = "tijeras";
	private static final String PAPEL = "papel";
	private static final String PIEDRA = "piedra";
	/**
	 * Escoge piedra, papel o tijera al azar
	 */
	public String opcionAlAzar() {
		String opcion = "";
		Integer c = (int) (Math.random() * 3);
		switch (c) {
		case 0:
			opcion = PIEDRA;
			break;
		case 1:
			opcion = PAPEL;
			break;
		case 2:
			opcion = TIJERAS;
		}
		return opcion;
	}

	public void setExitos() 
    {
        exitos++;
    }

	public int getExitos() 
    {
        return(exitos);
    }

	private int exitos; // número de partidas ganadas
	private int winTotal;
}
