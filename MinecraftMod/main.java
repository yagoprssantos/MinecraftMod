public class MinecraftLauncher {
    public static void main(String[] args) {
        Minecraft minecraft = new Minecraft();
        minecraft.IniciarJogo();

        MinecraftForge forge = new MinecraftForge();
        forge.LiberaCodigo();

        minecraft.modifyGame();
    }
}