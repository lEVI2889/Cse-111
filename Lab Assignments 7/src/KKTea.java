public class KKTea extends Tea{
    String org_flav = "Regular";
    int weight = 2;
    int number_of_bags;
    static int total_sold;
    static int kk_sold;
    static boolean sold_org_flavor_stat = false;
    static int flav_sold;
    public KKTea(int price, int number){
        super(" ", price);
        super.name = setName(org_flav);
        number_of_bags = number;
        sold_org_flavor_stat = super.status;
    }
    public String setName(String a){
        return "KK "+ a + " Tea";
    }
    public int setWeight(){
        return weight*number_of_bags;
    }
    public void productDetail() {
        super.status = sold_org_flavor_stat;
        super.productDetail();
        System.out.println("Weight: "+ setWeight()+", "+ "Tea Bags: "+number_of_bags);
    }
    public static void totalSales(){
        System.out.println("Total Sales: "+total_sold);
        System.out.println("KK Regular Tea: "+kk_sold);
        if(flav_sold!=0){
            System.out.println("KK Flavoured Tea: "+flav_sold);
        }
    }
    public static void updateSoldStatusRegular(KKTea a){
        sold_org_flavor_stat = true;
        if(sold_org_flavor_stat){
            total_sold++;
            kk_sold++;
        }
    }
}
