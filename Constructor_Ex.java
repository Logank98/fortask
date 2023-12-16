package com.constructor;

public class Constructor_Ex {
	public Constructor_Ex() {
		System.out.println("The First Statement");
	}

	public Constructor_Ex(int m) {
		System.out.println(m); 
	}

	public Constructor_Ex(String name) {
		System.out.println(name);
	}

	public Constructor_Ex(int s, int t) {

		System.out.println("Your Mark is" + 23 + 45);
	}

	public static void main(String[] args) {
		Constructor_Ex demo = new Constructor_Ex();
		new Constructor_Ex("Loganathan");
		
		System.out.println("---------Task-1-----------");//task-1
		for (int a = 1; a <= 5; a++) {
			for (int i = 1; i <= a; i++) {
				System.out.print(" ");
			}
			for (int j = a; j <= 5; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println("-------------Task-2-----------");//Task-2
			for (int a = 1; a <= 5; a++) {
				for (int i = 0; i <= a; i++) {
					System.out.print(" ");
				}
				for (int j = 5; j >= a; j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for (int a = 1; a < 5; a++) {
				for (int i = 5; i >= a; i--) {
					System.out.print(" ");
				}
				for (int j = 0; j <= a; j++) {
					
					System.out.print("* ");
				}
				System.out.println();
			}
		System.out.println("-------------Task-3-------------");//Task-3
		for (int a = 1; a <= 5; a++) {
			for (int i = 5; i >= a; i--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= a; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------Task-4-------------");//Task-4
			for (int a = 1; a <= 5; a++) {
				for (int i = 5; i > a; i--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int a = 1; a <= 5; a++) {
				for (int i = 1; i <= a; i++) {
					System.out.print(" ");
				}
				for (int j = 4; j >=a; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			

	}
}
