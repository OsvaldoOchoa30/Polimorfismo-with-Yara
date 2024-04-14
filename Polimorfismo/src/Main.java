import models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        // Creamos instancias de las bases de datos y las almacenamos en variables de tipo Database
        Database1 db1 = new Database1();
        Database2 db2 = new Database2();
        Database3 db3 = new Database3();

        boolean flag = true;
        do {
        System.out.println("Elige una opcion: ");
        String eleccion = entrance.next();
        entrance.nextLine();

            switch (eleccion) {
                case "1":
                    System.out.println("Agregar Estudiante.");
                    // Creamos un nuevo estudiante
                    System.out.print("Ingresa el nombre del Estudiante: ");
                    String nameStudent = entrance.nextLine();
                    System.out.print("Ingresa la edad del Estudiante: ");
                    int ageStudent = entrance.nextInt();
                    entrance.nextLine();

                    Student student = new Student(nameStudent, ageStudent);

                    // Guardamos el estudiante en todas las bases de datos
                    guardarEnTodasLasBasesDeDatos(student, db1);
                    guardarEnTodasLasBasesDeDatos(student, db2);
                    guardarEnTodasLasBasesDeDatos(student, db3);
                    break;

                case "2":
                    System.out.println("Modificar.");
                    db1.mostrar1();
                    System.out.println("Ingrese el nombre del etudiante a modificar:");
                    String modificarEst = entrance.nextLine();
                    




                case "3":
                    System.out.println("Base de Datos 1: ");
                    db1.mostrar1();
                    break;
                case "4":
                    System.out.println("Base de Datos 2: ");
                    db2.mostrar2();
                    break;
                case"5":
                    System.out.println("Base de Datos 3: ");
                    db3.mostrar3();
                    break;


                default:
                    flag = false;

            }
        } while (flag) ;

        // Actualizamos el estudiante en todas las bases de datos
        /*actualizarEnTodasLasBasesDeDatos(student, db1);
        actualizarEnTodasLasBasesDeDatos(student, db2);
        actualizarEnTodasLasBasesDeDatos(student, db3);*/
    }


    // Método para guardar un estudiante en una base de datos
    static void guardarEnTodasLasBasesDeDatos(Student student, Database database) {
        database.save(student);
    }

    // Método para actualizar un estudiante en una base de datos
    static void actualizarEnTodasLasBasesDeDatos(Student student, Database database) {
        database.update(student);
    }
}