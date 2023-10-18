class ModMinecraft extends Minecraft {
    String nome;
    MinecraftForge forge;

    void ModGame() {
        if (this.initialized && this.code && this.version == forge.version) {
            NewGamemode newGamemode = new NewGamemode();
            newGamemode.BetterBuild();
        }
    }
}