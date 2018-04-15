package com.example.kaseyclark.takehome08kasyc; /**
 * Created by kaseyclark on 3/28/18.
 */
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;
import android.widget.Toast;

public class QuestionViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public ImageView countryImage;
    public Question question;

    public QuestionViewHolder (View itemView, final Context context )
    {
        super(itemView);
        cardView=(CardView) itemView.findViewById(R.id.card_view);
        questionCountry= (TextView) itemView.findViewById(R.id.question_country);
        countryQuestion = (TextView) itemView.findViewById(R.id.country_question);
        countryImage= (ImageView) itemView.findViewById(R.id.country_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+question.isTrue(),Toast.LENGTH_SHORT).show();

            }
        });
    }

}
