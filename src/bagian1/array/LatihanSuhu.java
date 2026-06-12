package bagian1.array;

public class LatihanSuhu {
    public static void main(String[] args) {
        double[] suhu = {30.5, 32.0, 28.4, 31.1, 29.8, 33.2};
        
        double max = suhu[0];
        double min = suhu[0];
        
        for (double s : suhu){
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }
        
        System.out.println("Suhu Tertinggi: " + max);
        System.out.println("Suhu Terendah: " + min);
    }
}
