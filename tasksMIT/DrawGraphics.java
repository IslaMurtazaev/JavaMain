package tasksMIT;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {

    BouncingBox[] randBoxes = new BouncingBox[2000];

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        for(int i = 0; i < randBoxes.length; i++){
            randBoxes[i] = new BouncingBox(randTill(150), randTill(150), new Color(randTill(251), randTill(251),randTill(251)));
            randBoxes[i].setMovementVector(randTill(10)+1, randTill(10)+1);
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {

        for(int i = 0; i < randBoxes.length; i++){
            randBoxes[i].draw(surface);
        }

    }

    public static int randTill(int end){
        return (int)(Math.random()*end);
    }

} 