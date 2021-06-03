package com.company;

import br.unicap.edi.TAD.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Valor = 0;
        int op, tam = 0;
        String Binario = "";

        Stack<Integer> Pilha = new Stack();
        Scanner New = new Scanner(System.in);

        System.out.println("BEM VINDO AO TRANSFORMADOR EM BINARIOS");

        System.out.println("Inserira o numero para virar binario:");
        Valor = New.nextInt();
        do { //insere o binario na pilha
            int Bi = Valor % 2;
            Valor = Valor / 2;
            Pilha.push(Bi);
            tam++;
        } while (Valor != 0);

        for (int cont = 0; cont < tam; cont++) {// ordena
            Binario = Binario + Pilha.top();
            if (cont != tam) {
                Pilha.pop();
            }
        }
        System.out.println(Binario);
    }
}
