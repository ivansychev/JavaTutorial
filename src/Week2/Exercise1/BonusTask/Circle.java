package Week2.Exercise1.BonusTask;

/**
 * Задание: исправить ошибку в коде.
 * После исправления в консоль должно выводиться: Red
 * (Подсказка 1): нужно исправить ОДНУ строчку в коде!
 *
 * Попробуйте решить без этой подсказки:
 * (Подсказка 2): нужно удалить ОДНО слово в коде!
 */

public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public void Circle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}