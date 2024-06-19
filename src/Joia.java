public class Joia {

    //atributos privados da classe joia
        private String nome;
        private String material;
        private double peso;


    // Construtor da classe Joia, utilizado para inicializar os atributos quando um objeto Joia é criado
        public Joia(String nome, String material, double peso) {
            this.nome = nome; //armazena o nome da joia
            this.material = material; //armazena o material da joia
            this.peso = peso; //armazena o peso da joia
        }

    // Método getter para o atributo nome, permite acessar o valor de nome fora da classe
        public String getNome() {
            return nome; //returna o nome da joia
        }

    // Método getter para o atributo material, permite acessar o valor de material fora da classe
        public String getMaterial() {
            return material;
        }

    // Método getter para o atributo peso, permite acessar o valor de material fora da classe
        public double getPeso() {
            return peso;
        }

        @Override
        public String toString() {
            // Retorna uma String formatada com os valores dos atributos nome, material e peso
            return "Joia{" +
                    "nome='" + nome + '\'' +
                    ", material='" + material + '\'' +
                    ", peso=" + peso +
                    '}';
        }
    }
