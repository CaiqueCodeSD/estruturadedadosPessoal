class Relogio {
    int codigo;
    String modelo;
    String marca;
    String tipoPulseira;
    String material;
    String tipoMovimento;
    float valorCompra;
    float valorVenda;
    int quantidadeEstoque;
    Relogio prox;

    Relogio(int c, String m, String ma, String tp, String mat, String tm, float vc, float vv, int q) {
        this.codigo = c;
        this.modelo = m;
        this.marca = ma;
        this.tipoPulseira = tp;
        this.material = mat;
        this.tipoMovimento = tm;
        this.valorCompra = vc;
        this.valorVenda = vv;
        this.quantidadeEstoque = q;
        this.prox = null;
    }
}

class ControleEstoque2 {
    private Relogio inicio = null;
    private Relogio fim = null;

    public void adicionarRelogio(Relogio r) {
        if (inicio == null) {
            inicio = r;
            fim = r;
        } else {
            fim.prox = r;
            fim = r;
        }
    }

    public String mostrarRelogios() {
        Relogio aux = inicio;
        if (aux == null) {
            return "A lista está vazia.";
        }
        
        String resultado = "";
        while (aux != null) {
            resultado += "Código: " + aux.codigo + "\n";
            resultado += "Modelo: " + aux.modelo + "\n";
            resultado += "Marca: " + aux.marca + "\n";
            resultado += "Tipo de Pulseira: " + aux.tipoPulseira + "\n";
            resultado += "Material: " + aux.material + "\n";
            resultado += "Tipo de Movimento: " + aux.tipoMovimento + "\n";
            resultado += "Valor de Compra: R$" + aux.valorCompra + "\n";
            resultado += "Valor de Venda: R$" + aux.valorVenda + "\n";
            resultado += "Quantidade em Estoque: " + aux.quantidadeEstoque + "\n";
            resultado += "-------------------------\n";
            aux = aux.prox;
        }
        return resultado;
    }

    public void removerRelogio(int codigo) {
        if (inicio == null) {
            return;
        }
        if (inicio.codigo == codigo) {
            inicio = inicio.prox;
            return;
        }
        Relogio atual = inicio;
        while (atual.prox != null && atual.prox.codigo != codigo) {
            atual = atual.prox;
        }
        if (atual.prox != null) {
            atual.prox = atual.prox.prox;
        }
    }

    public void reporEstoque(int codigo, int quantidade) {
        Relogio aux = inicio;
        while (aux != null) {
            if (aux.codigo == codigo) {
                aux.quantidadeEstoque += quantidade;
                return;
            }
            aux = aux.prox;
        }
    }
}
