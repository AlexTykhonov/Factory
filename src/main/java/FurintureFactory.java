public class FurintureFactory {

    public FurnitureBuild getFurniture(FurnitureTypes type) {
        FurnitureBuild toReturn=null;
        switch (type)
        {
            case chair:
                toReturn = new ChairWorkshop();
                break;
            case bed:
                toReturn = new BedWorkshop();
                break;
            case table:
                toReturn = new TableWorkshop();
                break;
            default:
                throw new IllegalArgumentException("Wrong furniture type:" + type);
        }
        return toReturn;

    }
}
