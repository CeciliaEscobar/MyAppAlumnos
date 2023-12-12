package com.cecilia.myappalumno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private List<Student> students;
    private int selectedPosition = -1;

    private Context context;

    public StudentAdapter(List<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student student = students.get(position);
        // Se configura los datos de los elementos de la lista
        holder.idTV.setText(String.valueOf(student.getId()));
        holder.nombreTV.setText(student.getName());
        holder.nombreTV.setText(student.getCareer());
        holder.correoTV.setText(student.getEmail());
        holder.correoTV.setText(student.getPhone());
        holder.nombreTV.setText(student.getDocument());



        // Configura un OnClickListener en el ViewHolder
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Guarda el índice del elemento seleccionado
                setSelectedPosition(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public int getSelectedPosition() {
        return selectedPosition;
    }

    public void setSelectedPosition(int selectedPosition) {
        this.selectedPosition = selectedPosition;
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        // Se declararan los elementos de la vista (Layout user_item.xml)
        TextView idTV, nombreTV, carreraTV, correoTV, telefonoTV, documentoTV;

        public StudentViewHolder(View itemView) {
            super(itemView);
            idTV = itemView.findViewById(R.id.textItemId);
            nombreTV = itemView.findViewById(R.id.textItemNombre);
            carreraTV = itemView.findViewById(R.id.textItemCarrera);
            correoTV = itemView.findViewById(R.id.textItemEmail);
            telefonoTV = itemView.findViewById(R.id.textItemTelefono);
            documentoTV = itemView.findViewById(R.id.textItemDocumento);
        }
    }

}