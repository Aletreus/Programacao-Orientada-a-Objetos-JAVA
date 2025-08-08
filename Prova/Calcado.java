/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author CEDUP 08
 */
public class Calcado extends Roupa{
    private int numeracao;

    public Calcado(int numeracao, String modelo) {
        super(modelo);
        this.numeracao = numeracao;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }
    
    @Override
    public void vestir(){
        if(isVestindo() == false){
            System.out.printf("\nVoce calçou o %s", getModelo());
        }else{
            System.out.printf("\nVoce ja esta calçando esse sapato(%s)", getModelo());
        }
        setVestindo(true);
    }
    
    @Override
    public void tirar(){
        if(isVestindo() == true){
            System.out.printf("\nVoce tirou o calçado %s", getModelo());
        }else{
            System.out.printf("\nVoce nao esta vestindo esse calcado.");
        }
        setVestindo(false);
    }
}
