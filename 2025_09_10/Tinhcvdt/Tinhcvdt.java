public class Tinhcvdt {
    private int x;
    private int y;
  
    public Tinhcvdt(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai la so nguyen duong.");
        }
        this.x = x;
        this.y = y;
    }
 
    public int chuVi() {
        return 2 * (x + y);
    }

    public int dienTich() {
        return x * y;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Hay nhap 2 tham so (Chieu dai va chieu rong).");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            Tinhcvdt rect = new Tinhcvdt(x, y);

            System.out.println("Chu vi hinh chu nhat: " + rect.chuVi());
            System.out.println("Dien tich hinh chu nhat: " + rect.dienTich());

        } catch (NumberFormatException e) {
            System.out.println("Tham so nhap vao khong phai la so nguyen. Hay nhap so nguyen.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
