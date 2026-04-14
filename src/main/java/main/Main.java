package main;

import java.util.ArrayList;
import model.Cliente;
import model.ClienteABC;
import model.ClienteXYZ;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> abc = new ArrayList<>();
        ArrayList<Cliente> xyz = new ArrayList<>();

        abc.add(new ClienteABC("123", 1, "João", "Rua A", "Centro", "111", "999"));
        xyz.add(new ClienteXYZ(2, "Maria", "Rua B", "Centro", "222", "888"));

        System.out.println("=== ANTES ===");

        System.out.println("ABC:");
        for (Cliente c : abc) {
            System.out.println(c);
        }

        System.out.println("XYZ:");
        for (Cliente c : xyz) {
            System.out.println(c);
        }

        ArrayList<Cliente> todos = new ArrayList<>();

        todos.addAll(abc);
        todos.addAll(xyz);

        System.out.println("=== DEPOIS ===");

        for (Cliente c : todos) {
            System.out.println(c);
        }
    }
}
