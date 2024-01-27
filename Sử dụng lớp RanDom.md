# Lam game tai xiu
## 1. Luật chơi:
- Đặt cược
- 3 xúc xắc 
- Nếu ra (3 hoặc 18) nhà cái thắng
- Nếu ra(4 - 11) => Xỉu, Nếu ng chơi đặt xỉu: Ng chơi thắng, ngược lại thì thua
- Nếu ra (12 - 17) => Tài , nếu ng chơi đặt tài -> ng chơi thắng, ng lại thua
- Code:
    ```java
    import java.util.Scanner;
    import java.util.Random;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi ban chon: ");
            System.out.println("1 de băt dau choi;");
            System.out.println("2 de băt thoat");

                System.out.println("Chon so tien cuoc: ");
                int tien = sc.nextInt();
                System.out.println("Hay lua chon : 1: Tai, 2:Xiu");
                int luachon = sc.nextInt();
                System.out.println("Do xuc xac:............ ");

                Random x1 = new Random();
                Random x2 = new Random();
                Random x3 = new Random();

                int giatri1 = x1.nextInt(5) + 1; // 0->5 + 1
                int giatri2 = x2.nextInt(5) + 1;
                int giatri3 = x3.nextInt(5) + 1;

                int kq = giatri1 + giatri2 + giatri3;
                System.out.println("KEt qua la: " + kq);

                if(kq == 3 || kq == 18) System.out.println("Nha cai thang!");
                else if(3 < kq && kq <= 11){
                    if(luachon == 1) System.out.println("Ban thang!");
                    else System.out.println("Nha cai thang!");
                }
                else if(kq > 11 && kq < 18){
                    if(luachon == 1) System.out.println("Nha cai thang!");
                    else System.out.println("Ban thang!");
                }

        }
    }
    ```