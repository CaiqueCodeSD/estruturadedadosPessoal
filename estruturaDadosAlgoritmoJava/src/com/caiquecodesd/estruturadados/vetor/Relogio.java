public class Relogio {
    int codigo;
    String modelo;
    String marca;
    String tipoPulseira;
    String material;
    String tipoMovimento;
    float valorCompra;
    float valorVenda;
    int quantidadeEstoque;

    public Relogio(int c, String m, String ma, String tp, String mat, String tm, float vc, float vv, int q) {
        this.codigo = c;
        this.modelo = m;
        this.marca = ma;
        this.tipoPulseira = tp;
        this.material = mat;
        this.tipoMovimento = tm;
        this.valorCompra = vc;
        this.valorVenda = vv;
        this.quantidadeEstoque = q;
    }
}
