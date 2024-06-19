import java.util.ArrayList;
import java.util.List;



public class PedraPreciosaService {

    // Declaração de uma lista privada de objetos PedraPreciosa
        private List<PedraPreciosa> pedras;

    // Construtor da classe PedraPreciosaService, inicializa a lista de pedras como um ArrayList vazio
        public PedraPreciosaService() {
            this.pedras = new ArrayList<>();
        }
    // Método para adicionar uma pedra preciosa à lista de pedras
        public void adicionarPedra(PedraPreciosa pedra) {
            pedras.add(pedra); // Adiciona o objeto PedraPreciosa passado como parâmetro à lista
        }

    // Método para listar todas as pedras preciosas
        public List<PedraPreciosa> listarPedras() {
            return pedras; // Retorna a lista de pedras preciosas
        }

    // Método para encontrar uma pedra preciosa pelo tipo
        public PedraPreciosa encontrarPedraPorTipo(String tipo) {

            // Itera sobre a lista de pedras preciosas
            for (PedraPreciosa pedra : pedras) {
                // Se o tipo da pedra atual for igual ao tipo passado como parâmetro, retorna a pedra
                if (pedra.getTipo().equalsIgnoreCase(tipo)) {
                    return pedra;
                }
            }
            return null; // Se não encontrar nenhuma pedra com o tipo especificado, retorna null
        }
    }

