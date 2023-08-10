import java.util.Scanner;

public class JobVacancyV2 {
	public static void main(String[] args) {
	//Deklarasi variable yang diperlukan.
	int umur, pengalaman;
	double penampilan;
	String lulusan, nama, jeniskelamin, posisi, hasil; 
	boolean reqKoorl,reqKoor2,reqAdminl,reqAdmin2,reqAdmin3, reqSpv1,reqSpv2;
	
	Scanner input = new Scanner (System.in); 

    System.out.println("Selamat datang di PT. Secret Semut 79"); 
		System.out.println("====================================\n");

		System.out.println("Silahkan input Data Anda: \n");
		
		System.out.println("Nama : ");
		nama = input.next();

        System.out.println("Umur : "); 
		umur = input.nextInt();
		
		System.out.println("Jenis Kelamin (Pria/Wanita):") ; 
		jeniskelamin = input.next();
		
		System.out.println("Lulusan (SMK/D3/S1) : ");
		lulusan = input.next();
		
		System.out.println("Pengalaman (Tahun) : "); 
		pengalaman = input.nextInt(); 
		
		System.out.println("Penampilan (1 s.d 10) : "); 
        penampilan = input.nextInt();

        System.out.println("Posisi yang Dilamar (SPV, Admin, atau Koodinator) : "); 
		posisi = input.next();

        if(posisi.equalsIgnoreCase("Koodinator")){
            reqKoorl = jeniskelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >=2;
            reqKoor2 = jeniskelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;

            if(reqKoorl || reqKoor2){
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat untuk sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjuutnya,";
            }else {
                hasil = "Maaf, " + nama + ".\nAnda  Tidak memenuhi syarat untuk sebagai " + posisi + ". Dan  Tidak akan masuk ke Tahap Selanjuutnya,";
            }

        }else if(posisi.equalsIgnoreCase("Admin")){
            reqAdminl  = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3")  && ( penampilan >= 8.5 || pengalaman >=1);
            reqAdmin2  = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 25 &&  lulusan.equalsIgnoreCase("S1") &&  penampilan >= 8.5 && pengalaman >=3;
            reqAdmin3  = jeniskelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >=2;

            if(reqAdminl || reqAdmin2 || reqAdmin3){
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat untuk sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjuutnya,";
            }else {
                hasil = "Maaf, " + nama + ".\nAnda  Tidak memenuhi syarat untuk sebagai " + posisi + ". Dan  Tidak akan masuk ke Tahap Selanjuutnya,";
            }
        }else if(posisi.equalsIgnoreCase("Spv")){
            reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
            reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;

            if(reqSpv1 || reqSpv2){
                 hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat untuk sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjuutnya,";
            }else {
                hasil = "Maaf, " + nama + ".\nAnda  Tidak memenuhi syarat untuk sebagai " + posisi + ". Dan  Tidak akan masuk ke Tahap Selanjuutnya,";
            }
            }else{
                hasil = "Maaf Posisi yang anda cari Tidak Tersedia";
            }

            System.out.println();
            System.out.println(nama + ", Terima kasih sudah mengikuti Lowongan Keja di Pt Secret Semut 76.\n");
            System.out.println("Berikut adalah hasil dari Rekrutmen untuk posisi " + posisi + " :");
            System.out.println(hasil);

        }
    }