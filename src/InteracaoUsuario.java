import java.util.Scanner;

public class InteracaoUsuario {

    // Declaração de atributos
        private JoiaService joiaService = new JoiaService();
        private PedraPreciosaService pedraPreciosaService = new PedraPreciosaService();
        private Scanner scanner = new Scanner(System.in);

    // Método principal para iniciar a interação com o usuário
        public void iniciar() {
            boolean continuar = true; // Variável para controlar o loop principal

            // Loop principal de interação com o usuário
            while (continuar) {

                // Exibe as opções de menu para o usuário
                System.out.println("1. Adicionar Joia");
                System.out.println("2. Listar Joias");
                System.out.println("3. Adicionar Pedra Preciosa");
                System.out.println("4. Listar Pedras Preciosas");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário
                scanner.nextLine(); // Consumir o \n para evitar problemas de leitura subsequente

                // Executa ações com base na opção escolhida pelo usuário
                switch (opcao) {
                    case 1:
                        adicionarJoia(); // Chama o método para adicionar uma joia
                        break;
                    case 2:
                        listarJoias(); //Chama o metodo para listar joia
                        break;
                    case 3:
                        adicionarPedraPreciosa(); // Chama o método para adicionar pedra preciosa
                        break;
                    case 4:
                        listarPedrasPreciosas(); //Chama o método listar pedras preciosas
                        break;
                    case 5:
                        continuar = false; // Seta a variável para false, encerrando o loop e saindo do programa
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente."); // Mensagem para opção inválida
                }
            }
        }

    // Método para adicionar uma joia
        private void adicionarJoia() {
            System.out.print("Nome da Joia: "); //printa "nome da joia"//
            String nome = scanner.nextLine(); // Lê o nome da joia
            System.out.print("Material da Joia: "); //printa "Material da joia"
            String material = scanner.nextLine(); //Lê material da joia
            System.out.print("Peso da Joia (em gramas): "); //printa peso da joia (em gramas)"
            double peso = scanner.nextDouble(); // Lê o peso da joia
            scanner.nextLine(); // Consumir o \n para evitar problemas de leitura subsequente

            // Cria um novo objeto Joia com os dados fornecidos
            Joia joia = new Joia(nome, material, peso); //nova joia (nome, material, peso)
            joiaService.adicionarJoia(joia); // Adiciona a joia ao serviço de joia
            System.out.println("Joia adicionada com sucesso!"); // Mensagem de sucesso
        }

    // Método para listar todas as joias
        private void listarJoias() {
            System.out.println("Joias:");
            for (Joia joia : joiaService.listarJoias()) { // Itera sobre a lista de joias
                System.out.println(joia); // Mensagem de sucesso
            }
        }
    // Solicita ao usuário para inserir o tipo da pedra preciosa
        private void adicionarPedraPreciosa() {
            // Lê o tipo da pedra preciosa a partir da entrada do usuário e armazena na variável 'tipo'
            System.out.print("Tipo da Pedra Preciosa: ");
            //pule para a próxima linha
            String tipo = scanner.nextLine();

   // Solicita ao usuário para inserir o número de quilates da pedra preciosa
            System.out.print("Quilates da Pedra Preciosa: ");
            // Lê o valor de quilates da pedra preciosa a partir da entrada do usuário e armazena na variável 'quilates'
            double quilates = scanner.nextDouble();
            scanner.nextLine(); // Consumir o \n
            System.out.print("Cor da Pedra Preciosa: "); // printa a cor da pedra preciosa
            String cor = scanner.nextLine();

// Cria um novo objeto 'PedraPreciosa' com os valores inseridos pelo usuário
            PedraPreciosa pedraPreciosa = new PedraPreciosa(tipo, quilates, cor);
            // Adiciona o objeto 'PedraPreciosa' ao serviço de pedras preciosas
            pedraPreciosaService.adicionarPedra(pedraPreciosa);
            System.out.println("Pedra Preciosa adicionada com sucesso!"); //printa essa mensagem
        }

        private void listarPedrasPreciosas() {

            // Adiciona o objeto 'PedraPreciosa' ao serviço de pedras preciosas
            System.out.println("Pedras Preciosas:");

            // itera sobre a lista de pedras preciosas retornada pelo serviço de pedras preciosas
            for (PedraPreciosa pedraPreciosa : pedraPreciosaService.listarPedras()) {
                // Imprime cada pedra preciosa na lista
                System.out.println(pedraPreciosa);
            }
        }

    // Cria uma nova instância da classe InteracaoUsuario
        public static void main(String[] args) {

            // Chama o método iniciar() da instância app, que iniciará a interação com o usuário
            InteracaoUsuario app = new InteracaoUsuario();
            app.iniciar();
        }
    }

