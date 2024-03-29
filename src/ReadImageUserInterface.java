
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class ReadImageUserInterface extends JFrame implements ActionListener{//[1]
    ReadImageComponent component = null;//[2]
    ReadImageUserInterface () {//[3]
        setTitle("Java 画像サンプル");//[4]
        setSize(320,160);//[5]
        setLayout(new BorderLayout());//[6]
        Container contentPane = getContentPane();//[7]
        component = new ReadImageComponent();//[8]
        contentPane.add(component, BorderLayout.CENTER);//[9]
        JButton button = new JButton("Save");//[10]
        button.addActionListener(this);//[11]
        contentPane.add(button, BorderLayout.SOUTH);//[12]
    }
    public void actionPerformed(ActionEvent e){//[20]
        component.writeImage();//[21]
    }
    public static void main(String[] args) {//[30]
        ReadImageUserInterface readImageUserInterface = new ReadImageUserInterface();//[31]
        WindowAdapter windowAdapter = new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };//[32]
        readImageUserInterface.addWindowListener(windowAdapter);//[33]
        readImageUserInterface.pack();//[34]
        readImageUserInterface.setVisible(true);//[35]
    }
}