package abstractFactory;

public interface GoalFactory {
  WorkoutPlan createWorkoutPlan();
  MealPlan createMealPlan();
}
