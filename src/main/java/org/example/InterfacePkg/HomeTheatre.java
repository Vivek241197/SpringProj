package org.example.InterfacePkg;

public class HomeTheatre implements RemoteControl{

    @Override
    public void play(){
        System.out.println("Of HomeTheatre");
    }
    @Override
    public void volumeUp(){
        System.out.println("Up the volume of HomeTheatre");
    }
}
