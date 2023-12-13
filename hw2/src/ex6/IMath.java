package ex6;

public interface IMath {
    public default int Max(){
        return 0;
    }
    public default int Min(){
        return 0;
    }
    public default int Avg(){
        return 0;
    }
}
