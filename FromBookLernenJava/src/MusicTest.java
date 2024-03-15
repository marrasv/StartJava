import javax.sound.midi.*;

public class MusicTest {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }

    public static void main (String[] args) {
        MusicTest mt = new MusicTest();
        mt.play();
    }//end main
}// end class