// Esta classe representa o jogo Minecraft
class Minecraft {
  float versao;
  bool inicialized = false;

  // Esta função simboliza a ideia de iniciar o jogo, o que permite que o jogador interaja com o jogo
  void IniciarJogo() {
      if inicialized {
          system.out.println("Jogo já iniciado");
      } else {
          inicialized = true;
          system.out.println("Jogo iniciado")
      }
  }

  // Esta função simboliza a ideia do jogo estar rodando e sendo possível jogá-lo, o que permite que o jogador interaja com o jogo
  void MecanicasJogo() {
      if inicialized {
          system.out.println("Mecânicas do jogo funcionando, jogo rodando");
      } else {
          system.out.println("Jogo não iniciado");
      }
  }

  // Esta função simboliza a ideia de desligar o jogo, o que impede que o jogador interaja com o jogo
  void DesligarJogo() {
      if inicialized {
          inicialized = false;
          system.out.println("Jogo desligado");
      } else {
          system.out.println("Jogo já desligado");
      }
  }
}