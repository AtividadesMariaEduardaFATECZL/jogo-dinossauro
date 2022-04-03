package dinossauro;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EscolheAcoesService {
    public String abreMenu() {
        return JOptionPane.showInputDialog(null, "Escolha uma letra para começar o jogo sendo: " +
                "P(pular), C(correr), M (comer), A(cantar) S(tomar sol) e O(ficar na sombra)");
    }

    public void escolheAcao(Acoes acoes, Dinossauro dinossauro) {
        acoes.executa(dinossauro);
    }

    public boolean estaVivo(Dinossauro skeep) {
        List<BigDecimal> pontosPorAcao = new ArrayList<>();
        pontosPorAcao.add(skeep.getVelocidade());
        pontosPorAcao.add(skeep.getEnergia());
        pontosPorAcao.add(skeep.getTemperatura());

        return pontosPorAcao.stream().allMatch(b -> b.compareTo(BigDecimal.ZERO) > 0);
    }
}
