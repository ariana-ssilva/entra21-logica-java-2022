package br.com.entra21.aula14.matrizes;

import java.util.Scanner;

public class Main {
static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {

 byte option;

 do {
System.out.println(runMenu());
option = input.nextByte();
switch (option) {
case 0:
System.out.println("Exiting...");
break;
case 1:
learnMultiArray();
break;
case 2:
learnMultiArrayInitialized();
break;
default:
System.out.println("C'mon, 1 or two, it's not that hard!");
break;

 }

 } while (option != 0);
System.out.println("Thanks for running the code!");

 }

 private static String runMenu() {
String menuContent = "";
menuContent += "Choose an option:\n";
menuContent += "\t1 - Initializing multidimensional array defining the size:\n";
menuContent += "\t2 - Initializing multidimensional array initialized\n";
return menuContent;
}

 private static void learnMultiArray() {
System.out.println("Learning Multidimensional Arrray");

 System.out.println("Store the 3 grades of  10 students");
float notas[][];
notas = new float[10][5];

 byte studentsAmount, grades;
System.out.println("Enter the amount of students");
studentsAmount = input.nextByte();

 System.out.println("Enter the amount of grades for each student");
grades = input.nextByte();

float updatingGrades[][] = new float[studentsAmount][grades];

 for (byte student = 0; student < updatingGrades.length; student++) {
System.out.println("On this position [" + student + "] there are " + updatingGrades[student].length + " grades");
for (byte grade = 0; grade < updatingGrades[student].length; grade++) {
System.out.println("\t The grade [" + grade + "] ===> " + updatingGrades[student][grade]);
}

 }

 System.out.println("Confiando que tenho no minimo 2 students");
System.out.println("Olha as notas do segundo student");
System.out.println(updatingGrades[1][0]);
System.out.println(updatingGrades[1][1]);
System.out.println(updatingGrades[1][2]);

 }

 private static void learnMultiArrayInitialized() {
System.out.println("Learning about initialized and  irregular Multidimensional Array");

 float salariostudents[][] = { { 1000, 1250.50f, 2500.35f }, { 2600, 3500, 4500 }, { 50000, 150000, 2000000 } };

 byte matrizIrregular[][] = { { 1, 2, 3, 4, 5, 6, 7 }, { 4, 3, 2, 1 }, { 10, 12 }, { -127, 0, 127 }, };

 String ementa[][] = { { "Portuguese", "Art", "Java", "git" },
{ "Logic", "cariables", "constants", "comments", "readme files",
"loops" },
{ "OOP", "code", "objects", },

 };

 }

}
