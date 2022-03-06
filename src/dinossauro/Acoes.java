package dinossauro;

public enum Acoes implements ExecutaAcoes {

    A {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.cantar();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    C {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.correr();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    M {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.comer();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    S {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.tomarSol();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    },
    O {
        @Override
        public void executa(Dinossauro dinossauro) {
            dinossauro.ficarNaSombra();
            System.out.println("Atual situação do dino " + dinossauro.toString());
        }
    }
}
