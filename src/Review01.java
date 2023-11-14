
public class Review01 {

    public static void main(String[] args) {
        int price = 1997; //商品価格
        int taxPrice = tax(price); //消費税額を計算
        int priceTotal = price + taxPrice; //税込み価格を計算

        System.out.println(price + "円の商品の税込価格は" + priceTotal + "円（消費税は" + taxPrice + "円）です。");

    }

    public static int tax(int price1) {
        double taxRate = 0.10; //消費税は10％
        int result =(int)(price1 * taxRate);//消費税額を計算し、整数に変換
        return result;
    }
}
