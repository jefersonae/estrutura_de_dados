import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
    /*
        //Questão 1
        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Informe o número "+(i+1)+":");
            a[i] = ler.nextInt();
            b[i] = a[i] * 3;
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(b[i] + " ");
        }
    */
        //Questão 2
        String[] nomes = new String[5];
        int [] idade = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Qual o nome da pessoa "+i+": ");
            nomes[i] = ler.next();
            System.out.print("Qual a idade da pessoa "+i+": ");
            idade[i] = ler.nextInt();
            soma += idade[i];
        }

        int media = soma/5;

        System.out.println("A média é "+media);
        for (int i = 0; i < 5; i++) {
            if(idade[i] > media){
                System.out.print(nomes[i]+" ");
            }
        }

        //
        int [] a = new int[3];
        int [] b = new int[3];
        int [] c = new int[6];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i + 10;
        }

        for (int i = 0; i < c.length; i++) {
            c[2*i] = a[i];
            c[(2*i)+1] = b[i];
        }
    }
}