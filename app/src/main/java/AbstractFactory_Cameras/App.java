/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AbstractFactory_Cameras;

public class App {
  

    public static void main(String[] args) {
       
        IFabricaDeCameras camCanon = new FabricaCanon();
       
        ICameraFullFrame cam1 = camCanon.criarCameraFullFrame();
        
        cam1.exibirInfoCameraFullFrame();
        
        ICameraCrop cam2 = camCanon.criarCameraCrop();
        
        cam2.exibirInfoCameraCrop();
        
        IFabricaDeCameras camNikon = new FabricaNikon();
        
        ICameraCrop cam3 = camNikon.criarCameraCrop();
        
        cam3.exibirInfoCameraCrop();
        
        ICameraFullFrame cam4 = camNikon.criarCameraFullFrame();
        
        cam4.exibirInfoCameraFullFrame(); 
    }
}