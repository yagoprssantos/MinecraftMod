//muitas classes apresentam o sistema de  desligar e desligar então fiz uma classe para que as outras possam herdar
class ActivationMode {
  String interruptor; // (on, off)

  void liga() {
      interruptor = true
  }

  void desliga() {
      interruptor = false
  }
}