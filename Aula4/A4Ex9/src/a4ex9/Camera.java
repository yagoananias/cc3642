/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4ex9;

/**
 *
 * @author Yago
 */
public class Camera {
    
    private boolean cameraRe;
    private boolean cameraCentral;

    public boolean isCameraRe() {
        return cameraRe;
    }

    public void setCameraRe(boolean cameraRe) {
        this.cameraRe = cameraRe;
    }

    public boolean isCameraCentral() {
        return cameraCentral;
    }

    public void setCameraCentral(boolean cameraCentral) {
        this.cameraCentral = cameraCentral;
    }

    @Override
    public String toString() {
        return "Camera{" + "cameraRe=" + cameraRe + ", cameraCentral=" + cameraCentral + '}';
    }
    
    
    
}
