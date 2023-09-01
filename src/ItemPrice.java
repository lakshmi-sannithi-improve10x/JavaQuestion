public class ItemPrice {
    public static void main(String[] args) {
        float originalPrice =89f;
        float discount =20f;
        float answer =finalPriceOfItem(originalPrice,discount);
        System.out.println(answer);

    }
    public static float finalPriceOfItem(float originalPrice,float discount){
        float result = 0;
        float discountPrice = originalPrice * (discount/100);
        float finalPrice = originalPrice - discountPrice;
        result = finalPrice;
        return result;
    }
    }
