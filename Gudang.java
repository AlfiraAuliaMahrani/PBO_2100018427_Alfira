import java.util.Scanner;
public abstract class Gudang implements Pergudangan{
    @Override
    public abstract void setData();
    @Override
    public abstract void tampil();
    public final Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);


}
