package application;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];
		
		System.out.print("How many rooms will be rented?  ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			aluguel[room] = new Aluguel(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			
			if(aluguel[i] != null) {
			
				System.out.println(i + ": " + aluguel[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
