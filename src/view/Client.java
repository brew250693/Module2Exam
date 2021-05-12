package view;

import controller.PhoneBookManager;
import model.Phonebook;
import storage.FileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        List<Phonebook> phonebookList = new ArrayList<>();
        FileManager khanh1 = FileManager.getINSTANCE();
        phonebookList = khanh1.getData();
        PhoneBookManager khanh = new PhoneBookManager(phonebookList);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("---- Trương trình quản lý danh bạ ----");
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    khanh.showAllPhonebook();
                    break;
                case 2:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập tên: ");
                    String name = sc1.nextLine();
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập số điện thoại: ");
                    String phoneNumber = sc2.nextLine();
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập địa chỉ: ");
                    String address = sc3.nextLine();
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập email: ");
                    String email = sc4.nextLine();
                    Scanner sc5 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập facebook: ");
                    String fb = sc5.nextLine();
                    Phonebook p = new Phonebook(name,phoneNumber,address,email,fb);
                    khanh.addNewPhonebook(p);
                    break;
                case 3:
                    System.out.println("Mời bạn nhập tên cần sửa:");
                    Scanner n = new Scanner(System.in);
                    String name1 = n.nextLine();
                    System.out.println("Nhập số điện thoại cần sửa:");
                    Scanner n1 = new Scanner(System.in);
                    String phoneNumber1 = n1.nextLine();
                    System.out.println("Nhập địa chỉ cần sửa");
                    Scanner n2 = new Scanner(System.in);
                    String address1 = n2.nextLine();
                    System.out.println("Nhập email cần sửa");
                    Scanner n3 = new Scanner(System.in);
                    String email1 = n3.nextLine();
                    System.out.println("Nhập facebook cần sửa");
                    Scanner n4 = new Scanner(System.in);
                    String fb1 = n4.nextLine();
                    khanh.updatePhonebook(name1,phoneNumber1,address1,email1,fb1);
                    break;
                case 4:
                    System.out.println("Nhập tên danh bạ cần xóa");
                    Scanner d = new Scanner(System.in);
                    String name2 = d.nextLine();
                    khanh.deletePhonebook(name2);
                    break;
                case 5:
                    String name3;
                    Scanner f = new Scanner(System.in);
                    System.out.println("Mời bạn nhập tên cần tìm: ");
                    name3 = f.nextLine();
                    khanh.searchByName(name3);
                    break;
                case 6:
                    khanh.readFile();
                    System.out.println(phonebookList);
                    break;
                case 7:
                    khanh.writeFile();
                    break;
                case 8:
                    System.err.println("Cảm ơn!");
                    System.exit(0);
                    break;





            }

        }
    }
}