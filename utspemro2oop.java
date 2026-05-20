
import javax.print.attribute.standard.JobImpressionsCompleted;

// membuat abstract class parent
abstract class Kendaraan {

    //membuat encapsulasi atribut data kendaraan yang di privat atau di kunci agar tidak bisa di akses dari luar
    private String nama;
    private int hargaSewa;
    private int unit;


    // membuat konstruktor untuk mengisi data awal kendaraan atau object
    public Kendaraan(String nama, int hargaSewa, int unit) {

        //this.nama : untuk mengisi data atribut atau object
        //nama kiri : atribut class
        //nama kanan : parameter konstruktor
        this.nama = nama;
        this.hargaSewa = hargaSewa;
        this.unit = unit;
        
    }

    // membuat getter untuk ambil data privat
    public String getNama() {
        // return untuk mengembalikan nilai nama supaya bisa di pakai di luar class
        return nama;
    }
    public int getHargaSewa() {
        return hargaSewa;
    }
    public int getUnit() {
        return unit;
    }

    //menggunakan method tampilinfo untuk menampilkan informasi kendaraan
    public void tampilInfo () {
    
    //System out print untuk menampilkan output
    System.out.println("Kendaraan");
    System.out.println("Nama : " + nama);
    System.out.println("HargaSewa : " + hargaSewa);
    System.out.println("Unit : " + unit);
    }

    //membuat abstract method untuk anak karena biaya yang berbeda
    public abstract int hitungBiaya(int hari);

    //membuat method untuk penyewaan kendaraan
    public void sewa(int hari){
    }
}

//membuat inheritance atau extends karena mobil anaknya kendaraan
class Mobil extends Kendaraan {
    //atributnya mobil
    private int kursi;
    //membuat konstruktornya mobil
    public Mobil(String nama, int hargaSewa, int unit, int kursi) {
    //super buat manggil konstruktornya parent
    super(nama, hargaSewa, unit);
    //buat mengisi atribut kursi mobil
    this.kursi = kursi;
    }


//override buat kasih tau kalau methodnya parent di ganti versi mobil
@Override
public int hitungBiaya(int hari) {
//menghitung biaya dasar dan getHargaSewa buat ambil harga dari parent
int total = getHargaSewa() * hari; {
}

//membuat inheritance atau extends karena motor anaknya kendaraan
class Motor extends Kendaraan {
    //atributnya motor
    private String jenis;
    //membuat konstruktor motor
    public Motor(String nama, int hargaSewa, int unit, String jenis) {
    //super buat panggil konstruktornya parent
    super(nama, hargaSewa, unit);
    //buat mengisi atribut jenis motor
    this.jenis = jenis;
    
}

@Override
public int hitungBiaya(int hsri) {
int total = getHargaSewa() * hari; {
}
}
}


//penjelasan 
//penerapan 4 pilar oop pada rancangan program Saya yaitu membuat enkapsulasi data privat dengan class parent abstract.
//kemudian membuat inheritance atau extends pada class motor dan mobil.
//lalu penerapan polymorphism saya yang belum tuntas yaitu hitungBiaya.


