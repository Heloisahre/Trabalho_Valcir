import java.util.ArrayList;
import java.util.List;
public class JoiaService {

    // Declaração de uma lista privada de objetos Joia
        private List<Joia> joias;

    // Construtor da classe JoiaService, inicializa a lista de joias como um ArrayList vazio
        public JoiaService() {
            this.joias = new ArrayList<>();
        }
    // Método para adicionar uma joia à lista de joias
        public void adicionarJoia(Joia joia) {
            joias.add(joia);
        }

    // Método para listar todas as joias
        public List<Joia> listarJoias() {
            return joias; //retorna as listas de joias
        }
    // Método para encontrar uma joia pelo nome
        public Joia encontrarJoiaPorNome(String nome) {
            // Itera sobre a lista de joias
            for (Joia joia : joias) {
                // Se o nome da joia atual for igual ao nome passado como parâmetro, retorna a joia
                if (joia.getNome().equalsIgnoreCase(nome)) {
                    return joia;
                }
            }

            // Se não encontrar nenhuma joia com o nome especificado, retorna null
            return null;
        }
    }

