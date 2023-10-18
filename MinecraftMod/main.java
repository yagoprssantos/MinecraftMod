import java.util.Scanner;
//liga o minecraft e faz o menu
public class MinecraftLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Minecraft minecraft = new Minecraft();
        MinecraftForge forge = new MinecraftForge();
        ModMinecraft mod = new ModMinecraft();
        
        System.out.print("Deseja iniciar o Minecraft? (s/n): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            minecraft.IniciarJogo();
            System.out.println("Jogo iniciado!");
        } else {
            System.out.println("Minecraft não iniciado.");
            return;
        }

        System.out.print("Deseja jogar com mods? (s/n): ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            forge.LiberaCodigo(minecraft);
            System.out.println("Código liberado!");
            mod.ModificarJogo();
            System.out.println("Jogo modificado com sucesso!");
        } else {
            System.out.println("Jogo iniciado sem mods.");
        }
    }
}