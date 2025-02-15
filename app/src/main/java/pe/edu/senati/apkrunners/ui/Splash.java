package pe.edu.senati.apkrunners.ui;

import android.content.Context;
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
import pe.edu.senati.apkrunners.databinding.FragmentSolicitudesBinding;
import pe.edu.senati.apkrunners.databinding.FragmentSplashBinding;

public class Splash extends Fragment {
    FragmentSplashBinding binding;
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
        binding = FragmentSplashBinding.inflate( inflater,container ,false);
        return  view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController(view);
    }
}