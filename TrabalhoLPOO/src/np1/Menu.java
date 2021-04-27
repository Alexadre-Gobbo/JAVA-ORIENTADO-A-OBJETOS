package np1;

import java.util.Scanner;

public class Menu {
    
    public void Iniciar(){
        Scanner inputNum = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        Historico historico = new Historico();

        String opcao = "0";
        while (!opcao.equals("7")){
            System.out.println("");
            System.out.println("Escolha um funcionalidade");
            System.out.println(" 1 - Cadastrar materia.");
            System.out.println(" 2 - Lista todas as matérias.");
            System.out.println(" 3 - Lista matéria por ano.");
            System.out.println(" 4 - Listar aprovadas.");
            System.out.println(" 5 - Listar reprovadas.");
            System.out.println(" 6 - Relatório.");
            System.out.println(" 7 - Sair do sistema.");
            System.out.println("Digite a opção desejada: ");
            opcao = inputString.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("");
                    System.out.println("Digite o nome da matéria: ");
                    String nomeMateria = inputString.nextLine();
                    System.out.println("Digite o ano que foi aplicada: ");
                    int ano = inputNum.nextInt();
                    System.out.println("Digite a nota da Np1");
                    double np1 = inputNum.nextDouble();
                    System.out.println("Digite a nota da Np2");
                    double np2 = inputNum.nextDouble();
                    System.out.println("Digite a nota da Sub");
                    double sub = inputNum.nextDouble();
                    System.out.println("Digite a nota Exame");
                    double exame = inputNum.nextDouble();
                    historico.cadastrarRendimento(new Rendimento(new Materia(nomeMateria, ano), new Notas(np1, np2, sub, exame)));
                    System.out.println(" ");
                    System.out.println("Matéria cadastrada com sucesso!");
                    break;
                case "2":
                    historico.listarTodasCadastradas();
                    break;
                case "3":
                    if (historico.getHistorico().size() > 0) {
                        System.out.println("");
                        System.out.println("Digite o ano desejado: ");
                        int anoProcurado = inputNum.nextInt();
                        historico.listarPorAno(anoProcurado);
                    } else {
                        System.out.println("");
                        System.out.println("O sistema ainda não possui matérias cadastradas!");
                    }
                    break;
                case "4":
                    historico.apenasAprovadas();
                    break;
                case "5":
                    historico.apenasReprovadas();
                    break;
                case "6":
                    System.out.println("");
                    historico.relatorio();
                    break;
                case "7":
                    System.out.println(" ");
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
