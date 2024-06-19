public class PedraPreciosa {

    //atributos privados da classe PedraPreciosa//
        private String tipo;
        private double quilates;
        private String cor;

        public  String diamante;
        public String ruby;
        public String safira;
        public String esmeralda;

        public PedraPreciosa(String tipo, double quilates, String cor) {
            this.tipo = tipo; //armazena o tipo da joia
            this.quilates = quilates; //armazena os quilates da joia
            this.cor = cor; //armazena a cor da joia
            this.diamante = diamante;
            this.ruby = ruby;
            this.safira = safira;
            this.esmeralda = esmeralda;


        }


        public String getTipo() {
            return tipo; //retorna o tipo
        }

        public double getQuilates() {
            return quilates; //retorna os quilates
        }

        public String getCor() {
            return cor; //retorna a cor
        }

        public String getDiamante(){
            return diamante;
        }

        public String getRuby(){
            return ruby;
        }

        public String getSafira(){
            return safira;
        }



        public String getEsmeralda(){
            return esmeralda;
        }

        @Override
        public String toString() {
            return "PedraPreciosa{" + //retorna PedraPreciosa + os valores atribuidos
                    "tipo='" + tipo + '\'' + // retorna tipo + o valor atribuido para tipo
                    ", quilates=" + quilates + //retorna tipo + o valor atribuido para quilates
                    ", cor='" + cor + '\'' + // retorna cor + o valor atribuido para cor
                    " diamante " +diamante +'\'' + // retorna o tipo de pedra preciosa diamante
                    " ruby " +ruby +'\'' + // retorna o tipo de pedra preciosa ruby
                    " safira " +safira +'\'' + // retorna o tipo de pedra preciosa safira
                    " esmeralda " +esmeralda +'\'' + // retorna o tipo de pedra preciosa esmeralda
                    '}';
        }
    }

