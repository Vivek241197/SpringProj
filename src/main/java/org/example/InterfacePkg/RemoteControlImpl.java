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
    public void add(){
        System.out.println("Adding two values");
    }
}
