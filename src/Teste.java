import dinossauro.Acoes;
import dinossauro.Dinossauro;
import dinossauro.EscolheAcoesService;

public class Teste {
    public static void main(String[] args) {
        EscolheAcoesService escolheAcoesService = new EscolheAcoesService();

        Dinossauro skeep = new Dinossauro();
        while (escolheAcoesService.estaVivo(skeep)) {
            String option = escolheAcoesService.abreMenu();
            if (option != null) {
                escolheAcoesService.escolheAcao(Acoes.valueOf(option.toUpperCase()),skeep);
            }
        }
        System.out.println("Fim de jogo. Você perdeu");
    }
}
