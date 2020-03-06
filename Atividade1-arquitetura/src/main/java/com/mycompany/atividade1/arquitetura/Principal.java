/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        

package com.mycompany.atividade1.arquitetura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        int opcao = 0, cont = 0, verif = 0;
        String aux;
//        String[] alunos = ;
        ArrayList<String> alunos = new ArrayList();
        Scanner read = new Scanner(System.in);
        while(opcao != 3) {
            System.out.println("Bem vindo ao sistema de ...");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Listar alunos cadastrados");
            System.out.println("[3] Sair");

            opcao = Integer.parseInt(read.nextLine());

            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    aux = read.nextLine();
                    Iterator itr1 = alunos.iterator();
                    while(itr1.hasNext()) {
                        Object elemento = itr1.next();
                        if (elemento.equals(aux)) {
                            System.out.println("Aluno já cadastrado");
                            verif++;
                        }
                    }
                    if (verif == 0) {
                        alunos.add(aux);   
                    }
                    break;
                case 2:
                    Iterator itr2 = alunos.iterator();
                    while(itr2.hasNext()) {
                        Object elemento = itr2.next();
                        System.out.println(elemento);
                    }
                    break;
            }
        }
    }
}
