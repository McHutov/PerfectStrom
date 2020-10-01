package Module2.lesson7;

public class Main {
    public static void main(String[] args) {
        Storage[] storages = new Storage[]{
                new Garage(), new MiniGarage(), new BigGarage()
        };

        storages[0].enter(new KamazA3());
        storages[0].leave();
        storages[1].enter(new Porche911());
        storages[1].leave();
        storages[2].enter(new Volgabus());
        storages[2].enter(new KamazA3());
        storages[2].leave();

    }
}
