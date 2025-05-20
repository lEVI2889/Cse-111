public class KKFlavouredTea extends KKTea{
    boolean sold_flavor_stat;
    public KKFlavouredTea(String flavor, int price, int number){
        super(price, number);
        super.status = false;
        super.name = setName(flavor);
    }
    public String setName(String a){
        return "KK "+ a + " Tea";
    }
    public static void updateSoldStatusFlavoured(KKTea a){
        sold_org_flavor_stat = true;
        if(sold_org_flavor_stat){
            total_sold++;
            flav_sold++;
        }
    }
}
