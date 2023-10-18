class NewGamemode {
    int gamemode;
    String gamemodeName;
  // Cada modo tem suas especificações, o mod se baseia na criação de um novo modo jogo que adiciona as features

    void BetterBuild(Minecraft minecraft) {
        // Se o gamemode estiver ligado, o  NewGamemodeMenu e o RemovePlaceBlockLimit serão ligados
        if (minecraft.initialized) {
            minecraft.gamemodes.put(4, "BetterBuild");
            
        }
    }
}