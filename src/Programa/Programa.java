package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Departamento;
import Entidades.HoraContrato;
import Entidades.Trabalhador;
import Entidades_enum.NivelTrabalhador;

public class Programa {
	
	public static void main (String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.println("Entre trabalhador data:");
		System.out.print("Nome: ");
		String trabalhadorNome = sc.nextLine();
		System.out.print("Nível: ");
		String niveltrabalhador = sc.nextLine();
		System.out.print("Salario Base: ");
		double salariobase = sc.nextDouble();
				
		Trabalhador trabalhador = new Trabalhador(trabalhadorNome, NivelTrabalhador.valueOf(niveltrabalhador), salariobase, new Departamento(departamentoNome));
		
		System.out.print("Quantos contrato esse trabalhador vai ter: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Entre contrato # " + i + "data: ");
			System.out.print("Date DD/MM/YYYY: ");
			Date contratoData = sdf.parse(sc.next());
			System.out.print("Valor por hora:");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração do contrato (hora): ");
			int hora = sc.nextInt();
			
			HoraContrato  contrato = new HoraContrato(contratoData,valorPorHora, hora);
			trabalhador.adcionarContrato(contrato);
		}
		System.out.println();
		System.out.print("Digite com o mes e o ano para calcular o salario:(MM/YYYY) ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int year = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome " + trabalhador.getNome());
		System.out.println("Departamento " + trabalhador.getDepartamento().getName());
		System.out.println("Renda por " + mesEAno + ": " + String.format("%.2f",trabalhador.renda(year, mes)));
		
	}
}
