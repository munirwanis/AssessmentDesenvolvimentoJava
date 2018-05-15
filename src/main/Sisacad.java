package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.SalarioInvalidoException;
import negocio.Administrativo;
import negocio.Aluno;
import negocio.Curso;
import negocio.Pessoa;
import negocio.Professor;

public class Sisacad {
	private static Scanner scanner = new Scanner(System.in);
	
	static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	static List<Curso> cursos = new ArrayList<Curso>();
	
	public static void main(String [] args) {
		preencherCursos();
		preencherPessoas();
		menu();		
	}
	
	private static void preencherCursos() {
		cursos.add(new Curso("C#", 20));
		cursos.add(new Curso("Java EE", 10));
		cursos.add(new Curso("iOS com Swift", 30));
		cursos.add(new Curso("Android com Kotlin", 40));
		cursos.add(new Curso("Python", 20));
		cursos.add(new Curso("Ruby", 15));
	}
	
	private static void preencherPessoas() {
		pessoas.add(new Aluno("Munir Wanis", "123.456.123.45", "12345678", cursos));
		pessoas.add(new Professor("Filipe", "242.424.242.42", "24242424", cursos));
		pessoas.add(new Aluno("Rodrigo Filomeno", "666.666.666.66", "66666666", cursos));
		pessoas.add(new Professor("Gabriel", "987.654.321.69", "987654321", cursos));
		
		try {
			pessoas.add(new Administrativo("Victor Hugo", "696.969.696.96", "69696969", 2500));
		} catch (SalarioInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void menu() {
		System.out.println("1 - Consultar");
		System.out.println("0 - Fechar Sistema");
		System.out.println("Opcao: ");
		int opcao;
		do {
			opcao = scanner.nextInt();
			switch(opcao){
			case 1:
				consultar();
				break;
			case 0:   
				continue;
			default:
				System.out.println("Opção inválida.");
			}
		} while(opcao != 0);
	}

	public static void consultar() {
		System.out.println("0 - Voltar");
		System.out.println("Digite a matrícula: ");
		String matricula = "";
		
		while(!matricula.equalsIgnoreCase("0")) {
			matricula = scanner.nextLine();
			
			boolean encontrado = true;
			
			for (Pessoa pessoa : pessoas) {
				if (pessoa.getMatricula().equalsIgnoreCase(matricula)) {
					encontrado = true;
					if (pessoa instanceof Aluno) {
						System.out.println(((Aluno) pessoa).toString());
					} else if (pessoa instanceof Professor) {
						System.out.println(((Professor) pessoa).toString());
					} else if (pessoa instanceof Administrativo) {
						System.out.println(((Administrativo) pessoa).toString());
					} else {
						System.out.println(pessoa.toString());
					}
					break;
				} else {
					encontrado = false;
				}
			}
			
			if (!encontrado) {
				System.out.println("Pessoa não encontrada.");
			}
			
		}
		menu();
	}

}
