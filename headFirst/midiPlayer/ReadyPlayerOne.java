package headFirst.midiPlayer;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class ReadyPlayerOne implements ControllerEventListener{

    static JFrame f = new JFrame("My First Music Video");
    static MyDrawPanel m1;
    boolean msg = false;

    public static void main(String[] args) {

        ReadyPlayerOne player = new ReadyPlayerOne();
        player.go();

    } // close Main

    public void setUpGui(){
        m1 = new MyDrawPanel();
        f.setContentPane(m1);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public void go(){

        setUpGui();

        try {

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(this, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 40; i < 100; i+=4){

                track.add(makeEvent(144, 1, i, 100, i-40));
                track.add(makeEvent(176, 1, 127, 0, i-40));
                track.add(makeEvent(128, 1, i, 100, i - 38));

            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void controlChange(ShortMessage message){
        msg = true;
        f.repaint();
    }


    public static MidiEvent makeEvent(int comd, int chan, int data1, int data2, int tick){

        MidiEvent event = null;

        try {

            ShortMessage m = new ShortMessage();
            m.setMessage(comd, chan, data1, data2);
            event = new MidiEvent(m, tick);

        } catch (Exception e) {}

        return event;

    }


    class MyDrawPanel extends JPanel{



        public void paintComponent(Graphics g){
            if (msg){

//                Graphics2D g2d = (Graphics2D) g;

                int red = (int)(Math.random() * 251);
                int green = (int)(Math.random() * 251);
                int blue = (int)(Math.random() * 251);

                g.setColor(new Color(red, green, blue));

                int height = (int)(Math.random() * 120) + 10;
                int width = (int)(Math.random() * 120) + 10;
                int x = (int)(Math.random() * 40)+ 40;
                int y = (int)(Math.random() * 40)+ 40;

                g.fillRect(x, y, width, height);

                msg = false;

            }
        }

    }

}
