import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        Makanan makanan = new Makanan("Puyung Hai","China");

        Gson gson=new Gson();
        String jsonMakanan = gson.toJson(makanan);

        System.out.println(jsonMakanan);

        // ubah string JSON menjadi Objek
        Gson gsonBuilder = new GsonBuilder().create();
        Makanan myMakanan = gsonBuilder.fromJson(jsonMakanan, Makanan.class);
        System.out.println(myMakanan.getNamaMakanan());
        System.out.println(myMakanan.getAsalMakanan());
    }
}
