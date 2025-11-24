
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.*;

public class MyButton extends Frame implements ActionListener {

    Button B1;
    TextField text1;
    TextArea area;

    MyButton() {
        setLayout(new FlowLayout());

        // text1 = new TextField(20);
        // add(text1);
        area = new TextArea(20, 40);
        add(area);

        B1 = new Button("Red");
        add(B1);
        B1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        try {
            FileReader fr = new FileReader("data.txt");

            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            StringBuilder content = new StringBuilder();
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }

            area.setText(content.toString());

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public static void main(String[] args) {
        MyButton b = new MyButton();
        b.setVisible(true);
        b.setSize(300, 400);
        b.setBackground(Color.yellow);

    }

}
