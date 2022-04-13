/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AbstractFactory_Cameras;

/**
 *
 * @author IFGoiano
 */
public interface IFabricaDeCameras {
   ICameraFullFrame criarCameraFullFrame();
   
   ICameraCrop criarCameraCrop();
    
}
