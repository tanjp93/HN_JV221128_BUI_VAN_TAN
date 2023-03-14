package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập tuổi của bạn: ");
            int age = scanner.nextInt();
            int birthYear = 2023-age;

            String[] canList = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
            String[] chiList = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi"};

            int canIndex = (birthYear - 1) % 10 + 1;
            if (canIndex==10){
                canIndex=0;
            }
            int chiIndex = (birthYear - 1) % 12 + 1;
            if (chiIndex==12){
                chiIndex=0;
            }
            String can = canList[canIndex];
            String chi = chiList[chiIndex];

            System.out.printf("\t" + "%d → %s %s ", age, can, chi);
    }
}