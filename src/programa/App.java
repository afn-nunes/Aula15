package programa;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import classes.Motorista;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Hello, World!");

        List<Motorista> pessoas = Arrays.asList(
            new Motorista("André","10335723730", 1, "B"), 
            new Motorista("João","103351203730", 2, "B"),  
            new Motorista("Pedro","10331231510", 3, "B"), 
            new Motorista("Maria","12315616521", 4, "B"));

        System.out.println("Informe o CPF do motorista: ");
        String cpf = sc.nextLine();

        for (Motorista pessoa : pessoas) {
            if(pessoa.getCpf().equals(cpf)){
                System.out.printf("Motorista: %s - Matrícula %s - Habilitação %s", pessoa.getNome(), pessoa.getMatricula(), pessoa.getHabilitacao());
            }
        }

        sc.close();
    }
}
