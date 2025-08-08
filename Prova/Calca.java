/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author CEDUP 08
 */
public class Calca extends Roupa{
    private String tamanho;

    public Calca(String tamanho, String modelo) {
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
            System.out.printf("\nVoce vestiu a calca %s", getModelo());
        }else{
            System.out.printf("\nVoce ja esta vestindo essa calca(%s)", getModelo());
        }
        setVestindo(true);
    }
    
    @Override
    public void tirar(){
        if(isVestindo() == true){
            System.out.printf("\nVoce tirou a calca %s", getModelo());
        }else{
            System.out.printf("\nVoce nao esta vestindo essa calca.");
        }
        setVestindo(false);
    }
    
}
