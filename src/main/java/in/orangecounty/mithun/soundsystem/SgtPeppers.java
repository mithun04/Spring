package in.orangecounty.mithun.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by mithun on 6/29/17.
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}