package day6;

public class SearchName {
    public static void main(String[] args) {
        String[] names = {"ABC", "XYZ", "LION"};
        String nameToSearch = "XYZ";

        for (int i=0; i<names.length; i++) {
            if(names[i].equals(nameToSearch)) {
                System.out.println(nameToSearch + " exists in the array");
                return;
            }
        }
        System.out.println(nameToSearch + " does not exist in the array");
    }
}
