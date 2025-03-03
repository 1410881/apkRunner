package pe.edu.senati.apkrunners.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.edu.senati.apkrunners.R;
import pe.edu.senati.apkrunners.databinding.FragmentCiudadBinding;
import pe.edu.senati.apkrunners.databinding.FragmentEntregasBinding;
import pe.edu.senati.apkrunners.databinding.FragmentLoginBinding;

public class Login extends Fragment {
    FragmentLoginBinding binding;
    Context context;
    View view;
    NavController navController;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate( inflater,container ,false);
        return  view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController(view);

        binding.tv03.setOnClickListener( v ->  startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://indrive.com/es-mx"))));


    }
}