# Laporan Praktikum #1 - Pengantar Konsep PBO

   ## Kompetensi

      Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:
      1. Perbedaan paradigma berorientasi objek dengan paradigma struktural
      2. Konsep dasar PBO

   ## Ringkasan Materi

      class adalah sebuah proyek yang tidak dapat di compire.
      main class adalah objek atau hasil jadi class yang dapat di compire dan terima hasilnya tanpa adanya mainclass,class tidak dapat berjalan/tidak dapat di compire.

## Percobaan

### Percobaan 1

      Didalam percobaan ini, kita akan mendemonstrasikan bagaimana membuat class, membuat object,
      kemudian mengakses method didalam class tersebut.
      1. Buka Netbeans, buat project SepedaDemo.
      2. Buat class Sepeda. Klik kanan pada package sepedademo – New – Java Class.
      3. Ketikkan kode class Sepeda dibawah ini.4. Kemudian pada class main, ketikkan kode berikut ini.
      5. Cocokkan hasilnya:

Screenshot Sepeda.java
![screenshot Sepeda.Java](img/Sepeda.png)
Screenshot Sepeda.java
![screenshot SepedaDemo.Java](img/SepedaDemo.png)
 link kode program : [ini link ke Sepeda.java](../../src/1_Pengantar_Konsep_PBO/Sepeda.java) link kode program : [ini link ke SepedaDemo.java](../../src/1_Pengantar_Konsep_PBO/SepedaDemo.java)

### Percobaan 2

      Didalam percobaan ini, akan didemonstrasikan salah satu fitur yang paling penting dalam PBO, yaitu
      inheritance. Disini kita akan membuat class SepedaGunung yang mana adalah turunan/warisan dari
      class Sepeda. Pada dasarnya class SepedaGunung adalah sama dengan class Sepeda, hanya saja pada
      sepeda gunung terdapat tipe suspensi. Untuk itu kita tidak perlu membuat class Sepeda Gunung dari
      nol, tapi kita wariskan saja class Sepeda ke class SepedaGunung.
      Penjelasan lebih detail tentang inheritance akan dibahas pada modul selanjutnya.
      1. Masih pada project SepedaDemo. Buat class SepedaGunung.
      2. Tambahkan kode extends Sepeda pada deklarasi class SepedaGunung. Kode extends ini
      menandakan bahwa class SepedaGunung mewarisi class Sepeda.
      3. Kemudian lengkapi kode SepedaGunung seperti berikut ini:
      4. Kemudian pada class main, tambahkan kode berikut ini:5. Cocokkan hasilnya:


Screenshot SepedaDemo.java Setelah Di tambah Extand Source Code SepedaGunung.java
![screenshot SepedaDemo.Java !!!](img/SepedaDemo2.png)
Screenshot SepedaGunung.java
![screenshot SepedaGunung.Java !!!](img/SepedaGunung.png)
 link kode program : [ini link ke SepedaGunung.java](../../src/1_Pengantar_Konsep_PBO/SepedaGunung.java)

## Pertanyaan

      1. Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek! 
      Jawab :
      Kelas     
      — kumpulan atas definisi data dan fungsi-fungsi dalam suatu unit untuk suatu tujuan tertentu.
      Objek    
       — membungkus data dan fungsi bersama menjadi suatu unit dalam sebuah program komputer; objek merupakan dasar dari                         modularitas dan struktur dalam sebuah program komputer berorientasi objek.
      Abstraksi 
      — Kemampuan sebuah program untuk melewati aspek informasi yang diproses olehnya, yaitu kemampuan untuk memfokus pada inti. 
    
      2. Apa yang dimaksud dengan object dan apa bedanya dengan class? 
      Jawab :
      Objek adalah hasil dari suatu rancangan/class yang dapat di compire
      class adalah suatu rancangan untuk menghasilkan sebuah objek yang tidak dapat di compire
   
      3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan
      dengan pemrograman struktural! 
      Jawab :
      — Meningkatkan produktivitas
      Class dan Object pada PBO yang dibuat untuk suatu problem masih dapat dipakai lagi untuk problem lainnya yang menggunakan objek tersebut (reusable).

      4. Pada class Sepeda, terdapat state/atribut apa saja? 
      Jawab :
      class,objek,attribute,atribute private,overloading methods
   
      5. Tambahkan atribut warna pada class Sepeda. 
      Jawab :
   
    
      6. Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari
      nol?
      Jawab:
      karena class SepedaGunung adalah extandsi attribute yang di pakai sebagai penambahan source code pada SepedaDemo untuk menambahkan hasil yang lebih mendetail.

## Tugas
      1. Buatlah program yang merupakan class dari objek yang ada dunia nyata sesuai dengan imajinasi
      anda. Silahkan merujuk pada kode program praktikum yang sudah kita lakukan sebelumnya
      untuk sintak-sintak nya.

Screenshot Kucing.java
![screenshot Kucing.java](img/Kucing.png)

Screenshot KucingBerjalan.java
![screenshot](img/KucingBerjalan.png)

Screenshot KucingBerjalan.java Setelah Di tambah Extand

Source Code KucingLari.java
![screenshot](img/KucingBerjalan2.png)

Screenshot KucingLari.java
![screenshot](img/KucingLari.png)

-link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/Kucing.java)

-link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/KucingBerjalan.java)

-link kode program : [ini link ke kode program](../../src/1_Pengantar_Konsep_PBO/KucingLari.java)

## Kesimpulan

      Dari percobaan diatas, kita telah mendemonstrasikan bagaimana paradigma pemrograman
      berorientasi objek dan mengimplementasikannya kedalam program sederhana. Kita juga telah
      mendemonstrasikan salah satu fitur paling penting dari PBO yaitu inheritance, yaitu dalam hal
      membuat class SepedaGunung.
      Kita ketahui bahwa SepedaGunung pada dasarnya adalah sama dengan Sepeda (memiliki gear,
      memiliki kecepatan, dapat menambah kecepatan, dapat mengerem, pindah gigi, dsb) namun ada
      fitur tambahan yaitu tipe suspensi. Maka kita tidak perlu membuat class SepedaGunung dari nol,
      kita extends atau wariskan saja dari class Sepeda, kemudian kita tinggal tambahkan fitur yang
      sebelumnya belum ada di class Sepeda. Inilah salah satu kelebihan PBO yang tidak ada di
      pemrograman struktural.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Angga Rahmat Adriyadhi)***
