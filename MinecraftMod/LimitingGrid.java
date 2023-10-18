import java.util.Scanner;
// Grades são definidas pelo próprio jogador, que servem como limitadores para colocar blocos
class LimitingGrid {
    int GridX;
    int GridY;
    int GridZ;

    // Faz com que a grade sirva como um limitador para colocar blocos no eixo X
    void ActivateX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de GridX: ");
        GridX = scanner.nextInt();
    }

    // Faz com que a grade sirva como um limitador para colocar blocos no eixo Y
    void ActivateY() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de GridY: ");
        GridY = scanner.nextInt();
    }

    // Faz com que a grade sirva como um limitador para colocar blocos no eixo Z
    void ActivateZ() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de GridZ: ");
        GridZ = scanner.nextInt();
    }
    
    // Faz com que a grade sirva como um limitador para colocar blocos
    void LimitBlocks() {
        Scanner scanner = new Scanner(System.in);
        ActivateX();
        ActivateY();
        ActivateZ();
        System.out.println("Coloque blocos dentro da nova grade criada:");
        for (int x = 0; x < GridX; x++) {
            for (int y = 0; y < GridY; y++) {
                for (int z = 0; z < GridZ; z++) {
                    System.out.printf("Coloque um bloco na posição (%d, %d, %d): ", x, y, z);
                    int block = scanner.nextInt();
                    if (block != 0) {
                        System.out.println("Você só pode colocar blocos dentro da nova grade criada!");
                        return;
                    }
                }
            }
        }
        System.out.println("Todos os blocos foram colocados dentro da nova grade criada!");
    }
}