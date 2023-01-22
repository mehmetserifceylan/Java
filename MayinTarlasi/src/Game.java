import java.util.Scanner;

public class Game {
    int satirSay,sutunSay,mayinSayisi ;
    int tarla[][];
    String kullaniciArayuz[][];

    public MTOMineSweeper(int satirSay, int sutunSay) {
        this.satirSay = satirSay;
        this.sutunSay = sutunSay;
    }
    public MTOMineSweeper() {
    }

    public void satirSayAl(){
        System.out.println("Satýr sayýsýnýz giriniz :");
        Scanner sc = new Scanner(System.in);
        this.satirSay = sc.nextInt();
    }
    public void sutunSayAl(){
        System.out.println("Sutun sayýsýnýz giriniz :");
        Scanner sc = new Scanner(System.in);
        this.sutunSay = sc.nextInt();

    }

    public void run(){
        kuralYazdir();
        satirSayAl();
        sutunSayAl();
        tarlaOlustur();
        mayinYerlestir();
        //tarlaYazdir(); //kontrol amaçlý mayýnlarý görmek için
        //System.out.println("-----------------------------");
        sayilariYerlestir();
        //tarlaYazdir(); //kontrol amaçlý tarlanýn oyun önceki hali
        oyna();
    }

    public void kuralYazdir(){ // Oyun kurallarý yazýlacak.
        System.out.println("Hoþgeldiniz.");
        System.out.println("Kuralllar;"
                        +"\nSatýr ve sütun deðerleri girip mayýna yakalanmamalýsýnýz.");
    }

    public void tarlaOlustur(){ //boþ oyun tarlasý oluþturur.
        this.tarla = new int[this.satirSay][this.sutunSay];
        this.kullaniciArayuz = new String[this.satirSay][this.sutunSay];
        for (int i = 0; i < this.kullaniciArayuz.length; i++){
            for(int j = 0; j < this.kullaniciArayuz[0].length; j++ ){
                kullaniciArayuz[i][j] = "_";
            }
        }
    }

    public void mayinYerlestir(){ //mayýnlarý rastgele yerleþtirir.
        this.mayinSayisi = (this.satirSay*this.sutunSay) /4;
        int temp = this.mayinSayisi;

        while (temp>0){
            int r = (int) (Math.random() * (satirSay*sutunSay)) ;
            for (int i = 0; i < this.tarla.length; i++){
                for(int j = 0; j < this.tarla[0].length; j++ ){
                    r--;
                    if(r==0 && tarla[i][j] != 9){
                        tarla[i][j] = 9;
                        temp --;
                    }
                }
            }

        }

    }

    public void sayilariYerlestir(){ //mayýn çevresi
        for (int i = 0; i < this.tarla.length; i++){
            for(int j = 0; j < this.tarla[0].length; j++ ){
                if(!isNotMayin(i,j)){
                    ekle(i,j);
                }
            }
        }
    }

    public boolean isRow(int n){ // sýnýr kontrolü
        if(n >= 0 && n<this.tarla.length) return true;
        else return false;
    }
    public boolean isCol(int n){ // sýnýr kontrolü
        if(n >= 0 && n<this.tarla[0].length) return true;
        else return false;
    }
    public boolean isNotMayin(int i,int j){
        if(this.tarla[i][j] != 9){
            return true;
        }
        else return false;
    }
    public void ekle(int a, int b){ //mayýnýn çevresine +1 ekler
        for(int i = a-1; i<=a+1; i++){
            for(int j = b-1; j<=b+1; j++){
                if(isRow(i) && isCol(j) && isNotMayin(i,j)){
                    this.tarla[i][j] ++;
                }
            }
        }
    }
    public void tarlaYazdir(){ //kontrol amaçlý tarlanýn oynanmadan önceki hali
        for (int str[]: this.tarla){
            for (int j: str){
                if(j == 9) System.out.print("* ");
                else System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void oyna(){
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        while (game){
            yazdirKullaniciArayuz();
            System.out.print("Satýr deðerini giriniz :"); int i = sc.nextInt();
            System.out.print("Sutun deðerini giriniz :"); int j = sc.nextInt();
            if(isRow(i) && isCol(j)){
                if(!isNotMayin(i,j)){
                    System.out.println("Game Over");
                    tarlaYazdir();
                    break;
                }
                else {
                    this.kullaniciArayuz[i][j] = Integer.toString(this.tarla[i][j]) ;
                    if(isWin()){
                        System.out.println("Tebrikler kazandýnýz.");
                        tarlaYazdir();
                        break;
                    }
                }
            }
            else {
                System.out.println("Oyun sýnýrlarý dýþýna çýktýnýz lütfen tekrar giriniz.");
            }
        }

    }

    public boolean isWin(){
        int count = 0;
        for(String[] str : kullaniciArayuz){
            for (String s : str){
                if(s == "_"){
                    count ++;
                }
            }
        }
        if (count == mayinSayisi){
            return true;
        }else return false;
    }
    public void yazdirKullaniciArayuz(){
        for (String str[]: this.kullaniciArayuz){
            for (String j: str){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
