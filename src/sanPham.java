public class sanPham {
    private int maSanPham;
    private  String tenSanPham;
    private double giaSanPham;
    private int soLuongSan;
    private  double khuyenMai;

    public sanPham() {
    }

    public sanPham(int maSanPham, String tenSanPham, double giaSanPham, int soLuongSan, double khuyenMai) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuongSan = soLuongSan;
        this.khuyenMai = khuyenMai;
    }

    public sanPham(int maSanPham, String tenSanPham) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuongSan() {
        return soLuongSan;
    }

    public void setSoLuongSan(int soLuongSan) {
        this.soLuongSan = soLuongSan;
    }

    public double getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(double khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public String toString() {
        return "sanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", soLuongSan=" + soLuongSan +
                ", khuyenMai=" + khuyenMai +
                '}';
    }
    public  double tienChuaKhuyenMai(){
        return  this.soLuongSan*this.giaSanPham;
    }
    public  double saukhuyenmai(){
        return this.soLuongSan*(100-this.khuyenMai)/100*this.giaSanPham;
    }
}
