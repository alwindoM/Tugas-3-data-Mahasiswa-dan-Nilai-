import java.util.Scanner;

package tugas3;

public class Tugas3 
    {
        public static void main(String[]args) 
        {
            //Mmebuat string variable dan double
            String nim,nama,kelamin,matkul,keterangannilai,tanggal;
            double absen,tugas,uts,uas,nilaiakhir;

            //Membuat input untuk user
            Scanner masuk = new Scanner(System.in);

            //Meminta input untuk data
            System.out.print("Masukan NIM :");
            nim      = masuk.nextLine();

            System.out.print("Masukkan Namamu : ");
            nama     = masuk.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            kelamin  = masuk.nextLine();

            System.out.print("Masukkan Tanggal input nilai (dd-mm-yy): ");
            tanggal  = masuk.nextLine();

            System.out.print("Nama mata kuliah : ");
            matkul  = masuk.nextLine();

            System.out.print("Nilai Absensi (0-100) : ");
            absen   = masuk.nextDouble();

            System.out.print("Masukkan total nlai tugasmu(0-100): ");
            tugas   = masuk.nextDouble();

            System.out.print("Masukkan nilai UTS(0-100): ");
            uts     = masuk.nextDouble();

            System.out.print("Masukkan nilai UAS(0-100): ");
            uas     = masuk.nextDouble();

            //Contoh tiap nilai :(Absensi 10%) (Tugas:20%)(UTS:30%)(UAS:40%)
            nilaiakhir =(absen*0.1) + (tugas*0.1)+(uts*0.4)+(uas*0.5);

            //Menentukan grade berdasarkan nilai akhir mahasiswa
            String grade;
            if (nilaiakhir>= 80 && nilaiakhir < 100)
            {
                grade=  "A";
            }
            else if (nilaiakhir >= 77 && nilaiakhir < 80) 
            {
                grade = "A-";
            }
            else if(nilaiakhir>= 74 && nilaiakhir < 77)
            {
                grade ="B+";
            }
            else if(nilaiakhir>= 71 && nilaiakhir < 74)
            {
                grade ="B";
            }
            else if(nilaiakhir >= 68 && nilaiakhir <71)
            {
                grade ="B-";
            }
            else if(nilaiakhir >= 64 && nilaiakhir <68)
            {
                grade="C+";
            }
            else if(nilaiakhir >= 60 && nilaiakhir <64)
            {
                grade ="C";
            }
            else if(nilaiakhir >= 50 && nilaiakhir <60)
            {
                grade ="D";
            }
            else
            {
                grade ="E";
            }

            if(nilaiakhir >= 60)
            {
                keterangannilai = "Lulus";
            }
            else
            {
                keterangannilai = "Tidak lulus";
            }

            //Output Hasil data dan Nilai
            System.out.println("NIM                 : " +nim);
            System.out.println("Nama Mahasiswa      : " +nama);
            System.out.println("Jenis Kelamin       : " +kelamin);
            System.out.println("Tanggal input nilai : " +tanggal);
            System.out.println("Nama matakuliah     : " +matkul);
            System.out.println("Nilai Keseluruhan   : " +nilaiakhir);
            System.out.println("Grade               : " +grade);
            System.out.println("Keterangan  Nilai   : " +keterangannilai);
        }

    }
