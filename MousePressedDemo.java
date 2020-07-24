package Event_Handling;


import java.applet.*;
import java.awt.event.*;

public class MousePressedDemo extends Applet {
public void init() {
addMouseListener(new MyMouseAdapter1(this));
}
}
class MyMouseAdapter1 extends MouseAdapter {
MousePressedDemo mousePressedDemo;
public MyMouseAdapter1(MousePressedDemo mousePressedDemo) {
this.mousePressedDemo = mousePressedDemo;
}
public void mousePressed(MouseEvent me) {
mousePressedDemo.showStatus("Mouse Pressed.");
}
}