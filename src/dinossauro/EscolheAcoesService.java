package dinossauro;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EscolheAcoesService {
    public void escolheAcao(Dinossauro skeep, String option) {
        DefineAcao defineAcao = new DefineAcao();
        defineAcao.calcular(Acoes.valueOf(option.toUpperCase()),skeep);
    }

    public String abreMenu() {
        return JOptionPane.showInputDialog(null, "Escolha uma letra para começar o jogo sendo: " +
                "P(pular), C(correr), M (comer), A(cantar) S(tomar sol) e O(ficar na sombra)");
    }

    public boolean estaVivo(Dinossauro skeep) {
        List<BigDecimal> pontosPorAcao = new ArrayList<>();
        pontosPorAcao.add(skeep.getVelocidade());
        pontosPorAcao.add(skeep.getEnergia());
        pontosPorAcao.add(skeep.getTemperatura());

        return pontosPorAcao.stream().allMatch(b -> b.compareTo(BigDecimal.ZERO) > 0);
    }
}
