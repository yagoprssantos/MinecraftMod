import java.util.Scanner;
//liga o minecraft e faz o menu
public class MinecraftLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Minecraft minecraft = new Minecraft();
        MinecraftForge forge = new MinecraftForge();
        ModMinecraft mod = new ModMinecraft();
        
        System.out.print("Deseja iniciar o Minecraft? (s/n): ");
        String jogar = scanner.nextLine();
        if (jogar.equalsIgnoreCase("s")) {
            minecraft.StartGame();
            System.out.print("Deseja jogar com mods? (s/n): ");
            modificar = scanner.nextLine();
            if (modificar.equalsIgnoreCase("s")) {
                forge.AcessCode(minecraft);
                mod.ModGame();
            } else {
                System.out.println("Jogo iniciado sem mods.");
            }
            minecraft.PlayGame();
        } else {
            System.out.println("Minecraft não iniciado.");
            return;
        }
        
    }
}