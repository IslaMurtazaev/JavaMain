package headFirst.midiPlayer;

import javax.sound.midi.*;

public class MidiMiniMusicApp {

    public static void main(String[] args) {

        MidiMiniMusicApp mini = new MidiMiniMusicApp();
        mini.play();

    }

    public void play(){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage changeInstrument = new ShortMessage();
            changeInstrument.setMessage(192, 1, 102, 0);
            MidiEvent CI = new MidiEvent(changeInstrument, 1);
            track.add(CI);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 60, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            ShortMessage c = new ShortMessage();
            c.setMessage(144, 1, 70, 100);
            MidiEvent noteOn2 = new MidiEvent(c, 16);
            track.add(noteOn2);

            ShortMessage d = new ShortMessage();
            d.setMessage(128, 1, 44, 100);
            MidiEvent noteOff2 = new MidiEvent(d, 30);
            track.add(noteOff2);

            player.setSequence(seq);

            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // close play
} // close class
