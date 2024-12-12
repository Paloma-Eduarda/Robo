public class Robo {
    //posição x
    private int linha;
   //posição y
    private int coluna;
    private int passo;

    private final int maxLinhas = 20;
    private final int maxColunas = 40;

    public Robo(int linha, int passo, int coluna) {
        this.linha = linha;
        this.passo = passo;
        this.coluna = coluna;
    }

    public String mostrarPosicaoAtual(){
        return "Posição Atual: " + this.linha + "," + this.coluna + "; Passo:" + this.passo ;
    }
    public void andarFrente(){
        if (coluna + passo < maxColunas) {
            this.coluna= this.coluna + 1;
        }
    }
    public void andarTras(){
        if (coluna > 0) {
            this.coluna = this.coluna - 1;
        }
    }
    public void andarDireita(){
        this.linha = this.linha + 1;
    }
    public void andarEsquerda(){
        this.linha = this.linha - 1;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getPasso() {
        return passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }
}
