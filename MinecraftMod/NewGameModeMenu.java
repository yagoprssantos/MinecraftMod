import java.util.Scanner;

// Apresenta as possiveis interações com as features
class NewGamemodeMenu {
    int nameMode;
    String gamemodeName;

    void CreateMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu de ferramentas:");
            System.out.println("1. SimetricPlaceBlock");
            System.out.println("2. InventoryBuild");
            System.out.println("3. PlacingDelay");
            System.out.println("4. PaintingTool");
            System.out.println("5. MultiPlacing");
            System.out.println("6. LimitingGrid");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                SimetricPlaceBlock simetricPlaceBlock = new SimetricPlaceBlock();
                simetricPlaceBlock.PlaceBlock();
            } else if (opcao == 2) {
                InventoryBuild inventoryBuild = new InventoryBuild();
                inventoryBuild.Build();
            } else if (opcao == 3) {
                PlacingDelay placingDelay = new PlacingDelay();
                placingDelay.Delay();
            } else if (opcao == 4) {
                PaintingTool paintingTool = new PaintingTool();
                paintingTool.Paint();
            } else if (opcao == 5) {
                MultiPlacing multiPlacing = new MultiPlacing();
                multiPlacing.PlacingBlocks();
            } else if (opcao == 6) {
                LimitingGrid limitingGrid = new LimitingGrid();
                limitingGrid.LimitBlocks();
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}