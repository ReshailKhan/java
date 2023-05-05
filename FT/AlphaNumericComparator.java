package FT;

import FT.ftdto;

import java.util.Comparator;

public class AlphaNumericComparator implements Comparator<ftdto> {

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public int compare(ftdto l1, ftdto l2) {
        String[] parts1 = l1.getSerialNumber().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String[] parts2 = l2.getSerialNumber().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        int i = 0;
        while (i < parts1.length && i < parts2.length) {
            if (parts1[i].compareTo(parts2[i]) != 0) {
                if (isNumeric(parts1[i]) && isNumeric(parts2[i])) {
                    return Integer.compare(Integer.parseInt(parts1[i]), Integer.parseInt(parts2[i]));
                } else {
                    return parts1[i].compareTo(parts2[i]);
                }
            }
            i++;
        }
        return parts1.length - parts2.length;
    }
}
