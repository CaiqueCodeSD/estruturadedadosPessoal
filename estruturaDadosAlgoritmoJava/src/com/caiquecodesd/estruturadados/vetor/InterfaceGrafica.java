import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica extends JFrame {
    private JTextField tfCodigo, tfModelo, tfMarca, tfTipoPulseira, tfMaterial, tfTipoMovimento, tfValorCompra, tfValorVenda, tfQuantidadeEstoque, tfQuantidadeRepor;
    private JTextArea taRelogios;
    private JButton btnAdicionar, btnMostrar, btnRemover, btnRepor;
    private ControleEstoque estoque;

    public InterfaceGrafica() {
        estoque = new ControleEstoque();

        setTitle("Controle de Estoque - Relojoaria");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel painelCampos = new JPanel(new GridLayout(10, 2, 5, 5));
        painelCampos.setBorder(BorderFactory.createTitledBorder("Cadastro de Relógios"));

        painelCampos.add(new JLabel("Código:"));
        tfCodigo = new JTextField(15);
        painelCampos.add(tfCodigo);

        painelCampos.add(new JLabel("Modelo:"));
        tfModelo = new JTextField(15);
        painelCampos.add(tfModelo);

        painelCampos.add(new JLabel("Marca:"));
        tfMarca = new JTextField(15);
        painelCampos.add(tfMarca);

        painelCampos.add(new JLabel("Tipo de Pulseira:"));
        tfTipoPulseira = new JTextField(15);
        painelCampos.add(tfTipoPulseira);

        painelCampos.add(new JLabel("Material:"));
        tfMaterial = new JTextField(15);
        painelCampos.add(tfMaterial);

        painelCampos.add(new JLabel("Tipo de Movimento:"));
        tfTipoMovimento = new JTextField(15);
        painelCampos.add(tfTipoMovimento);

        painelCampos.add(new JLabel("Valor de Compra (R$):"));
        tfValorCompra = new JTextField(15);
        painelCampos.add(tfValorCompra);

        painelCampos.add(new JLabel("Valor de Venda (R$):"));
        tfValorVenda = new JTextField(15);
        painelCampos.add(tfValorVenda);

        painelCampos.add(new JLabel("Quantidade em Estoque:"));
        tfQuantidadeEstoque = new JTextField(15);
        painelCampos.add(tfQuantidadeEstoque);

        painelCampos.add(new JLabel("Quantidade para Repor:"));
        tfQuantidadeRepor = new JTextField(15);
        painelCampos.add(tfQuantidadeRepor);
        tfQuantidadeRepor.setVisible(false);

        JPanel painelBotoes = new JPanel();
        btnAdicionar = new JButton("Adicionar Relógio");
        btnMostrar = new JButton("Mostrar Relógios");
        btnRemover = new JButton("Remover Relógio");
        btnRepor = new JButton("Repor Estoque");
        painelBotoes.add(btnAdicionar);
        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnRemover);
        painelBotoes.add(btnRepor);

        taRelogios = new JTextArea(15, 60);
        taRelogios.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taRelogios);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Lista de Relógios"));

        add(painelCampos, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        btnAdicionar.addActionListener(e -> adicionarRelogio());
        btnMostrar.addActionListener(e -> estoque.mostrarRelogios(taRelogios));
        btnRemover.addActionListener(e -> removerRelogio());
        btnRepor.addActionListener(e -> {
            tfQuantidadeRepor.setVisible(true);
            taRelogios.setText("Insira a quantidade para repor e pressione Enter.");
        });

        tfQuantidadeRepor.addActionListener(e -> reporEstoque());
            }
        
            private void reporEstoque() {
                try {
                    int codigo = Integer.parseInt(tfCodigo.getText());
                    int quantidadeRepor = Integer.parseInt(tfQuantidadeRepor.getText());
            
                    estoque.reporEstoque(codigo, quantidadeRepor, taRelogios);
                    
                    tfQuantidadeRepor.setText("");
                    tfQuantidadeRepor.setVisible(false);
                } catch (NumberFormatException ex) {
                    taRelogios.setText("Erro: Quantidade inválida.");
                }
            }
            
        
            private void adicionarRelogio() {
        try {
            int codigo = Integer.parseInt(tfCodigo.getText());
            String modelo = tfModelo.getText();
            String marca = tfMarca.getText();
            String tipoPulseira = tfTipoPulseira.getText();
            String material = tfMaterial.getText();
            String tipoMovimento = tfTipoMovimento.getText();
            float valorCompra = Float.parseFloat(tfValorCompra.getText());
            float valorVenda = Float.parseFloat(tfValorVenda.getText());
            int quantidadeEstoque = Integer.parseInt(tfQuantidadeEstoque.getText());

            Relogio relogio = new Relogio(codigo, modelo, marca, tipoPulseira, material, tipoMovimento, valorCompra, valorVenda, quantidadeEstoque);
            estoque.adicionarRelogio(relogio);
            taRelogios.setText("Relógio adicionado com sucesso.");
        } catch (NumberFormatException ex) {
            taRelogios.setText("Erro: Verifique os campos numéricos.");
        }
    }

    private void removerRelogio() {
        try {
            int codigo = Integer.parseInt(tfCodigo.getText());
            estoque.removerRelogio(codigo, taRelogios);
        } catch (NumberFormatException ex) {
            taRelogios.setText("Erro: Código inválido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfaceGrafica().setVisible(true));
    }
}
