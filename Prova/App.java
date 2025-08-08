/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author CEDUP 08
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Calcado> calcados = new ArrayList();
        ArrayList<Camisa> camisas = new ArrayList();
        ArrayList<Calca> calcas = new ArrayList();
        boolean continuar = true;
        while(continuar == true){
            System.out.printf("\n[1]Criar uma Roupa Virtual.\n[2]Vestir uma Roupa\n[3]Devolver uma Roupa \n[4]Ver Guarda Roupa\n[5]Fechar Programa\n");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            switch(opcao){
                case 1:
                    System.out.printf("[1]Criar um Calcado\n[2]Criar uma Camisa\n[3]Criar uma Calça\n");
                    int objeto = teclado.nextInt();
                    teclado.nextLine();
                    switch(objeto){
                        case 1:
                            System.out.printf("\nInsira o modelo do calcado:");
                            String modelo = teclado.nextLine();
                            System.out.printf("\nInsira a numeracao do calcado:");    
                            int numeracao = teclado.nextInt();
                            teclado.nextLine();
                            calcados.add(new Calcado(numeracao, modelo));
                            break;
                        case 2:
                            System.out.printf("\nInsira o modelo da Camisa:");
                            String modeloCamisa = teclado.nextLine();
                            System.out.printf("\nInsira o tamanho da Camisa:");    
                            String tamanhoCamisa = teclado.nextLine();
                            camisas.add(new Camisa(tamanhoCamisa, modeloCamisa));
                            //guardaRoupa.add(camisa);
                            break;
                        case 3:
                            System.out.printf("\nInsira o modelo da Camisa:");
                            String modeloCalca = teclado.nextLine();
                            System.out.printf("\nInsira o tamanho da Camisa:");    
                            String tamanhoCalca = teclado.nextLine();
                            calcas.add(new Calca(tamanhoCalca, modeloCalca));
                            //guardaRoupa.add(calca);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Quer vestir \n1 camisa\n2 calça\n3 sapato\n4 sair da opcao");
                    int opVes = teclado.nextInt();
                    teclado.nextLine();
                    switch(opVes){
                        case 1:
                            System.out.println("id da camisa");
                            int devCam1 = teclado.nextInt();
                            teclado.nextLine();
                            camisas.get(devCam1).vestir();
                            break;
                        case 2:
                            System.out.println("id da calça");
                            int devCalc1 = teclado.nextInt();
                            teclado.nextLine();
                            calcas.get(devCalc1).vestir();
                            break;
                        case 3:
                            System.out.println("id da sapato");
                            int devSap1 = teclado.nextInt();
                            teclado.nextLine();
                            calcados.get(devSap1).vestir();
                            break;
                        case 4:
                            break;
                        }
                    break;
                    
                case 3:
                    System.out.println("Quer tirar \n1 camisa\n2 calça\n3 sapato\n4 sair da opcao");
                    int opDev = teclado.nextInt();
                    teclado.nextLine();
                    switch(opDev){
                        case 1:
                            System.out.println("id da camisa:");
                            int devCam = teclado.nextInt();
                            teclado.nextLine();
                            camisas.get(devCam).tirar();
                            break;
                        case 2:
                            System.out.println("id da calca:");
                            int devCalc = teclado.nextInt();
                            teclado.nextLine();
                            calcas.get(devCalc).tirar();
                            break;
                        case 3:
                            System.out.println("id da sapato:");
                            int devSap = teclado.nextInt();
                            teclado.nextLine();
                            calcados.get(devSap).tirar();
                            break;
                        case 4:
                            break;
                        }
                    break;
                case 4:
                    System.out.println("quer ver \n1 camisa\n2 calça\n3 sapato\n4 sair da opcao");
                    int opVer = teclado.nextInt();
                    teclado.nextLine();
                    switch(opVer){
                        case 1:
                            for(int i = 0; i < camisas.size(); i++){
                                System.out.printf(" "+ camisas.get(i).getModelo());
                                System.out.printf(" "+ camisas.get(i).getTamanho()+ " id: " + i+"\n");
                            }
                        break;
                        case 2:
                            for(int i = 0; i < calcas.size(); i++){
                                System.out.printf(" "+ calcas.get(i).getModelo());
                                System.out.printf(" "+ calcas.get(i).getTamanho()+ " id: " + i+"\n");
                            }
                        break;
                        case 3:
                            for(int i = 0; i < calcados.size(); i++){
                                System.out.printf(" "+ calcados.get(i).getModelo());
                                System.out.printf(" "+ calcados.get(i).getNumeracao()+ " id: " + i +"\n");
                            }
                        break;
                        case 4:
                            break;
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
            }
                
        }
        
        
    }
    
}
