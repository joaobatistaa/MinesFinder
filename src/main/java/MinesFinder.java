import javax.swing.*;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JPanel painelOeste;
    private JLabel labelTitulo;
    private JPanel painelCentro;
    private JLabel labelRecordes;

    public MinesFinder(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
    }
    public static void main(String[] args) {
        new MinesFinder("Mines Finder").setVisible(true);
    }
}