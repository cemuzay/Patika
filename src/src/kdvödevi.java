package src.src;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class kdvödevi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ücret tutarını giriniz : ");
        double tutar=input.nextDouble();
       double kdvoranı=0.18;
       double kdvtutar=tutar* kdvoranı;
       double kdvlitutar=tutar+kdvtutar;
        System.out.println(kdvlitutar);
    }
}
