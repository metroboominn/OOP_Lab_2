import java.util.regex.*;
import java.util.Scanner;

public class Main 
	{
    public static void main(String[] args) 
		{
        
		System.out.println("---Проверка на соответствие заданной строчке---");
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");// создание шаблона проверки
        String str  = ""; // создание переменной для ввода строки
        

        Scanner sc1 = new Scanner(System.in); // создание сканнера
        System.out.println("---Введите строчку---"); 
        str = sc1.nextLine(); // ввод строчки
        System.out.println(str + ": " + p1.matcher(str).matches()); // Проверка на соответствие заданной строчке
		}
	}