/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author CEDUP 08
 */
public class Camisa extends Roupa{
    private String tamanho;

    public Camisa(String tamanho, String modelo) {
        super(modelo);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public void vestir(){
        if(isVestindo() == false){
            System.out.printf("\nVoce Vestiu a camisa %s", getModelo());
        }else{
            System.out.printf("\nVoce ja esta vestindo essa camisa(%s)", getModelo());
        }
        setVestindo(true);
    }
    
    @Override
    public void tirar(){
        if(isVestindo() == true){
            System.out.printf("\nVoce tirou a camisa %s", getModelo());
        }else{
            System.out.printf("\nVoce nao esta vestindo essa camisa.");
        }
        setVestindo(false);
    }
    
}
