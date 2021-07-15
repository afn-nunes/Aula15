package programa;

import classes.Motorista;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa p = new Motorista("André","10335723730", 123, "B");

        System.out.println(p);
    }
}
