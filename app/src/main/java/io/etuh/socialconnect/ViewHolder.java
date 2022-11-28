package io.etuh.socialconnect;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView textVH, textVHA, textVHB,textVHC;

    public ViewHolder(@NonNull View itemView){
        super (itemView);

        textVH =itemView.findViewById(R.id.itemTextA);
        textVHA =itemView.findViewById(R.id.itemTextB);
        textVHB =itemView.findViewById(R.id.itemTextC);
        textVHC =itemView.findViewById(R.id.itemTextD);



    }

    public TextView getTextVH() {
        return textVH;
    }

    public void setTextVH(TextView textVH) {
        this.textVH = textVH;
    }

    public TextView getTextVHA() {
        return textVHA;
    }

    public void setTextVHA(TextView textVHA) {
        this.textVHA = textVHA;
    }

    public TextView getTextVHB() {
        return textVHB;
    }

    public void setTextVHB(TextView textVHB) {
        this.textVHB = textVHB;
    }

    public TextView getTextVHC() {
        return textVHC;
    }

    public void setTextVHC(TextView textVHC) {
        this.textVHC = textVHC;
    }
}

