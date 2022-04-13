/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory_Cameras;

/**
 *
 * @author IFGoiano
 */
public class D3500 implements ICameraCrop {
    @Override
    public void exibirInfoCameraCrop(){
        System.out.println("Modelo: D3500 \n Fabrica: Nikon \n Categoria: Entrada (Cropada)");
    }
}
