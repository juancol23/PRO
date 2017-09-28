package valdcolra.viia.com.proyectoviia.view.menDash;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import valdcolra.viia.com.proyectoviia.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class menu_viia_checking extends Fragment {


    public menu_viia_checking() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_viia_checking, container, false);

        ImageView img = (ImageView) view.findViewById(R.id.imgChecklist);

        
        return view;
    }

}
