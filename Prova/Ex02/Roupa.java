/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author CEDUP 08
 */
public class Roupa {
    private String modelo;
    private boolean vestindo;

    public String getModelo() {
        return modelo;
    }

    public boolean isVestindo() {
        return vestindo;
    }

    public void setVestindo(boolean vestindo) {
        this.vestindo = vestindo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Roupa(String modelo) {
        this.modelo = modelo;
        this.vestindo = false;
    }

    public void tirar(){
        if(vestindo == true){
            System.out.println("Voce tirou a roupa");
        }else{
            System.out.println("Voce nao esta vestindo essa roupa");
        }
        vestindo = false;
    }
    
    public void vestir(){
        if(vestindo == false){
            System.out.println("Voce vestiu a roupa");
        }else{
            System.out.println("Voce ja esta vestindo essa roupa");
        }
        vestindo = true;
    }
    
    
}
