import dinossauro.Dinossauro;
import dinossauro.EscolheAcoesService;

public class Teste {
    public static void main(String[] args) {
        EscolheAcoesService escolheAcoesService = new EscolheAcoesService();

        Dinossauro skeep = new Dinossauro();
        Dinossauro scan = new Dinossauro();
        while (escolheAcoesService.estaVivo(skeep)) {
            String option = escolheAcoesService.abreMenu();
            escolheAcoesService.escolheAcao(skeep, option);
        }
        System.out.println("fim de jogo. Você perdeu");
    }
}
