
public class Main {
    private static String name;
    public static void main(String[] args) {

//        int a = 5;
//        int b = 10;
//
//        int ketqua = a++ - --b + b-- + a++;
//
//         5 - --b + b-- + a++ // a = 6 , b = 10;
//         5 - 9 + b-- + a++ // a = 6 , b = 9;
//         5 - 9 + 9 + a++ // a = 6 , b = 8;
//         5 - 9 + 9 + 6 // a = 7 , b = 8;
//
//        System.out.println(ketqua);

        // 4 : Câu điều kiện

//        int a = 15;
//        int b = 10;
//
//        if (a > b){
//            System.out.println("1");
//        }else if (a == b){
//            System.out.println("0");
//        }else{
//            System.out.println("-1");
//        }
//
//         a > b => 1
//         a == b => 0
//         a < b => -1

        // Xử lý cho việc đăng nhập
        // có 2 biến username , password
        // username phải 6 ký tự và password phải trên 6 ký tự

        // Nếu trường hợp không thỏa in ra Invalid login
        // Nếu trường hợp thỏa điều kiện Login success

//        String username = "abcdef";
//        String password = "1234567";
//
//        // Lấy kích thước chuỗi : .length()
//
//        if (username.length() >= 6 && password.length() > 6){
//            System.out.println("Login Successful");
//        }else {
//            System.out.println("Invalid Login");
//        }

//        int a = 5;
//
//        if ( a == 0 || a > 4){
//            System.out.println("Thỏa");
//        }else{
//            System.out.println("Khong thỏa");
//        }

//        Toán tử ba ngôi

//        int a = 10;
//
//        if (a == 0){
//            a = 10;
//        }
//        System.out.println(a);

//        int a = 12;
//        int b = 10;
//
//        if (a > b){
//            System.out.println("A lớn hơn B");
//        }else{
//            System.out.println("A sẽ bé hơn bằng B");
//        }

//        (bieu thuc) ? giá trị cho trường hợp true : giá trị cho trường hợp là false

//        String message = (a > b) ? "A lớn hơn B" : "A bé hơn hoặc bằng B";
//
//        System.out.println(message);

//         a > b => 1
//         a == b => 0
//         a < b => -1

//        int result = (a > b) ? 1 : ((a == b) ? 0 : -1);
//        System.out.println(result);

//        switch case

//        int month = 5;
//
//        switch (month) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Quý 1");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Quy 2");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("Quy 3");
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("Quy 4");
//                break;
//            default:
//                System.out.println("Invalid month");
//                break;
//        }

//        mảng : Array
//        Cách 1 : Biết kích thước mảng nhưng chưa biết cụ thể các giá trong mảng
//        int[] arrNumbers = new int[10];

//        Index : vị trí của phần tử trong mảng
//        Kích thước mảng : arrNumbers.length
//        0   1   2  3  .....          9
//        A , B , C ,D ,E ,F ,G ,H ,K ,Q

//        arrNumbers[0] = 5;
//        System.out.println(arrNumbers[0]);

//        Cách 2 : Biết giá trị các phần tử
//        String[] arrNames = {"Tèo","Tí","Tủn","Hoa","Tuấn"};

        // vòng lặp (Loop)

        // sử dụng vòng lặp for
//        for (int i = 0 ; i < 10 ; i++){
//            System.out.println(i);
//        }

        // Vòng chạy 1 cho đến 100 , in ra các giá trị chia hết cho 2

//        for (int i = 2 ; i <= 100 ; i+=2){
//            System.out.println(i);
//        }

        // Cho mảng gồm 5 phần tử có giá trị là Tèo , Tuấn , Nguyễn , Huy , Thanh;
        // Xuất ra tên của phần tử nào chỉ có 3 ký tự

//        String[] arrNames = {"Tèo" ,"Tuấn" ,"Nguyễn","Thanh","Huy"};
//
//        for (int i = 0; i < arrNames.length ; i++) {
//            if (arrNames[i].length() == 3){
//                System.out.println(arrNames[i]);
//            }
//        }

        // Vòng lặp while
//        String[] arrNames = {"Tèo" ,"Tuấn" ,"Nguyễn","Thanh","Huy"};
//        int i = arrNames.length - 1;
//        while (i >= 0){
//            System.out.println(arrNames[i]);
//            i--;
//        }

//        String[] arrNames = {"Tèo" ,"Tuấn" ,"Nguyễn","Thanh","Huy"};
//
//        int i = 5;
//
//        do {
//            System.out.println("Chạy vào do");
//        }while (i < arrNames.length);


        // Hướng đối tượng
        // class , object


        // Đây là 1 instance của parent


        // ctrl + P : xem tham số truyền vào
//        Parent dad = new Parent();
//
//        dad.yearOfBirth();
//
//        System.out.println(dad.getAge());
//        System.out.println(dad.getName());

        // access modifier
//        public , private , protected

        // tính đóng gói : Encapsulation
        // tính kế thừa : Inheritance
        // tính đa hình : Polymorphism
        // tính trườu tượng : Abstraction

//        Parent parent = new Parent("Nguyen Van A",60);
//        Child child = new Child("Nguyen Van Teo",10,1.2f,30.0f);

//        ACBBank acbBank = new ACBBank();
//        TPBank tpBank = new TPBank();
//        acbBank.bankOfRate();
//        tpBank.bankOfRate();

        // pizza

        // ten
        // nguyenlieu
        // đế bánh
        // sốt


        //
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(2);

    }
}


