import java.util.Scanner;

public class CalculateMoneySpent{
    public static void main (String[] args){
		
        String Name;
        int Money;
        double Average;
        int total;
        int totalDay = 7;
		
        Scanner input = new Scanner(System.in);

        System.out.println("Hallo, Biarkan aku menghitung pengeluaran anda> y < ");

          System.out.println("Siapa Nama anda");
          Name = input.next();


          System.out.println("Berapa pengeluaran anda pada hari senin, " + Name + "? ");
          Money = input.nextInt();
          total = Money;
          System.out.println("Berapa pengeluaran anda pada hari selasa, " + Name + "? ");
          Money = input.nextInt();
          total = total + Money;
          System.out.println("Berapa pengeluaran anda pada hari rabu, " + Name + "? ");
          Money = input.nextInt();
          total = total + Money;
          System.out.println("Berapa pengeluaran anda pada hari kamis, " + Name + "? ");
          Money = input.nextInt();
          total = total + Money;
          System.out.println("Berapa pengeluaran anda pada hari jumat, " + Name + "? ");
          Money = input.nextInt();
          total = total + Money;
          System.out.println("Berapa pengeluaran anda pada hari sabtu, " + Name + "? ");
          Money = input.nextInt();
          total = total + Money;
          System.out.println("Berapa pengeluaran anda pada hari minggu, " + Name + "? ");
          Money = input.nextInt();
          total = total + Money;

          total = total ;
          Average = (double) total/totalDay;


          System.out.println("Ini hasil penjumlahan pengeluaran anda :");
          System.out.println("okay " + Name + " jadi pengeluaran minggu ini di club sebesar $" + total);
          System.out.println("dengan rata - rata pengeluaran perhari $" + Average);

          System.out.println("Terima kasih!! Sampai jumpa lagi !");

    }
}