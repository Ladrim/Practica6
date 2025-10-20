package org.alfonso.biconsumer2;

import java.util.function.BiConsumer;

public class Main
{
    public static void main(String[] args)
    {
        Usuario usuario = new Usuario();

        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario,"pepito");

        String imprimirUsuario = usuario.toString();
        System.out.println(imprimirUsuario);
    }
}
