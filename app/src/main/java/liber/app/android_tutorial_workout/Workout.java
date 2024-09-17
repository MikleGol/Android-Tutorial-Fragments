package liber.app.android_tutorial_workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legend squats \n15 Pull-ups"),
            new Workout("Core Agony", "5 Handstand push-ups\n10 1-legend squats \n15 Pull-ups"),
            new Workout("The Wimp Special", "5 Handstand push-ups\n10 1-legend squats \n15 Pull-ups"),
            new Workout("Strength and Length", "5 Handstand push-ups\n10 1-legend squats \n15 Pull-ups")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return this.name;
    }
}
