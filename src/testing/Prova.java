package testing;

public class Prova {

	   public static void main(String[] args) {

	        int vetor[ ] = {1, 5, 10, 12, 13, 16, 30, 39, 40, 43, 50, 58, 60, 70};

	        int buscar = 70;

	        int menor = 0;

	        int maior  = vetor.length - 1;

	        int indice = -1;

	 

	        while (menor <= maior) {

	            int meio = (menor + maior) / 2;

	            if (vetor[meio] == buscar) {

	                indice = meio;

	                System.out.println("meio");

	                break;

	            }

	            else if (vetor[meio] < buscar){

	                System.out.println("pra direita");

	                menor = meio + 1;

	            }

	            else{

	                maior = meio - 1;

	                System.out.println("pra esquerda");

	            }

	        }

	 

	        if (indice < 0){

	            System.out.println("\n N�mero  " + buscar + " n�o encontrado.");

	        } else{

	            System.out.println("\n N�mero " + buscar + " encontrado na posi��o [" + indice + "] = ");

	        }

	    }

	}


