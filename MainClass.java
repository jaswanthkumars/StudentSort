import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Set<Student> set=new HashSet();
        set.add(new Student("jaswanth",101,1110,18));
        set.add(new Student("amit",101,920,18));
        set.add(new Student("krishna",103,1097,19));
        set.add(new Student("madhusudhan",105,1189,20));
        set.add(new Student("vishwas",102,1010,17));
      String sort="y";
      ArrayList<Student> arrayList1=new ArrayList<>(set);
        do{
            System.out.println("Enter 1 to sort by age");
            System.out.println("Enter 2 to sort by Id");
            System.out.println("Enter 3 to sort by Marks");
            System.out.println("Enter 4 to sort by Name");
            System.out.println("Enter any number rather than the number given above to sort by age");
            Scanner scanner=new Scanner(System.in);
            int number=scanner.nextInt();
            switch (number) {
                case 1:
                    Collections.sort(arrayList1, new AgeWiseSort());
                    System.out.println(arrayList1);
                    break;
                case 2:
                    Collections.sort(arrayList1, new IdWiseSort());
                    System.out.println(arrayList1);
                    break;
                case 3:
                    Collections.sort(arrayList1, new MarksWiseSort());
                    System.out.println(arrayList1);
                    break;
                case 4:
                    Collections.sort(arrayList1, new NameWiseSort());
                    System.out.println(arrayList1);
                    break;
                default:
                    System.out.println("Enter valid Sorting Number given in the menu");
                    break;
            }
            System.out.println("If u  want to re run the sorting press y......or if u dont press n");
            sort=scanner.next();
        }
        while (sort.equalsIgnoreCase("y"));
}}