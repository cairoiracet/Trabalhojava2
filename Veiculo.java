public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Método abstrato
    public abstract String informacoesVeiculo();

    // Métodos de acesso ao atributo ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
