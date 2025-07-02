package ProcessoSeletivo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static List<String> selecaoCandidato(){

        String[] candidatos = {"Amanda Costa", "Bruno Ferreira", "Carla Mendes", "Diego Lima", "Eduarda Rocha", "Felipe Nunes", "Gabriela Silva", "Henrique Souza" };
        List<String> selecionados = new ArrayList<>();

        final double salarioBase = 2000.00;

        for (String candidato : candidatos) {
            if(selecionados.size() >= 5) break;

            double salarioPretendido = gerarSalarioPretendido();
            exibirCandidato(candidato,salarioPretendido);


            if(salarioBase >= salarioPretendido){
                System.out.printf("-> Candidato %s foi selecionado.%n", candidato);
                selecionados.add(candidato);
            }
        }
        return selecionados;
    }

    private static void exibirCandidato(String nome, double salario) {
        System.out.printf("O candidato %s solicitou R$ %.2f de salário.%n", nome, salario);
    }

    public static void imprimirSelecionados(List<String> selecionados){
        for (Object selecionado : selecionados) {
            System.out.println(selecionado);
        }
    }
    public static double gerarSalarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

}
