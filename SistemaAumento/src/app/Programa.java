package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dados.Funcionario;

public class Programa {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		List<Funcionario> List = new ArrayList<>();

		System.out.println("Quantos funcionarios serão registrados? ");
		int n = num.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Insira o nome do funcionario #%d\n", i + 1);
			String nome = num.next();
			System.out.printf("Insira o ID do funcionario #%d\n", i + 1);
			int id = num.nextInt();
			System.out.printf("Insira o salario do funcionario #%d\n", i + 1);
			double salario = num.nextDouble();

			Funcionario func = new Funcionario(nome, id, salario);

			List.add(func);
		}
		
		System.out.println("Qual o ID do funcionario que deseja aumentar o salario?");
		int id = num.nextInt();
		double porcentagem = 0;
		Funcionario func = List.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(func == null) {
			System.out.println("Esse ID nao esta na lista");
		}else {
			System.out.println("Insira a porcentagem");
			porcentagem = num.nextDouble();
		
		}
		double salario = func.getSalario();
		
		System.out.println(func.aumentoSalario(salario, porcentagem));
		
		System.out.println("Lista de funcionarios: ");
		for (Funcionario x : List) {
			System.out.println(x);
		}
		num.close();
	}
}
