package liber.app.android_tutorial_workout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment {
    private long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(savedInstanceState != null){
            workoutId = savedInstanceState.getLong("workoutId");
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            Workout workout = Workout.workouts[(int) workoutId];
            TextView title = view.findViewById(R.id.textTitle);
            title.setText(workout.getName());
            TextView description = view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("workoutId", workoutId);
    }

    public void setWorkout(long id){
        this.workoutId = id;
    }
}