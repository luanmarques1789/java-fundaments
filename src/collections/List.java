package collections;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		ArrayList<String> aulas = new ArrayList<>();

		String aula1 = "Conhecendo mais de listas", aula2 = "Modelando a classe Aula",
				aula3 = "Trabalhando com Cursos e Sets";

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		String[] aulaArr = { aula1, aula2, aula3 };

		aulas.remove(0);
		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		String str = aulas.get(0);
		System.out.println("A primeira aula � " + str);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}

		aulas.forEach(aula -> {
			System.out.println("Percorrendo");
			System.out.println("Aula: " + aula);
		});

		aulas.add("Aumentando o nosso conhecimento");
		System.out.println(aulas);
		System.out.println("Depois de ordenado:");
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
