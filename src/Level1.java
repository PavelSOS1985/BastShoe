import java.util.*;

public class Level1 {
    public static String mainStr = "";
    public static List<String> mainStrMod = new ArrayList<>();
    public static int indexMod = 1;
    public static int countUndo = 0;
    public static int countRedo = 0;


    public static String BastShoe(String command) {
        String[] resArr = command.split(" ", 2);
        int mSLenth = mainStr.length();
        int x = Integer.parseInt(resArr[0]);
        switch (x) {
            case 1:
                if (countUndo > 0) {
                    mainStrMod.clear();
                    mainStrMod.add(mainStr);
                    countUndo = 0;
                    indexMod = 1;
                }
                mainStr = mainStr + resArr[1];
                mainStrMod.add(mainStr);
                break;

            case 2:
                int iEnd = Integer.parseInt(resArr[1]) > mSLenth ? 0 : mSLenth - Integer.parseInt(resArr[1]);
                if (countUndo > 0) {
                    mainStrMod.clear();
                    mainStrMod.add(mainStr);
                    countUndo = 0;
                    indexMod = 1;
                }
                mainStr = mainStr.substring(0, iEnd);
                mainStrMod.add(mainStr);
                break;

            case 3:
                try {
                    mainStr = Character.toString(mainStr.charAt(Integer.parseInt(resArr[1])));
                    break;
                } catch (Exception e) {
                    mainStr = "";
                    break;
                }

            case 4:
                //System.out.println("size = " + mainStrMod.size() + "countUndo = " +countUndo);
                indexMod++;
                try {
                    mainStr = mainStrMod.get(mainStrMod.size() - indexMod);
                } catch (Exception e) {
                    mainStr = mainStrMod.get(0);
                }
                countUndo++;
                break;
            case 5:
                indexMod--;
                if (indexMod < 1) indexMod = 1;
                mainStr = mainStrMod.get(mainStrMod.size() - indexMod);
                break;
        }
        return mainStr;
    }

    public static void main(String[] args) {
        BastShoe("1 Привет");
        System.out.println("1 Привет " + mainStr);

        BastShoe("1 , мир!");
        System.out.println("1 , мир! " + mainStr);

        BastShoe("1 ++");
        System.out.println("1 ++ " + mainStr);

        BastShoe("2 2");
        System.out.println("2 2 " + mainStr);
        BastShoe("3 6");
        System.out.println("3 6 " + mainStr);
        BastShoe("4");
        System.out.println("4 " + mainStr);

  /*      BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("1 *");
        System.out.println("1 *" + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("3 6");
        System.out.println("3 6 " + mainStr);

        BastShoe("2 100");
        System.out.println("2 100 " + mainStr);

        BastShoe("1 Привет");
        System.out.println("1 Привет " + mainStr);

        BastShoe("1 , мир!");
        System.out.println("1 , мир! " + mainStr);

        BastShoe("1 ++");
        System.out.println("1 ++ " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("4 ");
        System.out.println("4 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("2 2");
        System.out.println("2 2 " + mainStr);

        BastShoe("4");
        System.out.println("4 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);

        BastShoe("5");
        System.out.println("5 " + mainStr);*/
    }

}