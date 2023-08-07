import java.util.Scanner;

public class JobVacantion {
	public static void main(String[] args) {
	//Deklarasi variable yang diperlukan.
	int umur, pengalaman;
	double penampilan;
	String lulusan, nama, jeniskelamin; 
	boolean reqKoorl, reqKoor2, reqAdminl, reqAdmin2;
	boolean isPassingKoor, isPassingAdmin;
	Scanner input = new Scanner (System.in); 
	
	System.out.println("Selamat datang di PT. Secret Semut 79"); 
		System.out.println("====================================\n");
		System.out.println("Silahkan input Data Anda");
		
		System.out.println("Nama : ");
		nama=input.next();
		
		System.out.println("Umur : "); 
		umur = input.nextInt();
		
		System.out.println("Jenis Kelamin (Pria/Wanita):") ; 
		jeniskelamin = input.next();
		
		System.out.println("Lulusan (SMK/D3/S1) : ");
		lulusan = input.next();
		
		System.out.println("Pengalaman : "); 
		pengalaman = input.nextInt(); 
		
		System.out.println("Penampilan : "); 
		penampilan = input.nextDouble();
		
		reqKoorl = jeniskelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <=30 && (lulusan. equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;

		reqKoor2 = jeniskelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan. equalsIgnoreCase("S1") && pengalaman >= 5; 
		
		isPassingKoor = reqKoorl || reqKoor2;
		
        reqAdminl = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);

        reqAdmin2 = jeniskelamin.equalsIgnoreCase ("Wanita") && umur > 25 && lulusan.equalsIgnoreCase ("S1") && penampilan >= 8.5 && pengalaman >= 3;

        isPassingAdmin = reqAdminl || reqAdmin2;

        System.out.println();
        System.out.println(nama+ ", Terima kasih sudah mengikuti Lowongan Kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah hasil dari Rekrutment untuk Koordinator dan Admin :");
        System.out.println("Hasil Kelulusan untuk Koordinator : " + isPassingKoor); 
        System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);

	}	
}