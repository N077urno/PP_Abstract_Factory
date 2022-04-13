/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory_Cameras;

/**
 *
 * @author IFGoiano
 */
public class FabricaCanon implements IFabricaDeCameras {
    @Override
    public ICameraFullFrame criarCameraFullFrame(){
        return new D6MarkI();
    }
    
    @Override
    public ICameraCrop criarCameraCrop(){
        return new T8i();
    }
    
}
