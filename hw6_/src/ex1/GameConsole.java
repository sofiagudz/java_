package ex1;

import java.io.Console;
import java.util.Comparator;

public class GameConsole implements Powered{
    public Brand brand;
    public String consoleSerial;
    public String model;
    public Gamepad firstGamepad;
    public Gamepad secondGamepad;
    public boolean isOn;
    public Game activeGame;
    public int waitingCounter;
    class Gamepad{
         public Brand brand;
         public String consoleSerial;
         public int connectedNumber;
         public GamepadColor color = GamepadColor.black;
         public double chargeLevel = 100.0;
         public boolean isOn;

        public Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = GameConsole.this.consoleSerial;
        }
    }
    public void loadGame(Game game){
        System.out.println("Игра "+game.name+" загружается.");
    }
    private int i = 0;
    public void playGame(){
        checkStatus(i);
        i++;
        System.out.println("Игра в "+this.activeGame);
        if(this.firstGamepad.isOn && this.firstGamepad.chargeLevel > 0){
            System.out.println("First gamepad:\nCharge level - "+this.firstGamepad.chargeLevel);
            this.firstGamepad.chargeLevel -= 10;
        }
        if(this.secondGamepad.isOn && this.secondGamepad.chargeLevel > 0){
            System.out.println("\nSecond gamepad:\nCharge level - "+this.secondGamepad.chargeLevel);
            this.secondGamepad.chargeLevel -= 10;
        }
        if(this.firstGamepad.chargeLevel==0){
            this.firstGamepad.isOn = false;
        }
        if(this.secondGamepad.chargeLevel==0){
            this.secondGamepad.isOn = false;
        }
    }
    private void checkStatus(int t){
        if(t >= 5){
            System.out.println("Приставка завершает работу из-за отсутствия активности.");
            this.i = 0;
        }
        if(!this.firstGamepad.isOn && !this.secondGamepad.isOn){
            System.out.println("Подключите джойстик");
            this.waitingCounter += 1;
        }
        else if(this.firstGamepad.isOn || this.secondGamepad.isOn){
            this.waitingCounter = 0;
        }
    }
    public void consoleOn(Gamepad gamepad){
        if(gamepad.isOn){
            this.isOn = true;
        }
    }
    public void gamepadSecondToFirst(){
        if(this.firstGamepad.isOn){
            this.firstGamepad = this.secondGamepad;
        }
    }
    @Override
    public void powerOn() {
        this.isOn = true;
    }

    @Override
    public void powerOff() {
        this.isOn = false;
    }

    public GameConsole(Brand brand, String consoleSerial) {
        this.brand = brand;
        this.consoleSerial = consoleSerial;
        this.firstGamepad = new Gamepad(brand, 1);
        this.secondGamepad = new Gamepad(brand, 2);
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "brand=" + brand +
                ", consoleSerial='" + consoleSerial + '\'' +
                ", model='" + model + '\'' +
                ", firstGamepad=" + firstGamepad +
                ", secondGamepad=" + secondGamepad +
                ", isOn=" + isOn +
                '}'+ "\nfirstGamepad{" +
                "connectedNumber=" + firstGamepad.connectedNumber +
                ", color=" + firstGamepad.color +
                ", chargeLevel=" + firstGamepad.chargeLevel +
                '}' + "\nsecondGamepad{" +
                "connectedNumber=" + secondGamepad.connectedNumber +
                ", color=" + secondGamepad.color +
                ", chargeLevel=" + secondGamepad.chargeLevel +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public String getConsoleSerial() {
        return consoleSerial;
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setConsoleSerial(String consoleSerial) {
        this.consoleSerial = consoleSerial;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    public static class Game{
        public final String name;
        public final Genre genre;
        public final Type type;
        public enum Genre{
            ACTION,
            SRORT,
            RACE,
            RPG,
            FPS,
            TPS,
            Strategies
        }
        public enum Type{
            VIRTUAL,
            PHYSICAL
        }

        private Game(String name, Genre genre, Type type) {
//            this.name = "Hogwarts Legacy";
//            this.genre = Genre.RPG;
//            this.type = Type.VIRTUAL;
            this.name = name;
            this.genre = genre;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public Genre getGenre() {
            return genre;
        }

        public Type getType() {
            return type;
        }
        public static class GameDisk{
            public String description;
            public final Game data;

            public GameDisk(String name, Genre genre, String description) {
                this.description = description;
                this.data = new Game(name, genre, Type.PHYSICAL);
            }

            public String getDescription() {
                return description;
            }

            public Game getData() {
                return data;
            }
        }
        public class VirtualComp implements Comparator<VirtualGame>{
            @Override
            public int compare(VirtualGame o1, VirtualGame o2) {
                return Integer.compare(o1.getRating(), o2.getRating());
            }
        }
        public static class VirtualGame{
            public int rating;
            public final Game data;

            private VirtualGame(String name, Genre genre) {
                this.data = new Game(name, genre, Type.VIRTUAL);
            }

            public int getRating() {
                return rating;
            }

            public Game getData() {
                return data;
            }
            public void setRating(int rating) {
                if(rating >= 0 && rating <= 5){
                    this.rating = rating;
                }
            }
        }
        public static GameDisk getDisk(String name, Genre genre, String description){
            GameDisk gameDisk = new GameDisk(name, genre, description);
            return gameDisk;
        }
        public static VirtualGame getVirtualGame(String name, Genre genre){
            VirtualGame virtualGame = new VirtualGame(name, genre);
            return virtualGame;
        }
    }
    public class PlayRoom{
        public void main(){
            Game.GameDisk[] arrayDisk = new Game.GameDisk[4];
            arrayDisk[0] = Game.getDisk("Call of Duty: Black Ops Cold War", Game.Genre.FPS, "The sequel to Call of Duty: Black Ops, called Black Ops Cold War, takes place in the early \n" +
                        "1980s - during one of the tense periods of the Cold War. In an immersive single-player campaign of epic proportions, players will encounter historical \n" +
                        "figures and learn hard truths as they battle through iconic locations such as East Berlin, Vietnam, Turkey, and even the KGB headquarters at Lubyanka.");
            arrayDisk[1] = Game.getDisk("Call of Duty: Modern Warfare", Game.Genre.FPS, "Modern Warfare is an updated version of one of the most successful games in the Call of Duty series. \n" +
                    "Players will experience a single-player campaign with an exciting storyline, showing a modern conflict where the balance of power in the world is at stake.");
            arrayDisk[2] = Game.getDisk("Dead Space", Game.Genre.TPS, "Dead Space, the classic sci-fi survival-horror game, returns with a completely remastered version to offer \n" +
                    "a more immersive experience. This remake delivers stunning visual fidelity, intense atmospheric sound, and improved gameplay while staying true to the original game's fun concept.");
            arrayDisk[3] = Game.getDisk("Age of Empires II: Definitive Edition ", Game.Genre.Strategies, "OS: Windows 10 64bit Processor: 2.4 Ghz i5 or greater or AMD equivalent Memory: 8 GB RAM Graphics: Nvidia \n" +
                    "GTX 650 or AMD HD 5850 or better DirectX: Version 11Network: Broadband Internet connectionStorage: 15 GB available space");

            Game.VirtualGame[] arrayVirtualGame = new Game.VirtualGame[4];
            arrayVirtualGame[0] = Game.getVirtualGame("EA SPORTS FC 24", Game.Genre.SRORT);
            arrayVirtualGame[1] = Game.getVirtualGame("Grand Theft Auto V (GTA 5)", Game.Genre.ACTION);
            arrayVirtualGame[2] = Game.getVirtualGame("FIFA 23", Game.Genre.SRORT);
            arrayVirtualGame[3] = Game.getVirtualGame("Mortal Kombat XL", Game.Genre.ACTION);

//            Comparator virtualComp = new Game.VirtualComp();

//            arrayDisk.sort(Comparator.comparing(o -> o.getData().getGenre()));
//            arrayVirtualGame.sort(Comparator.comparingInt(GameConsole.Game.VirtualGame::getRating));


        };
    }
}
