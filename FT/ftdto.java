package FT;

public class ftdto implements Comparable<ftdto> {

    private String serialNumber;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }



    public ftdto(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int compareTo(ftdto ftdto) {
        String s1 = ftdto.getSerialNumber();
        String s2 = this.serialNumber;
        String s1Alpha = s1.replaceAll("[\\d]", "");
        String s2Alpha = s2.replaceAll("[\\d]", "");

        int s1Num = Integer.parseInt(s1.replaceAll("[^\\d]", ""));
        int s2Num = Integer.parseInt(s2.replaceAll("[^\\d]", ""));

        System.out.println("s1Num: "+s1Num+" , s1Alpha:"+s1Alpha);
        System.out.println("s2Num: "+s2Num+" , s2Alpha:"+s2Alpha);

        if (s1Alpha.length() == s1Alpha.length() )
        {
            System.out.println((s1.compareTo(s2) * -1)+ " if<<<<<<<<<<<<<<<<<<");
            return (s1.compareTo(s2) * -1);
        } else {
            System.out.println((s1Num - s2Num) * -1+ " else<<<<<<<<<<<<<<<<<<<<");
            return (s1Num - s2Num) * -1;
        }

//        if (s1Num == s2Num) {
//            return (s1.compareTo(s2) * -1);
//        } else {
//            return (s1Num - s2Num) * -1;
//        }
    }
}
