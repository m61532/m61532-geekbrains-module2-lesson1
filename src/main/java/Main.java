public class Main {
    public static void main(String[] args) {
        Object[] competitors = {
                new Cat(120, 2),
                new Robot(500, 1),
                new Human(2000, 1.2)
        };
        Object[] trials = {new Treadmill(1500), new Wall(1.5)};

        for (int i = 0; i < trials.length; i++) {
            for (int j = 0; j < competitors.length; j++) {
                switch (Integer.parseInt((trials[i].toString() + competitors[j]))) {
                    case (11): {
                        ((Cat) competitors[j]).run(((Treadmill) trials[i]));
                        break;
                    }
                    case (12): {
                        ((Robot) competitors[j]).run(((Treadmill) trials[i]));
                        break;
                    }
                    case (13): {
                        ((Human) competitors[j]).run(((Treadmill) trials[i]));
                        break;
                    }
                    case (21): {
                        ((Cat) competitors[j]).jump(((Wall) trials[i]));
                        break;
                    }
                    case (22): {
                        ((Robot) competitors[j]).jump(((Wall) trials[i]));
                        break;
                    }
                    case (23): {
                        ((Human) competitors[j]).jump(((Wall) trials[i]));
                        break;
                    }
                    default:
                        break;
                }
            }
        }
    }
}
