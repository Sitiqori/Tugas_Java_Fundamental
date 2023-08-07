import java.util.Scanner;

	public class PassingGradeSMEA{
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			double math, ina, engg, sains;
			double nilai;
			boolean allowed;
			
			System.out.print ("Enter your math value: "); 
			math = keyboard.nextDouble();
			nilai = math ;
			
			System.out.print ("Enter your indonesia value: ");
			ina = keyboard.nextDouble();
			nilai = ina + nilai ;
			
			System.out.print ("Enter your engglish value: ");
			engg = keyboard.nextDouble();
			nilai = engg + nilai ;
			
			System.out.print ("Enter your sains value: ");
			sains = keyboard.nextDouble();
			nilai = sains + nilai ;
			
			nilai = nilai ;
			
			System.out.println("Hasil kalkulasi untuk persyaratan penerimaaan calon siswa baru di SMK 1 Garut adalah sebagai berikut:");
			System.out.println("==========================================================================");
			
			allowed = ( nilai >= 280 );
			System.out.println("Apakah nilai rata - rata hasil ujian anda memenuhi syarat? " + allowed);
			
			allowed = ( ina > 75 && ( engg > 80 || math >= 70 ) );
			System.out.println("Apakah nilai rata - rata hasil ujian anda memenuhi untuk masuk ke jurusan OTP ? " + allowed);
			
			allowed = ( sains > 80 && ( engg > 80 || math >= 80 ) );
			System.out.println("Apakah nilai rata - rata hasil ujian anda memenuhi untuk masuk ke jurusan PPL ? " + allowed);
		}
	}