package models;

import java.util.ArrayList;

public class Database1 implements Database {
    private ArrayList<Student> students = new ArrayList<>();



    @Override
    public void save(Student student) {
        students.add(student);
        System.out.println("Registro guardado en la base de datos 1");
    }

    @Override
    public void update(Student student) {
        // Supongamos que aquí se implementa la lógica para actualizar el estudiante en la base de datos
        System.out.println("Registro actualizado en la base de datos 1");
    }

    public void mostrar1(){
        for (Student student : students ){
            System.out.println(student);
        }
    }
}