package provider.androidbuffer.com.fcmdemo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by incred-dev on 25/7/18.
 */

public class FireIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String tkn = FirebaseInstanceId.getInstance().getToken();
        Log.d("FBStkn","Token ["+tkn+"]");
    }
}
