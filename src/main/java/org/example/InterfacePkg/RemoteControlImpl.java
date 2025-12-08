package org.example.InterfacePkg;

public class RemoteControlImpl {

    public RemoteControl rm;

    public RemoteControlImpl(RemoteControl r){
        this.rm=r;
    }
    public void operate(){
        rm.play();
        rm.volumeUp();
    }
}
