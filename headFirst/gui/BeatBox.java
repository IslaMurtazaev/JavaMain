package headFirst.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;


public class BeatBox {

    JFrame theFrame;
    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxeList;
    Sequencer sequencer;
    Sequence sequence;
    Track track;


    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibaraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};

    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }

    public void buildGUI(){
        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel background = new JPanel(new BorderLayout());
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        checkBoxeList = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton clearList = new JButton("Clear");
        clearList.addActionListener(new MyClearListener());
        buttonBox.add(clearList);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (String name : instrumentNames){
            nameBox.add(new Label(name));
        }

        background.add(BorderLayout.WEST, nameBox);
        background.add(BorderLayout.EAST, buttonBox);

        theFrame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++){
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkBoxeList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();
        theFrame.setSize(600, 400);
        theFrame.setLocationRelativeTo(null);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    public void buildTrackAndStart(){
        int[] trackList = null;

        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new int[16];

            int key = instruments[i];

            for (int j = 0; j < 16; j++) {

                JCheckBox jc = checkBoxeList.get(j + (i*16));
                if (jc.isSelected()){
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            } // Close inner loop

            makeTracks(trackList);
            track.add(makeEvent(176, 1, 127, 0, 16));
        } // Close outer loop
        track.add(makeEvent(192, 9, 1, 0, 15));

        try{
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (InvalidMidiDataException ex){
            ex.printStackTrace();
        }
    } // Close buildAndStart method

    public void setUpMidi(){
        try{
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);

        } catch (MidiUnavailableException | InvalidMidiDataException ex){
            ex.printStackTrace();
        }

    }

    public void makeTracks(int[] list){
        for (int i = 0; i < 16; i++) {
            int key = list[i];

            if (key != 0){
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i+1));
            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int data1, int data2, int tick){

        MidiEvent event = null;

        try {

            ShortMessage m = new ShortMessage();
            m.setMessage(comd, chan, data1, data2);
            event = new MidiEvent(m, tick);

        } catch (Exception e) {}

        return event;

    }

    class MyStartListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            buildTrackAndStart();
        }
    }

    class MyStopListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            sequencer.stop();
        }
    }

    class MyUpTempoListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * 1.03));
        }
    }

    class MyDownTempoListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * 0.97));
        }
    }

    class MyClearListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                sequence.deleteTrack(track);
                track = sequence.createTrack();
                sequencer.setSequence(sequence);
                sequencer.setTempoInBPM(120);
            } catch (InvalidMidiDataException ex){
                ex.printStackTrace();
            }
            for (JCheckBox jc: checkBoxeList) {
                jc.setSelected(false);
            }
        }
    }

}