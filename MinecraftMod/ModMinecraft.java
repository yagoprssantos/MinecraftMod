class ModMinecraft extends Minecraft {
    String nome;

    void ModificarJogo() {
        if (this.initialized && this.code) {
            NewGamemode newGamemode = new NewGamemode();
            newGamemode.BetterBuild();
        }
    }
}