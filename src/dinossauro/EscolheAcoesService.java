package dinossauro;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EscolheAcoesService {
    public static void escolheAcao(Dinossauro skeep, String option) {
        switch (option.toUpperCase()) {
            case "P":
                skeep.pular();
                System.out.println("Atual situação do dino " + skeep.toString());
                break;
            case "A":
                skeep.cantar();
                System.out.println("Atual situação do dino " + skeep.toString());
                break;
            case "C":
                skeep.correr();
                System.out.println("Atual situação do dino " + skeep.toString());
                break;
            case "M":
                skeep.comer();
                System.out.println("Atual situação do dino " + skeep.toString());
                break;
            case "S":
                skeep.tomarSol();
                System.out.println("Atual situação do dino " + skeep.toString());
            case "O":
                skeep.ficarNaSombra();
                System.out.println("Atual situação do dino " + skeep.toString());

        }
    }

    public static String abreMenu() {
        return JOptionPane.showInputDialog(null, "Escolha uma letra para começar o jogo sendo: " +
                "P(pular), C(correr), M (comer), A(cantar) S(tomar sol) e O(ficar na sombra)");
    }

    public static boolean isAlive(Dinossauro skeep) {
        List<BigDecimal> pontosPorAcao = new ArrayList<>();
        pontosPorAcao.add(skeep.getVelocidade());
        pontosPorAcao.add(skeep.getEnergia());
        pontosPorAcao.add(skeep.getTemperatura());

        return pontosPorAcao.stream().allMatch(b -> b.compareTo(BigDecimal.ZERO) > 0);
    }
}
