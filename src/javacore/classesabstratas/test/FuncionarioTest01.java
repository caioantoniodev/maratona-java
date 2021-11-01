package javacore.classesabstratas.test;

import javacore.classesabstratas.dominio.Desenvolvedor;
import javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        var gerente = new Gerente("Goku", 3000d);
        var desenvolvedor = new Desenvolvedor("Jiraya", 8000d);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
