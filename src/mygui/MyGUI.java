/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

/**
 *
 * @author user
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI extends JFrame{
    
private static class MyGUIDisplay extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(1000, 900, 1000, 900);
}    
}
private static class ButtonHandler implements ActionListener {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null,e.getActionCommand());
System.exit(0);
}
}
public MyGUI(){
MyGUIDisplay displayPanel = new MyGUIDisplay();
JButton run = new JButton("Run");
JButton close = new JButton("Close");
JButton help = new JButton("Help");
JButton browse = new JButton("Browse");
ButtonHandler listener = new ButtonHandler();
run.addActionListener(listener);
close.addActionListener(listener);
help.addActionListener(listener);
browse.addActionListener(listener);
add(run);
add(close);
add(help);
add(browse);


JRadioButton userDef = new JRadioButton("User Defined");
JRadioButton dpi = new JRadioButton("DPI");
JRadioButton dpm = new JRadioButton("DPM");
JRadioButton pxSize = new JRadioButton("PIXEL SIZE");
JRadioButton top = new JRadioButton("TOP");
JRadioButton bottom = new JRadioButton("BOTTOM");
JRadioButton left = new JRadioButton("LEFT");
JRadioButton right = new JRadioButton("RIGHT");
JRadioButton bmp = new JRadioButton("BMP");
JRadioButton tiff = new JRadioButton("TIFF");
JRadioButton pos = new JRadioButton("POS");
JRadioButton neg = new JRadioButton("NEG");
JRadioButton horiz = new JRadioButton("HORIZ");
JRadioButton vertical = new JRadioButton("VERTICAL");
JComboBox combo = new JComboBox();

JLabel llx = new JLabel("LLx");
JLabel lly = new JLabel("LLy");
JLabel urx = new JLabel("URx");
JLabel ury = new JLabel("URy");
JLabel um = new JLabel("(UM)");
JLabel extentsProfile = new JLabel("Extents from Profile");
JLabel format = new JLabel("Format");
JLabel scale = new JLabel("SCALE");
JLabel mirror = new JLabel("MIRROR");
JLabel rotate = new JLabel("ROTATE");
JLabel width = new JLabel("WIDTH(PIXELS)");
JLabel length = new JLabel("LENGTH(PIXELS)");
JLabel ram = new JLabel("Buffer RAM (MByte");
JLabel threads = new JLabel("Number of Threads");
JLabel polarity = new JLabel("POLARITY");
JTextField input_llx = new JTextField("",10);
JTextField input_lly = new JTextField("",10);
JTextField input_urx = new JTextField("",10);
JTextField input_ury = new JTextField("",10);
JTextField input_length = new JTextField("",10);
JTextField input_width = new JTextField("",10);
JTextField input_browse = new JTextField("",10);
JTextField input_threads = new JTextField("",10);
JTextField input_ram = new JTextField("",10);
JTextField input_scale = new JTextField("",10);
JTextField input_dpi = new JTextField("",10);
JTextField input_dpm = new JTextField("",10);
JTextField input_pxSize = new JTextField("",10);
JCheckBox x = new JCheckBox("X");
JCheckBox y = new JCheckBox("Y");
JCheckBox force = new JCheckBox("FORCE");
JCheckBox force1 = new JCheckBox("FORCE");

JLabel llx1 = new JLabel("LLx");
JLabel lly1 = new JLabel("LLy");
JLabel urx1 = new JLabel("URx");
JLabel ury1 = new JLabel("URy");

JTextField input_llx1 = new JTextField("",1);
JTextField input_lly1 = new JTextField("",1);
JTextField input_urx1 = new JTextField("",1);
JTextField input_ury1 = new JTextField("",1);



JPanel grid1 = new JPanel();
grid1.setLayout(new GridLayout(1,8,1,1));
grid1.add(llx);
grid1.add(input_llx);
grid1.add(lly);
grid1.add(input_lly);
grid1.add(urx);
grid1.add(input_urx);
grid1.add(ury);
grid1.add(input_ury);

JPanel grid2 = new JPanel();
grid2.setLayout(new GridLayout(1,8,1,1));
grid2.add(llx1);
grid2.add(input_llx1);
grid2.add(lly1);
grid2.add(input_lly1);
grid2.add(urx1);
grid2.add(input_urx1);
grid2.add(ury1);
grid2.add(input_ury1);

JPanel window = new JPanel();
window.setLayout(new GridLayout(4,1,3,3));
window.add(extentsProfile);
window.add(grid1);
window.add(userDef);
window.add(grid2);

JPanel rasterSettings = new JPanel();
rasterSettings.setLayout(new GridLayout(3,2,3,3));
rasterSettings.add(dpi);
rasterSettings.add(dpm);
rasterSettings.add(pxSize);
rasterSettings.add(input_dpi);
rasterSettings.add(input_dpm);
rasterSettings.add(input_pxSize);
rasterSettings.add(um);

JPanel goldenEdges = new JPanel();
goldenEdges.setLayout(new GridLayout(2,2,3,3));
goldenEdges.add(top);
goldenEdges.add(bottom);
goldenEdges.add(left);
goldenEdges.add(right);

JPanel grid3 = new JPanel();
grid3.setLayout(new GridLayout(4,1,1,1));
grid3.add(input_scale);
grid3.add(x);
grid3.add(y);
grid3.add(combo);

JPanel grid4 = new JPanel();
grid4.setLayout(new GridLayout(4,1,1,1));
grid4.add(scale);
grid4.add(mirror);
grid4.add(rotate);

JPanel grid5 = new JPanel();
grid5.setLayout(new GridLayout(1,2,1,1));
grid5.add(grid4);
grid5.add(grid3);

JPanel grid6 = new JPanel();
grid6.setLayout(new GridLayout(3,1,1,1));
grid6.add(polarity);
grid6.add(pos);
grid6.add(neg);

JPanel transformations = new JPanel();
transformations.setLayout(new GridLayout(2,1,1,1));
transformations.add(grid5);
transformations.add(grid6);

JPanel grid12 = new JPanel();
grid12.setLayout(new GridLayout(1,2,1,1));
grid12.add(input_browse);
grid12.add(browse);

JPanel grid13 = new JPanel();
grid13.setLayout(new GridLayout(1,2,8,8));
grid13.add(bmp);
grid13.add(tiff);

JPanel grid14 = new JPanel();
grid14.setLayout(new GridLayout(3,1,1,1));
grid14.add(grid12);
grid14.add(format);
grid14.add(grid13);

JPanel outPutFile = new JPanel();
outPutFile.add(grid14);

JPanel grid15 = new JPanel();
grid15.setLayout(new GridLayout(2,1,1,1));
grid15.add(ram);
grid15.add(threads);

JPanel grid16 = new JPanel();
grid16.setLayout(new GridLayout(2,1,1,1));
grid16.add(input_ram);
grid16.add(input_threads);

JPanel computerSettings = new JPanel();
computerSettings.setLayout(new GridLayout(1,2,3,3));
computerSettings.add(grid15);
computerSettings.add(grid16);

JPanel grid17 = new JPanel();
grid17.setLayout(new GridLayout(1,2,1,1));
grid17.add(horiz);
grid17.add(vertical);

JPanel grid19 = new JPanel();
grid19.setLayout(new GridLayout(2,1,1,1));
grid19.add(input_width);
grid19.add(input_length);

JPanel grid20 = new JPanel();
grid20.setLayout(new GridLayout(2,1,1,1));
grid20.add(force);
grid20.add(force1);

JPanel grid18 = new JPanel();
grid18.setLayout(new GridLayout(2,1,1,1));
grid18.add(width);
grid18.add(length);

JPanel grid21 = new JPanel();
grid21.setLayout(new GridLayout(2,3));
grid21.add(grid20);
grid21.add(grid18);
grid21.add(grid19);

JPanel bandingControl = new JPanel();
bandingControl.setLayout(new GridLayout(2,1,1,1));
bandingControl.add(grid17);
bandingControl.add(grid21);

JPanel grid = new JPanel();
grid.setLayout(new GridLayout(1,2,3,3));
grid.add(window);
grid.add(outPutFile);

JPanel grid7 = new JPanel();
grid7.setLayout(new FlowLayout());
grid7.add(run);
grid7.add(close);
grid7.add(help);

JPanel grid8 = new JPanel();
grid8.setLayout(new GridLayout(2,1,1,1));
grid8.add(rasterSettings);
grid8.add(goldenEdges);

JPanel grid9 = new JPanel();
grid9.setLayout(new GridLayout(1,2,1,1));
grid9.add(grid8);
grid9.add(transformations);

JPanel grid10 = new JPanel();
grid10.setLayout(new GridLayout(2,1));
grid10.add(computerSettings);
grid10.add(bandingControl);

JPanel grid11 = new JPanel();
grid11.setLayout(new GridLayout(1,3,1,1));
grid11.add(grid9);
grid11.add(grid10);

JPanel content = new JPanel();
content.setLayout(new GridLayout(4,1,1,1));
content.add(grid);
content.add(grid11);
content.add(grid7);

displayPanel.add(content);

JFrame mainWindow = new JFrame("Get Steps/Layers");
mainWindow.setContentPane(content);
mainWindow.setSize(1200,950);
mainWindow.setLocation(10,10);
mainWindow.setVisible(true);
}

public static void main(String[] args) {
   MyGUI gui = new MyGUI();
    gui.setVisible(true);
}
}

