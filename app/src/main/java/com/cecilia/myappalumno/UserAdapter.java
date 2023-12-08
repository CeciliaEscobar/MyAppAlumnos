package com.cecilia.myappalumno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> users;
    private int selectedPosition = -1;

    private Context context;

    public UserAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = users.get(position);
        // Se configura los datos de los elementos de la lista
        holder.idTV.setText(String.valueOf(user.getId()));
        holder.nombreTV.setText(user.getName());
        holder.nombreTV.setText(user.getCareer());
        holder.correoTV.setText(user.getEmail());
        holder.correoTV.setText(user.getPhone());
        holder.nombreTV.setText(user.getDocument());



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
        return users.size();
    }

    public int getSelectedPosition() {
        return selectedPosition;
    }

    public void setSelectedPosition(int selectedPosition) {
        this.selectedPosition = selectedPosition;
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        // Se declararan los elementos de la vista (Layout user_item.xml)
        TextView idTV, nombreTV, carreraTV, correoTV, telefonoTV, documentoTV;

        public UserViewHolder(View itemView) {
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