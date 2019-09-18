 Laporan Praktikum #2 - Class dan Objek

## Kompetensi

    •	Mahasiswa dapat memahami deskripsi dari class dan object
    •	Mahasiswa memahami implementasi dari class
    •	Mahasiswa dapat memahami implementasi dari attribute 
    •	Mahasiswa dapat memahami implementasi dari method
    •	Mahasiswa dapat memahami implementasi dari proses   instansiasi
    •	Mahasiswa dapat memahami implementasi dari try-catch 
    •	Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML 


## Ringkasan Materi

    Secara singkat class
    adalah abstraksi dari sebuah object (nyata ataupun tdk nyata) (roger s pressman).
    Apabila kita ingin membuat class mahasiswa, maka kita perlu melakukan abstraksi
    (mengindikasi bagian – bagian penting yang merepresentasikan benda itu sendiri)
    dari object mahasiswa itu sendiri. Contoh salah satu attribute yang mengidentifikasi
    jika seseorang itu mahasiswa adalah Nim (Nomor Induk Mahasiswa), dan Nim tidak
    akan anda temui pada attribute dosen. 

## Percobaan

### Percobaan 1
### Membuat Class Diagram

    Studi Kasus 1:
    Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap
    karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa
    juga bisa menampilkan data diri pribadi dan melihat gajinya.
    1. Gambarkan desain class diagram dari studi kasus 1!,
    2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!,
    3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing
    class dari studi kasus 1!
    4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi
    kasus 1!


Screenshot DataGame.java
![screenshot DataGame.Java](img/DataGame.png)<br>
Screenshot DataSewa.java
![screenshot DataSewa.Java](img/DataSewa.png)

link kode program : [ini link ke DataGame.java](../../src/2_Class_Dan_Objek/DataGame1941723001Angga.java)<br>
link kode program : [ini link ke SepedaDemo.java](../../src/2_Class_Dan_Objek/DataSewa1941723001Angga.java)

### Percobaan 2
### Membuat dan mengakses anggota suatu class

    Studi Kasus 2:
    Perhatikan class diagram dibawah ini. Buatlah program berdasarkan class diagram
    tersebut!Langkah kerja:
    1. Bukalah text editor atau IDE, misalnya Notepad ++ / netbeans.
    2. Ketikkan kode program berikut ini:
    3. Simpan dengan nama file Mahasiswa.java.
    4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance
    dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggotaanggota dari class Mahasiswa dengan membuka file baru kemudian ketikkan kode
    program berikut:5. Simpan file dengan TestMahasiswa.java
    6. Jalankan class TestMahasiswa
    7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
    8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
    9. Berapa banyak objek yang di instansiasi pada program diatas!
    10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?
    11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?
    12. Instansiasi 2 objek lagi pada program diatas!


Screenshot KelilingLingkaran.java Setelah Di tambah Extand Source Code SepedaGunung.java
![screenshot KelilingLingkaran.Java !!!](img/KelilingLingkaran.png)<br>
Screenshot SepedaGunung.java
![screenshot SebuahLingkaran.Java !!!](img/SebuahLingkaran.png)

link kode program : [ini link ke SepedaGunung.java](../../src/2_Class_Dan_Objek/KelilingLingkaran1941723001Angga.java)<br>
link kode program : [ini link ke SepedaGunung.java](../../src/2_Class_Dan_Objek/SebuahLingkaran1941723001Angga.java)

## Tugas
    1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana
    data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama
    member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa
    menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class
    diagram pada studi kasus diatas!
    Penjelasan:
     Harga yang harus dibayar diperoleh dari lama sewa x harga.
     Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.
    2. Buatlah program dari class diagram yang sudah anda buat di no 1!
    3. Buatlah program sesuai dengan class diagram berikut ini:
    4. Buatlah program sesuai dengan class diagram berikut ini:
    Deskripsi / Penjelasan :

     Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam %
     Method hitungHargaJual() digunakan untuk menghitung harga jual dengan
    perhitungan berikut ini:

    harga jual = harga dasar – (diskon x harga dasar) Method tampilData() digunakan untuk menampilkan nilai dari kode, namaBarang,
    hargaDasar, diskon dan harga jual.


Screenshot Promo.java
![screenshot Kucing.java](img/Promo.png)<br>
Screenshot Persenanpromo.java
! screenshot](img/Persenanpromo.png)<br>

 link kode program : [ini link ke kode program](../../src/2_class_dan_objek/Promo1941723001Angga.java)<br> link kode program : [ini link ke kode program](../../src/2_class_dan_objek/Persenanpromo1941723001Angga.java)

## Kesimpulan

Setelah kita memahami secara semantic pengertian dari class dan object, maka
langkah selanjutnya adalah bagaimana cara melakukan implementasi class pada
pendekatan Object Oriented Programming, terutama pada bahasa pemrograman java.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Angga Rahmat Adriyadhi)***