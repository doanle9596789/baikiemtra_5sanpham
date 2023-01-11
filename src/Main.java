public class Main {

    public static void main(String[] args) {
        sanPham sp1=new sanPham(1,"ip",1000,2,25);
        sanPham sp2=new sanPham(2,"ipad",2000,5,10);
        sanPham sp3=new sanPham(3,"ipad",2000,4,30);
        sanPham sp4=new sanPham(4,"ipad",2000,10,15);
        sanPham sp5=new sanPham(5,"ipad",2000,15,2);
        sanPham arr[]=new sanPham[5];
        arr[0]=sp1;
        arr[1]=sp2;
        arr[2]=sp3;
        arr[3]=sp4;
        arr[4]=sp5;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].tienChuaKhuyenMai();
        }
        System.out.println("tổng tiền các sản phẩm chưa khuyến mãi là :"+ " " + sum);
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            sum2+=arr[i].saukhuyenmai();
        }
        System.out.println("tổng tiên sau khuyến mãi là :" + " " + " " + sum2);
        System.out.println(" số tiền chênh lệch sau khuyến mãi là:" + (sum-sum2));
    }
}