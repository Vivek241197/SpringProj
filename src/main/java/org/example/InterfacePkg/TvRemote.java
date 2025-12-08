package org.example.InterfacePkg;

public class TvRemote implements RemoteControl{

    @Override
    public void play(){
        System.out.println("This is a TvRemote");
    }
    @Override
    public void volumeUp(){
        System.out.println("Bring the volume up for a TV");
    }
}
