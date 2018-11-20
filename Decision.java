import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Decision {

    private JPanel mainWin;


    public static void main(String[] args) throws IOException {
        JFrame csFrame = new JFrame("Choose an Option: ");
        csFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        csFrame.getContentPane().add(new MainWindow());
        csFrame.pack();
        csFrame.setVisible(true);



        /* ***************************************************************************************************************************** */


        Scanner scan = new Scanner(new File("./src/ListOfPlayers"));

        LinkedList<Player>team;

        FootballTeam Liverpool = new FootballTeam("Liverpool",5);
        team = Liverpool.initPlayersassigner(scan);

        for (Player k: team)
            System.out.println(k.toString());

    }
}
