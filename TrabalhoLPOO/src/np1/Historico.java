package np1;

import java.util.ArrayList;

public class Historico {

    private final ArrayList<Rendimento> historico = new ArrayList<Rendimento>();

    public ArrayList<Rendimento> getHistorico() {
        return historico;
    }

    public void cadastrarRendimento(Rendimento rendimento){
        this.historico.add(rendimento);
    }

    public void listarTodasCadastradas(){
        if (this.historico.size() > 0){
            System.out.println("\nMatérias cadastradas:");
            for (Rendimento rendi: this.historico){
                System.out.println(rendi.getMateria().getNome());
            }
        }
        else {
            System.out.println("\nO sistema ainda não possui matérias cadastradas!");
        }
    }

    public void listarPorAno(int ano) {
        int contador = 0;
        System.out.println("\nMatérias do ano " + ano + ":");
        for (Rendimento rendi : this.historico) {
            if (rendi.getMateria().getAno() == ano) {
                System.out.println(rendi.getMateria().getNome());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("Nenhuma matéria encontrada neste ano!");
        }
    }

    public void apenasAprovadas(){
        if (this.historico.size() > 0){
            System.out.println("\nMatérias aprovadas");
            for (Rendimento rendi: this.historico) {
                if (rendi.isSituacao()){
                    System.out.println(rendi.getMateria().getNome());
                }
            }
        }
        else {
            System.out.println("\nO sistema ainda não possui matérias cadastradas!");
        }
    }

    public void apenasReprovadas(){
        if (this.historico.size() > 0){
            System.out.println("\nMatérias reprovadas:");
            for (Rendimento rendi: this.historico){
                if (!rendi.isSituacao()){
                    System.out.println(rendi.getMateria().getNome());
                }
            }
        }
        else{
            System.out.println("\nO sistema ainda não possui matérias cadastradas!");
        }
    }

    private Materia maiorMedia() {
        double maiorMedia = 0;
        Materia materia = null;
        for (Rendimento rendi : this.historico) {
            if (rendi.getMedia() > maiorMedia){
                maiorMedia = rendi.getMedia();
                materia = rendi.getMateria();
            }
        }
        return materia;
    }

    private Materia menorMedia() {
        double menorMedia = 100;
        Materia materia = null;
        for (Rendimento rendi : this.historico) {
            if (rendi.getMedia() < menorMedia){
                menorMedia = rendi.getMedia();
                materia = rendi.getMateria();
            }
        }
        return materia;
    }


    public void relatorio(){
        if (this.historico.size() > 0){
            System.out.println("------- RELATORIO! --------");
            System.out.println("Materias: ");
            int contador = 1;
            for (Rendimento rendi : this.historico){
                System.out.println(" ");
                System.out.println("----" + contador + "º" + " Materia: ----" );
                System.out.println(rendi);
                contador++;
            }
            System.out.println("");
            System.out.println("Materia com maior media: ");
            System.out.println(" - Nome: " + maiorMedia().getNome());
            System.out.println("");
            System.out.println("Materia com menor media: ");
            System.out.println(" - Nome: " + menorMedia().getNome());
            double rendimento = 0;
            for (Rendimento rendi: this.historico){
                rendimento += rendi.getMedia();
            }
            rendimento = rendimento/historico.size();
            System.out.println("");
            System.out.println("Coeficiente de rendimento: " + rendimento);
            System.out.println("\n---- FIM DO RELATORIO! ----");
        }
        else {
            System.out.println("Relatório: \n - O sistema ainda não possui matérias cadastradas!");
        }
    }

}
