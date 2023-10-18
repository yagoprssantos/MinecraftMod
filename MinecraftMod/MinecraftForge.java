class MinecraftForge {
  float version;
  // O codigo minecraft em false significa que não é possivel acessar o codigo do jogo, em true que é possivel.
  void AcessCode(Minecraft minecraft) {
    minecraft.code = true
    System.out.println("Codigo liberado");
  }
}