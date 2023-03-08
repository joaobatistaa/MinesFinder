import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JPanel painelOeste;
    private JLabel labelTitulo;
    private JPanel painelCentro;
    private JLabel labelRecordes;
    private JLabel labelNivelMedio;
    private JLabel labelNomeJogador1;
    private JLabel labelNivelFacil;
    private JLabel labelNomeJogador2;
    private JLabel labelNivelDificil;
    private JLabel labelNomeJogador3;
    private JButton botaoJogoMedio;
    private JButton botaoJogoDificil;
    private JButton botaoSair;
    private JButton botaoJogoFacil;

    public MinesFinder(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        botaoSair.addActionListener(this::btnSairActionPerformed);
    }
    public static void main(String[] args) {
        new MinesFinder("Mines Finder").setVisible(true);
    }

    private void btnSairActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}