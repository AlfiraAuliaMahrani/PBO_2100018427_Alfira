public class Main {
    public static void main(String[] args) {
        int menu=0,z=0,a,cari;
        Barang[] data=new Barang[1024];
        data[z]=new Barang();
        data[z].setId();

        System.out.println("\t\t\t+++++PERGUDANGAN+++++\t\t\t");
        while(menu!=6){
            System.out.print("Menu...\n1.Input\t\t2.View\n3.Search\t4.Update\n5.Delete\t6.Exit\n : ");
            menu=data[0].in.nextInt();
            if(menu==1){
                z++;
                data[z]=new Barang();
                data[z].setId(data[z-1].getId());
                data[z].setData();
            }else if(menu==2){
                if(z<1)
                    System.out.println("Data Kosong");
                else{
                    a=0;
                    while(a<z){
                        a++;
                        System.out.println("---"+a+"---");
                        data[a].tampil();
                    }
                }
            }else if(menu==3 || menu==4 || menu==5){
                System.out.print("masukkan id barang : ");
                cari=data[0].in.nextInt();
                a=1;
                while(a<=z){
                    if(data[a].getId()==cari)
                        break;
                    a++;
                }
                if(a<=z){
                    if(menu==3)
                        data[a].tampil();
                    else if(menu==4){
                        data[a].tampil();
                        data[a].setData();
                    }
                    else{
                        while(a<z){
                            data[a]=data[a+1];
                            a++;
                        }
                        z--;
                        System.out.println("data "+cari+" berhasil dihapus");
                    }
                }
                else
                    System.out.println("data tidak ditemukan");
            }else
            if(menu==6) {
                boolean Lulus = true;
                System.out.println("keluar...");
            }else {
                boolean Lulus = false;
                System.out.println("menu ilegal");
            }
        }

    }
}