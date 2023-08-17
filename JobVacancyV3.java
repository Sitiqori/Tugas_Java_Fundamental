import java.util.Scanner;

public class JobVacancyV3 {
    public static void main(String[] args) {
        //Deklarasi variable yang diperlukan.
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean reqKoorl,reqKoor2,reqAdminl,reqAdmin2,reqAdmin3, reqSpv1,reqSpv2;
        boolean isPassing;

        Scanner input = new Scanner (System.in);

        System.out.println("Selamat datang di PT. Secret Semut 79");
        System.out.println("====================================\n");

        System.out.println("Silahkan input Data Anda: \n");

        System.out.println("Nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita):") ;
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman (Tahun) : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1 s.d 10) : ");
        penampilan = input.nextInt();

        System.out.println("Posisi yang Dilamar (SPV, Admin, atau Koodinator) : ");
        posisi = input.next();

        //Kondisi if untuk membentuk Posisi yg dipilih
        if(posisi.equalsIgnoreCase("Koodinator")){
            // pemanggilan dan penggunaan function utk validasi koor
            isPassing = validateKoordinator(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }else if(posisi.equalsIgnoreCase("Admin")){
            // pemanggilan dan penggunaan function utk validasi admin
            isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }else if(posisi.equalsIgnoreCase("Spv")){
            // pemanggilan dan penggunaan function utk validasi Spv
            isPassing = validateSPV(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }else{
            //Hasil ketika posisi yg dimasuka tdk sesuai atau tidak ada
            isPassing = false;
        }
        
        //membuat kondisi if utk menentukn hasil output text
        if(isPassing){
            hasil = "Selamat," + nama + ".\nAnda memenuhi syarat sebagai" + posisi + ". Dan akan masuk ke Tahap  Selanjutnya.";
        }else{
            hasil = "Maaf," + nama + ".\nAnda Tidak memenuhi syarat sebagai" + posisi + ". Dan tidak akan masuk ke Tahap  Selanjutnya.";
        }

        printResult(nama, hasil, posisi);

    }

    //  membuat function untuk validasi posisi Koordinator
    // method return value berupa boolean
    public static boolean validateKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqKoor1, reqKoor2, result;

        //membuat kondisi setiap kriteria koordinator
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >=2;
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;

        //kodisi if untuk menentukan hasil kelulusan posisi Koordinator 
        if(reqKoor1 || reqKoor2){
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    //  membuat function untuk validasi posisi Admin
    // method return value berupa boolean
    public static boolean validateAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqAdmin1, reqAdmin2, reqAdmin3, result;
        //membuat kondisi setiap kriteria Admin
        reqAdmin1  = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3")  && ( penampilan >= 8.5 || pengalaman >=1);
        reqAdmin2  = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 &&  lulusan.equalsIgnoreCase("S1") &&  penampilan >= 8.5 && pengalaman >=3;
        reqAdmin3  = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >=2;

        //kodisi if untuk menentukan hasil kelulusan posisi Koordinator 
        if(reqAdmin1 || reqAdmin2 || reqAdmin3) {
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    //  membuat function untuk validasi posisi SPV
    // method return value berupa boolean
    public static boolean validateSPV(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqSpv1, reqSpv2, result;

        //membuat kondisi setiap kriteria SPV
        reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
        reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;

        //kodisi if untuk menentukan hasil kelulusan posisi Koordinator 
        if(reqSpv1 || reqSpv2){
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    //membuat function utk menampilkan hasul rekruitmen
    //method atau function berupa VOID

    public static void printResult(String nama, String hasil, String posisi){
        System.out.println();
        System.out.println(nama + ", Terimakasih sudah mengikuti lowongan kerja");
        System.out.println("Berikut adalah hasil dari rekruitmen utk posisi" + posisi + ":");
        System.out.println(hasil);
    }

}