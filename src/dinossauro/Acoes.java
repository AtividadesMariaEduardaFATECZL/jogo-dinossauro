package dinossauro;

public enum Acoes {
    A("Cantar") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.cantar();
            System.out.println("Atual situação do dino " + dinossauro);
        }
    },
    C("Correr") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.correr();
            System.out.println("Atual situação do dino " + dinossauro);
        }
    },
    M("Comer") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.comer();
            System.out.println("Atual situação do dino " + dinossauro);
        }
    },
    O("Ficar na sombra") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.ficarNaSombra();
            System.out.println("Atual situação do dino " + dinossauro);
        }
    },
    S("Tomar sol") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.tomarSol();
            System.out.println("Atual situação do dino " + dinossauro);
        }
    },
    P("Pular") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.pular();
            System.out.println("Atual situação do dino " + dinossauro);
        }
    };

    private final String nome;

    Acoes(String nome) {
        this.nome = nome;
    }

    abstract void executa(Dinossauro dinossauro);
}
