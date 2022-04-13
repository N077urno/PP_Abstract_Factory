/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory_Cameras;

/**
 *
 * @author IFGoiano
 */
public class D650 implements ICameraFullFrame {
    @Override
    public void exibirInfoCameraFullFrame(){
        System.out.println("Modelo: D 650 \n Fabrica: Nikon \n Categoria: Full Frame");
    }
}
