package org.alfonso.biconsumer1;

public class Usuario
{
    private String nombre;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        return "nombre= " + nombre;
    }
}
