public class barang extends gudang{
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
        System.out.println("Id Barang    : "+this.idBarang);
        System.out.println("Nama Barang  : "+this.nama);
        System.out.println("Harga Barang : "+this.harga);
        System.out.println("Jumlah Barang: "+this.jumlah);
        System.out.println("Total        : "+this.total);
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
