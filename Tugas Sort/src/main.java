import Model.Sort;

public class main {
    public static void main(String[] args)
    {
        String[] nama = {"Oliver", "Isac", "Stephen", "William", "Asta", "Billy"};

        System.out.println("Data nama :");

        for (int i = 0; i<nama.length;i++) {
            System.out.print(nama[i]+ ",");
        }
        System.out.println("");

        Sort sorting = new Sort();
        sorting.setData(nama);
        sorting.pengurutanData();
        sorting.cetakData();
    }
}
