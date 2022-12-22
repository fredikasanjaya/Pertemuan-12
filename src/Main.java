public class Main{
    public static void main(String[] args){
        Customer FredikaSanjaya = new Customer();
        FredikaSanjaya.nama = "Fredika S";
        FredikaSanjaya.alamat = "BulakKapal";

        Order Pesawat = new Order();

        Pesawat.date = 2023;
        Pesawat.status = "Pesawat Tempur";

        Payment Pesawat_Tempur = new Payment();

        Pesawat_Tempur.jumlah = 5;
    }  
}