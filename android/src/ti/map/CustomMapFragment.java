package ti.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.appcelerator.kroll.common.Log;

import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;

public class CustomMapFragment extends SupportMapFragment {

    public CustomMapFragment() {
        super();
    }


    public static CustomMapFragment newInstance() {
        CustomMapFragment frag = new CustomMapFragment();
        return frag;
    }

    public static CustomMapFragment newInstance(GoogleMapOptions googleMapOptions){
        Bundle arguments = new Bundle();
        arguments.putParcelable("MapOptions", googleMapOptions);

        CustomMapFragment frag = new CustomMapFragment();
        frag.setArguments(arguments);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater arg0, ViewGroup arg1, Bundle arg2) {
        View v = super.onCreateView(arg0, arg1, arg2);
        return v;
    }
}
