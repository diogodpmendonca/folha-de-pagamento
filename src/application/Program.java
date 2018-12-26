package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;
import model.entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> lista = new ArrayList<>();
				
		System.out.println("Quantos funcionários deseja listar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("O funcionário é terceirisado ? Y/N ");
			char c = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Horas trabalhadas: ");
			int h = sc.nextInt();
			System.out.println("Valor da hora de trabalhada: ");
			double v = sc.nextDouble();
			
			if(c == 'n' || c == 'N' ) {
				lista.add(new Employee(nome, h, v));
			}else {
				System.out.println("Despesa extra: ");
				double a = sc.nextDouble();
				lista.add(new OutsourceEmployee(nome, h, v, a));
			}
		}
		
		for(Employee ep: lista) {
			System.out.println(ep.toString());
		}
		sc.close();

	}

}
