package np1;

public class Rendimento {

    private Materia materia;
    private Notas notas;
    private double media;
    private boolean situacao;

    public Rendimento(Materia materia, Notas notas) {
        this.materia = materia;
        this.notas = notas;
        this.setMedia();
        this.setSituacao();
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public double getMedia(){
        return this.media;
    }

    public final void setMedia(){
        if (getNotas().getNp1() > getNotas().getSub() && getNotas().getNp2() > getNotas().getSub()){
            this.media = (this.notas.getNp1() + this.notas.getNp2()) / 2;
        }
        else if (getNotas().getNp1() < getNotas().getSub() && getNotas().getNp1() < getNotas().getNp2()) {
            this.media = (this.notas.getNp2() + this.notas.getSub()) / 2;
        }
        else {
            this.media = (this.notas.getNp1() + this.notas.getSub()) / 2;
        }

        if (this.media < 7){
            this.media = (getMedia() + getNotas().getExam()) / 2;
        }
    }

    public boolean isSituacao() {
        return situacao;
    }

    public final void setSituacao() {
        this.situacao = (getMedia() >= 5);
    }

    @Override
    public String toString() {
        String res = "";
        res += getMateria() + "\n";
        res += "Notas: \n" + getNotas() + "\n";
        res += "Média: " + getMedia() + "\n";
        res += "Situação: " + isSituacao();
        return res;
    }
}
