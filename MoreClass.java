public class MoreClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println(obj1);

        Object obj2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        System.out.println(obj2);
    }
}
//why System.out.println(obj1) could be displayed?
// vì obj1 là 1 instance của class. là 1 lớp cơ bản trong java
// và có sẵn trong tất cả các chương trình java

//difference:
//obj1 được tạo bằng cách sử dụng hàm xây dựng mặc định và biểu diễn chuỗi của nó là kết quả của việc gọi phương thức trên object
//obj2 được tạo ra bằng cách sử dụng một class ghi đè phương thức của nó để trả về chuỗi