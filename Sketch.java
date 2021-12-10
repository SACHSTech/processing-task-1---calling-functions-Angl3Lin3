import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  
	 stroke(100);
	 fill(100);
	 
	 ellipse(250, 250, 25, 25);
	 ellipse(200, 230, 25, 25);
	 
	 ellipse(90, 240, 150, 150);
	 
	 stroke(87);
	 fill(87);
	 
	 ellipse(100, 260, 25, 15);
	 ellipse(80, 220, 25, 15);
	 ellipse(85, 290, 25, 15);
	 ellipse(120, 230, 25, 15);
	 ellipse(50, 270, 25, 15);
	 ellipse(40, 240, 25, 15);
	 ellipse(120, 280, 25, 15);
	 ellipse(90, 190, 25, 15);
	 ellipse(45, 210, 25, 15);
	 ellipse(130, 205, 25, 15);
	 
	 stroke(225);
	 fill(225);
	 
	 line(270, 250, 350, 250);
	 line(270, 240, 300, 240);
	 line(270, 260, 300, 260);
	 
	 line(220, 230, 270, 220);
	 line(210, 210, 250, 190);
	 line(220, 220, 300, 200);
	 
	 beginShape();
	 vertex(70, 80);
	 vertex(65, 70);
	 vertex(70, 60);
	 vertex(75, 70);
	 endShape();
	 
	 beginShape();
	 vertex(60, 55);
	 vertex(55, 45);
	 vertex(60, 35);
	 vertex(65, 45);
	 endShape();
	 
	 beginShape();
	 vertex(100, 70);
	 vertex(90, 50);
	 vertex(100, 30);
	 vertex(110, 50);
	 endShape();
	 
	 
	 stroke(255, 198, 64);
	 fill(255, 198, 64);
	 
	 ellipse(380, 50, 250, 250);
	  
	  
  }
  
  // define other methods down here.
}