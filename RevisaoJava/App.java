package Revisao;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        boolean saida = false;
        ArrayList<Livro> livros = new ArrayList();
        ArrayList<AudioBook> audiobooks = new ArrayList();
        while(saida == false){
            String menu = "=-";
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Insira a opcao que voce quer\n1 - Cadastrar livro\n2 - Cadastrar audiobook\n3 - Emprestimo de livro\n4 - Devolucao de livro\n5 - Informacoes de um livro\n6 - Emprestimo de audiobook\n7 - Devolucao de audiobook\n8 - Informacoes de audiobook\n9 - Remover livro\n10 - Remover audiobook");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            int indice = -1;
            String alugar = "";
            String devolver = "";
            String info = "";
            String remover = "";
            boolean encontrado = false;
            switch(opcao){
                case 1:
                    System.out.println("Insira o nome do livro: ");
                    String nome = teclado.nextLine();
                    System.out.println("Insira o autor do livro: ");
                    String autor = teclado.nextLine();
                    System.out.println("Insira o ano de lancamento do livro: ");
                    int ano = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Insira o genero do livro: ");
                    String genero = teclado.nextLine();
                    System.out.println("Insira a quantidade de paginas do livro: ");
                    int numeroPag = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Insira a quantidade de capitulos do livro: ");
                    int capitulos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Insira se a capa do livro e dura ou mole: ");
                    String capa = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(nome)){
                            encontrado = true;
                        }
                    };
                    if(encontrado == true){
                        System.out.println("Livro ja cadastrado");
                    }else{
                        livros.add(new Livro(nome, autor, ano, genero, numeroPag, capitulos, capa));
                    }
                    break;
                case 2:
                    System.out.println("Insira o nome do audiobook: ");
                    String nome1 = teclado.nextLine();
                    System.out.println("Insira o autor do audiobook: ");
                    String autor1 = teclado.nextLine();
                    System.out.println("Insira o ano de lancamento do audiobook: ");
                    int ano1 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Insira o genero do audiobook: ");
                    String genero1 = teclado.nextLine();
                    System.out.println("Insira quantas horas tem o audiobook: ");
                    int horas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Insira quantos minutos tem o audiobook: ");
                    int minutos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Insira o nome de quem narrou o audiobook: ");
                    String narrador = teclado.nextLine();
                    for(int i = 0; i < audiobooks.size(); i++){
                        if(audiobooks.get(i).getTitulo().equals(nome1)){
                            encontrado = true;
                        }
                    };
                    if(encontrado == true){
                        System.out.println("audiobook ja cadastrado");
                    }else{
                        audiobooks.add(new AudioBook(nome1, autor1, ano1, genero1, minutos, narrador, horas));
                    }
                    break;
                case 3:
                    System.out.println("Insira o nome do livro que deseja alugar");
                    alugar = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(alugar)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("Livro nao encontrado");
                    }else{
                        livros.get(indice).alugar();
                    }
                    break;
                case 4:
                    System.out.println("Insira o nome do livro que deseja devolver");
                    devolver = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(devolver)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("Livro nao encontrado");
                    }else{
                        livros.get(indice).devolver();
                    }
                    break;
                case 5:
                    System.out.println("Insira o nome do livro que deseja saber as informacoes");
                    info = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(info)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("Livro nao encontrado");
                    }else{
                        livros.get(indice).informacoes();
                    }
                    break;
                case 6: 
                    System.out.println("Insira o nome do livro que deseja devolver");
                    alugar = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(alugar)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("audiobook nao encontrado");
                    }else{
                        audiobooks.get(indice).alugar();
                    }
                    break;
                case 7:
                    System.out.println("Insira o nome do livro que deseja devolver");
                    devolver = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(devolver)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("audiobook nao encontrado");
                    }else{
                        audiobooks.get(indice).devolver();
                    }
                    break;
                case 8:
                    System.out.println("Insira o nome do livro que deseja devolver");
                    info = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(info)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("audiobook nao encontrado");
                    }else{
                        audiobooks.get(indice).informacoes();
                    }
                    break;
                case 9:
                    System.out.println("Insira o nome do livro que deseja remover");
                    remover = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(remover)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("livro nao encontrado");
                    }else{
                        livros.remove(indice);
                        System.out.println("Livro removido.");
                    }
                    break;
                case 10:
                    System.out.println("Insira o nome do audiobook que deseja remover");
                    remover = teclado.nextLine();
                    for(int i = 0; i < livros.size(); i++){
                        if(livros.get(i).getTitulo().equals(remover)){
                            indice = i;
                        }
                    };
                    if(indice == -1){
                        System.out.println("audiobook nao encontrado");
                    }else{
                        audiobooks.remove(indice);
                        System.out.println("Audiobook removido.");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida. Selecione uma opcao valida.");
            }
        }
    }
}
