package np1;

public class Materia {

    private String nome;
    private int ano;

    public Materia(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Nome: " + getNome() + "\n";
        res += "Ano: " + getAno();
        return res;
    }
}
