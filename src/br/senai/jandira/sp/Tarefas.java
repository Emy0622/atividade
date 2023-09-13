package br.senai.jandira.sp;

import java.time.LocalDate;
import java.util.Scanner;

public class Tarefas {

    String titulo, descricao, conclusao, fixada;

    public int data;

    Scanner teclado = new Scanner(System.in);

    public void CadastrarTarefas(){

System.out.println("---------- Tarefas -----------");
System.out.println("Titulo: ");
titulo = teclado.nextLine();
System.out.println("Descrição: ");
descricao = teclado.nextLine();
System.out.println("Conclusão: ");
conclusao = teclado.nextLine();
System.out.println("Fixada: ");
fixada = teclado.nextLine();
System.out.println("Data de vencimento: ");
data = teclado.nextInt();
teclado.nextLine();









    }


}
