package org.example;

public class Alumno {
    private String name;

    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String nombre) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "name='" + name + '\'' +
                '}';
    }
}
