package com.github.matiasmartearena;

import com.github.matiasmartearena.clase05.*;

public class Main {
    public static void main(String[] args) {
        ASAPDemy plataforma = new ASAPDemy();

        Usuario usuario1 = new Usuario("1", "Juan Perez", "juan@example.com", false);
        Usuario usuario2 = new Usuario("2", "Maria Gomez", "maria@example.com", true);
        Usuario usuario3 = new Usuario("3", "Luis Martinez", "luis@example.com", true);
        Usuario usuario4 = new Usuario("4", "Ana Torres", "ana@example.com", true);
        Usuario usuario5 = new Usuario("5", "Pedro Lopez", "pedro@example.com", true);
        Usuario usuario6 = new Usuario("6", "Laura Diaz", "laura@example.com", true);
        Usuario autor = new Usuario("7", "Carlos Ramirez", "carlos@example.com", false);
        Usuario usuarioBecadofaltante = new Usuario("8", "Becado Faltante", "becadofaltante@example.com", true);

        plataforma.agregarUsuario(usuario1);
        plataforma.agregarUsuario(usuario2);
        plataforma.agregarUsuario(usuario3);
        plataforma.agregarUsuario(usuario4);
        plataforma.agregarUsuario(usuario5);
        plataforma.agregarUsuario(usuario6);
        plataforma.agregarUsuario(autor);
        plataforma.agregarUsuario(usuarioBecadofaltante);

        Categoria categoria1 = new Categoria("1", "Programacion");
        plataforma.agregarCategoria(categoria1);

        Curso curso1 = new Curso("1", "Java Básico", 100.0, 4, autor);
        categoria1.agregarCurso(curso1);

        System.out.println(plataforma.suscribirseACurso("1", "1"));
        System.out.println(plataforma.suscribirseACurso("2", "1"));
        System.out.println(plataforma.suscribirseACurso("9", "1"));
        System.out.println(plataforma.suscribirseACurso("4", "1"));
        System.out.println(plataforma.suscribirseACurso("5", "5"));
        System.out.println(plataforma.suscribirseACurso("6", "1"));
        System.out.println(plataforma.suscribirseACurso("7", "1"));
        System.out.println(plataforma.suscribirseACurso("8", "1"));
    }
}
