package lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class Straight {
    private int a;
    private int b;
    private int c;

    public Straight(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getPointIntersectionWithX() {
        return String.format("x = %.2f, y = 0;", (double) -this.c / (double) this.a);
    }

    public String getPointIntersectionWithY() {
        return String.format("x = 0, y = %.2f;", (double) -this.c / (double) this.b);
    }

    public String getPointIntersectionLines(Straight line) {
        String result = null;
        if (line != null) {
            double coeffOne = (double) this.a / (double) line.a;
            double coeffTwo = (double) this.b / (double) line.b;
            double coeffThree = (double) this.c / (double) line.c;

            if (coeffOne == coeffTwo && coeffOne == coeffThree) {
                result = "Прямые равны. Имеют бесконечное множество точек пересечения.";
            } else if (coeffOne == coeffTwo && coeffOne != coeffThree) {
                result = "Прямые параллельны. Точек пересечения нет.";
            } else {
                double y = (double) (line.a * this.c - this.a * line.c) / (double) (this.a * line.b - line.a * this.b);
                double x = (this.b * y + this.c) / (double) -this.a;
                result = String.format("Точка пересечения: {%.2f, %.2f};", x, y);
            }
        }
        return result;
    }

    private String getBlock(int number, String prefix, boolean first) {
        String result = "";
        if (number != 0) {
            if (first) {
                result = String.format("%d%s", number, prefix);
            } else {
                String sign = number < 0 ? "-" : "+";
                result = String.format(" %s %d%s", sign, Math.abs(number), prefix);
            }
        }
        return result;
    }

    public boolean isParallel(Straight line) {
        double coeffOne = (double) this.a / (double) line.a;
        double coeffTwo = (double) this.b / (double) line.b;
        double coeffThree = (double) this.c / (double) line.c;
        return coeffOne == coeffTwo && coeffOne != coeffThree;
    }

    public boolean isEquals(Straight line) {
        double coeffOne = (double) this.a / (double) line.a;
        double coeffTwo = (double) this.b / (double) line.b;
        double coeffThree = (double) this.c / (double) line.c;
        return coeffOne == coeffTwo && coeffOne == coeffThree;
    }

    public static Map<Straight, List<Straight>> getGroupsParallel(List<Straight> list) {
        Map<Straight, List<Straight>> map = new HashMap<>();
        if (list != null && !list.isEmpty()) {
            boolean flag;
            while (!list.isEmpty()) {
                flag = false;
                Straight line = list.remove(0);
                for (Straight lineMap : map.keySet()) {
                    if (lineMap.isParallel(line)) {
                        map.get(lineMap).add(line);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    map.put(line, new ArrayList<>());
                }
            }
        }
        return map;
    }

    @Override
    public String toString() {
        return "Straight{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
