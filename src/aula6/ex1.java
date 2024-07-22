package aula6;

import java.util.Scanner;

public class ex1 {
    static ed[] vet;

    public static void criar(int tam){
        Scanner ler = new Scanner(System.in);
        vet = new ed[tam];
        int cod;
        String nome;

        for (int i = 0; i < tam; i++) {
            System.out.println("Digite um código: ");
            cod = ler.nextInt();
            System.out.println("Digite um nome: ");
            nome = ler.next();
            vet[i] = new ed(cod,nome);
        }
    }

    public static void mostrar(ed[] v){
        int tam;
        tam = v.length;

        for (int i = 0; i < tam; i++) {
            System.out.println("Código: "+v[i].cod+" === Nome: "+v[i].nome);
        }
    }

    public static void buscarNome(ed[] vetor , String nome){
        boolean achou = false;
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].nome.equals(nome)){
                achou = true;
                break;
            }
            cont++;
        }
        if (achou){
            System.out.println("Nome encontrado...");
        }else {
            System.out.println("Nome não encontrado...");
        }
    }

    public static void buscarCod(ed[] vetor , int cod){
        boolean achou = false;
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].cod ==cod){
                achou = true;
                break;
            }
            cont++;
        }
        if (achou){
            System.out.println("Código encontrado...");
        }else {
            System.out.println("Código não encontrado...");
        }
    }

    public static void ordenarPorNome(){

    }

    public static void ordenarPorCod(){

    }

    public static void main(String[] args) {

    }
}