package com.example.homework7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class OnBoardItemFragment extends Fragment {

    // TODO: Переименуйте аргументы параметра, выберите имена, которые соответствуют
    // параметры инициализации фрагмента, например ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    // TODO: Переименовать и изменить типы параметров
    private String text, description;
    private int  image;

    private ImageView imageView;
    private TextView itemTitle, itemDescription;

    public OnBoardItemFragment() {
        // Обязательный пустой публичный конструктор
    }

    /**
     * Используйте этот заводской метод для создания нового экземпляра
     * этот фрагмент с использованием предоставленных параметров.

     * @return Новый экземпляр фрагмента OnBoardItemFragment.
     */
    // TODO:Переименовать и изменить типы и количество параметров
    public static OnBoardItemFragment newInstance(String text, String description, int image) {
        OnBoardItemFragment fragment = new OnBoardItemFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, text);
        args.putString(ARG_PARAM2, description);
        args.putInt(ARG_PARAM3, image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            text = getArguments().getString(ARG_PARAM1);
            description = getArguments().getString(ARG_PARAM2);
            image = getArguments().getInt(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_on_board_item, container, false);
        imageView = view.findViewById(R.id.image_fr);
        itemTitle = view.findViewById(R.id.title_fr);
        itemDescription = view.findViewById(R.id.description_fr);

        itemTitle.setText(text);
        itemDescription.setText(description);
        imageView.setImageResource(image);
        return view;
    }
}