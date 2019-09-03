package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Produzido;
    int Defeito;
        System.out.println("Informe o total produzido");
        Produzido = sc.nextInt();
        System.out.println("Informe o total com defeito");
        Defeito = sc.nextInt();
        double limiar = Produzido *0.1;
        if(Defeito <= limiar) {
            System.out.println("Não precisa de manutenção");
        }else{
            System.out.println("precisa de manutenção");
        }
    }
}
