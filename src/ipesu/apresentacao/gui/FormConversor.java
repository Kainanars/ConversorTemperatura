package ipesu.apresentacao.gui;

        import ipesu.negocio.ConversorTemperatura;

        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JTextField;
        import javax.swing.JButton;
        import java.awt.FlowLayout;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class FormConversor extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel l1, l2;
    private JTextField t1, t2;
    private JButton b;
    private ConversorTemperatura conversorTemperatura;

    public FormConversor() {
        super("Conversor de Temperatura");
        setLayout(new FlowLayout());

        l1 = new JLabel("Fahrenheit:");
        add(l1);

        t1 = new JTextField(10);
        add(t1);

        b = new JButton("Converter");
        add(b);

        l2 = new JLabel("Celsius:");
        add(l2);

        t2 = new JTextField(10);
        t2.setEditable(false);
        add(t2);

        conversorTemperatura = new ConversorTemperatura();

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fahrenheitText = t1.getText();
                try {
                    double fahrenheit = Double.parseDouble(fahrenheitText);
                    double celsius = conversorTemperatura.converterParaCelsius(fahrenheit);
                    String formattedCelsius = String.format("%.2f", celsius);
                    t2.setText(formattedCelsius + "°C");
                } catch (NumberFormatException ex) {
                    t2.setText("Inválido");
                }
            }
        });
    }
}
