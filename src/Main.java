import java.util.Scanner;

public class Main {
	// Напишете програма, която намира сбора на всичките четни елементи в масив.
	public static void task1() {
		int[] numbers = new int[12];

		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				sum = sum + numbers[i];

			}
		}
		System.out.println("Sumata ot 4etnite 4isla e : " + sum);

	}
	// Напишете програма, която попълва числата на Фибоначи в масив.
	// Потребител въвежда колко да е голям масива.

	public static void task2() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] fibonachi = new int[num];
		int first = 0;
		int second = 1;
		for (int i = 0; i < num; i++) {
			fibonachi[i] = first + second;
			first = second;
			second = i;
			System.out.println(fibonachi[i]);
		}

	}

	// Напишете програма, която създава масив с 10 елемента от целочислен тип и
	// инициализира елементите със стойност индекса умножен по 10
	public static void task3() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = i * 10;
			System.out.println(array[i]);

		}

	}

	// Напишете програма, която търси число в масив от числа и връща индекса на
	// първото намерено число.
	public static void task4() {
		int[] array = { 41, 6, 78, 69, 13, 11, 5, 6, 7, 8, 1, 2, 0 };
		for (int a = 0; a < array.length; a++) {
			if (array[a] == 5) {
				System.out.println("Chisloto 5 e na index: " + a);

			}

		}

	}
	// Напишете програма, която обхожда предварително създаден двумерен масив от
	// числа
	// и извежда на екрана само четните.

	public static void task5() {
		int[][] array = { { 1, 2, 3, 4 }, { 55, 56, 57, 58, 59 }, { 111, 112, 131, 158 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[i][j] % 2 == 0) {
					System.out.println(array[i][j]);

				}

			}

		}

	}

	// Напишете програма, която позволява на потребителя да попълва масив с
	// размери 3х4.
	// Изведете масива на екрана.

	public static void task6() {
		int[][] array = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {

				Scanner sc = new Scanner(System.in);
				array[i][j] = sc.nextInt();

			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
	// Напишете програма, която приема от конзолата 2 числа a и b (b > a) и
	// изкарва
	// на екрана всички числа от a до b, които се делят на 3 без остатък

	public static void task7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a");
		int a = sc.nextInt();
		System.out.println("Insert b");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

	}
	// Напишете програма, която принтира на екрана числата от 30 до 1
	// в обратен ред, подредени в 5 реда и 6 колони

	public static void task8() {
		int count = 30;
		int[][] array = new int[5][6];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {

				// Scanner sc = new Scanner(System.in);
				array[i][j] = count;
				count--;

			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
	//Напишете програма,  която пълни двумерен масив с размер NxN, и след това 
	//намерете сумата по главния диагонал. 
	public static void task9(){
		int[][] array = new int[5][6];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {

				Scanner sc = new Scanner(System.in);
				array[i][j] = sc.nextInt();
				

			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
	}


	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task8();
		

	}

}
