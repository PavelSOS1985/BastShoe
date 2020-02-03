import java.util.*;

public class Level1 {
    public static String mainStr = "";
    public static List<String> mainStrMod = new ArrayList<>(Arrays.asList(""));
    public static int indexMod = 0;
    public static int countUndo = 0;

    public static String BastShoe(String command) {
        String[] resArr = command.split(" ", 2);
        int mSLenth = mainStr.length();
        switch (Integer.parseInt(resArr[0])) {
            case 1:
                if (countUndo > 0) {
                    mainStrMod.clear();
                    mainStrMod.add(mainStr);
                    countUndo = 0;
                    indexMod = 0;
                }
                mainStr = mainStr + resArr[1];
                mainStrMod.add(mainStr);
                indexMod++;
                break;
            case 2:
                int iEnd = Integer.parseInt(resArr[1]) > mSLenth ? 0 : mSLenth - Integer.parseInt(resArr[1]);
                if (countUndo > 0) {
                    mainStrMod.clear();
                    mainStrMod.add(mainStr);
                    countUndo = 0;
                    indexMod = 0;
                }
                mainStr = mainStr.substring(0, iEnd);
                mainStrMod.add(mainStr);
                indexMod++;
                break;
            case 3:
                try {
                    mainStr = Character.toString(mainStr.charAt(Integer.parseInt(resArr[1])));
                } catch (Exception e) {
                    mainStr = "";
                }
                break;
            case 4:
                indexMod--;
                if (indexMod < 0) {
                    indexMod = 0;
                }
                mainStr = mainStrMod.get(indexMod);
                countUndo++;
                break;
            case 5:
                indexMod++;
                if (indexMod > (mainStrMod.size() - 1)) {
                    indexMod = mainStrMod.size() - 1;
                }
                mainStr = mainStrMod.get(indexMod);
                break;
            default:
                return mainStr;
        }
        return mainStr;
    }
}