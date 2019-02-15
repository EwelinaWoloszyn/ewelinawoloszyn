import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class timerep_triangle_bounce_ewelina03 extends PApplet {

int s;
int m;
int h;
int size =60;
float xpos, ypos; 
float xspeed = 2.8f;  // Speed of the shape
float yspeed = 2.2f;  // Speed of the shape

int xdirection = 1;  // Left or Right
int ydirection = 1;
public void setup() {
  size(600,600);
  background(255);
  smooth();
  xpos = width/2;
  ypos = height/2;
}
public void draw() {
   xpos = xpos + ( xspeed * xdirection );
  ypos = ypos + ( yspeed * ydirection );
  
  s = second();
  m = minute();
  h = hour();
  // Test to see if the shape exceeds the boundaries of the screen
  // If it does, reverse its direction by multiplying by -1
  if (xpos > width-size || xpos < 0) {
    xdirection *= -1;
  }
  if (ypos > height-size || ypos < 0) {
    ydirection *= -1;
  }
  stroke(255,s*10,s);
  
  triangle(xpos+size/2,ypos+size/2,s*10,m*15,s*10,m*15);
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "timerep_triangle_bounce_ewelina03" });
  }
}
