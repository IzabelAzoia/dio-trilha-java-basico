package Operadores;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);
        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior ou igual a numeroDois? " + simNao);
        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor a numeroDois? " + simNao);
        simNao = numero1 <= numero2;

        System.out.println("numeroUm é menor ou igual a numeroDois? " + simNao);

        String nomeUm = "Izabel";
        String nomeDois = new String("Izabel");

        System.out.println(nomeUm.equals(nomeDois));

    }
}
