package ba.adnan.toastertestexamplelib;

import android.content.Context;
import android.widget.Toast;

public class AdoToasterMessage {
    public static void messageShort(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
