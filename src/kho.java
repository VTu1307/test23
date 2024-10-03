public class kho {
    public static void main(String[] args) {
        int width = 9;  // Độ rộng lớn nhất của hình (số sao lớn nhất trên một dòng)

        // Phần tam giác ngược
        for (int i = 0; i < 4; i++) {
            // In khoảng trắng
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // In dấu * với khoảng trắng xen kẽ
            for (int k = 0; k < width - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();  // Xuống dòng sau khi in xong một hàng
        }

        // Phần tam giác xuôi (in đúng lề, không thêm ô nào)
        for (int i = 2; i >= 0; i--) {
            // In khoảng trắng
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // In dấu * với khoảng trắng xen kẽ
            for (int k = 0; k < width - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();  // Xuống dòng sau khi in xong một hàng
        }
    }
}
