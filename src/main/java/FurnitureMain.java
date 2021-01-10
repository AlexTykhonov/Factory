public class FurnitureMain {
    public static void main(String[] args) {
        FurintureFactory factory = new FurintureFactory();

        FurnitureBuild table = factory.getFurniture(FurnitureTypes.table);
        FurnitureBuild chair = factory.getFurniture(FurnitureTypes.chair);
        FurnitureBuild bed = factory.getFurniture(FurnitureTypes.bed);


        table.createFurniture();
        chair.createFurniture();
        bed.createFurniture();
    }
}
