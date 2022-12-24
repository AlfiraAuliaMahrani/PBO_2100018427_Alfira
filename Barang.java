import java.io.FileWriter;

public class Barang extends Gudang {


    int idBarang,harga,jumlah,total;
    String nama;
    @Override
    public void setData(){
        System.out.print("Masukkan Nama Barang  : ");
        this.nama=str.nextLine();
        System.out.print("Masukkan Harga Barang : ");
        this.harga=in.nextInt();
        System.out.print("Masukkan Jumlah Barang: ");
        this.jumlah=in.nextInt();
        this.total=this.harga*this.jumlah;
    }
    @Override
    public void tampil(){

        try {
            System.out.println("\t\t+++++MENCETAK STRUK+++++\t\t");
            System.out.println("Id Barang    : " + this.idBarang);
            System.out.println("Nama Barang  : " + this.nama);
            System.out.println("Harga Barang : " + this.harga);
            System.out.println("Jumlah Barang: " + this.jumlah);
            System.out.println("Total        : " + this.total);

            FileWriter f = new FileWriter("cetak.txt");
            f.write("\t\t+++++MENCETAK STRUK+++++\t\t");
            f.write("\nId Barang     : " + this.idBarang);
            f.write("\nNama Barang   : " + this.nama);
            f.write("\nHarga Barang  : " + this.harga);
            f.write("\nJumlah Barang : " + this.jumlah);
            f.write("\nTotal         : " + this.total);
            f.close();


        }catch (Exception e){
            System.out.println("Data tidak ada");
        }
        finally {
            System.out.println("Struk telah di cetak");
        }

    }
    @Override
    public int getId(){
        return this.idBarang;
    }
    @Override
    public void setId(){

        this.idBarang=153400;
    }
    @Override
    public void setId(int id){

        this.idBarang=id+1;
    }

}
