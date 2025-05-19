package com.fmu.notesapp;

import androidx.cardview.widget.CardView;

import com.fmu.notesapp.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
