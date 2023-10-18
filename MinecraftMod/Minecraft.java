import java.util.HashMap;
import java.util.Scanner;

// Esta classe representa o jogo Minecraft
class Minecraft {
    float version;
    boolean initialized = false;
    boolean code = false; //Significa que o código está bloqueado
    boolean blocklimit = false;
    HashMap<Integer, String> gamemodes = new HashMap<>();
//representa os modos de jogo presentes no minecraft
    Minecraft() {
        gamemodes.put(0, "Survival");
        gamemodes.put(1, "Creative");
        gamemodes.put(2, "Spectator");
        gamemodes.put(3, "Adventure");
    }

    // Esta função simboliza a ideia de iniciar o jogo, o que permite que o jogador interaja com o jogo
    void StartGame() {
        if (initialized) {
            System.out.println("Jogo já iniciado");
        } else {
            initialized = true;
            System.out.println("Jogo iniciado");
        }
    }

    // Esta função simboliza a ideia do jogo estar rodando e sendo possível jogá-lo, o que permite que o jogador interaja com o jogo
    void PlayGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu de gamemodes:");
            for (int i = 1; i <= gamemodes.size(); i++) {
                System.out.printf("%d. %s\n", i, gamemodes.get(i));
            }
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            } else if (gamemodes.containsKey(opcao)) {
                String gamemode = gamemodes.get(opcao);
                System.out.printf("Jogando no gamemode %s...\n", gamemode);
                // Implementação para jogar no gamemode escolhido
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    // Esta função simboliza a ideia de desligar o jogo, o que impede que o jogador interaja com o jogo
    void StopGame() {
        if (initialized) {
            System.out.println("Jogo desligado");
            initialized = false;
        } else {
            System.out.println("Jogo já desligado");
        }
    }
}