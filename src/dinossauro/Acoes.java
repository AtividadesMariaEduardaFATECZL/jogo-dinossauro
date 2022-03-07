package dinossauro;

public enum Acoes {

    A("cantar") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.cantar();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    C("correr") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.correr();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    M("comer") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.comer();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    S("tomar sol") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.tomarSol();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    O("ficar na sombra") {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.ficarNaSombra();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    };

    private final String nome;

    Acoes(String nome) {
        this.nome = nome;
    }

    abstract void executa(Dinossauro dinossauro);
}
