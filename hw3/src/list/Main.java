package list;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void print(LinkedHashMap<Integer, String> months, HashMap<Integer, String> map2){
        System.out.println("Map1:\n"+months.entrySet());
        System.out.println("Map2:\n"+map2.entrySet());
    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1 = Stream.of("Apple", "Banana", "Peach").collect(Collectors.toList());
        System.out.println("List 1:");
        System.out.println(list1);

        List<String> list2 = list1;
        System.out.println("List 2:");
        System.out.println(list2);

        String[] fruits = {"Orange","Pineapple","Watermelon"};
        List<String> list3 = Arrays.asList(fruits);
        System.out.println("List 3:");
        System.out.println(list3);

        for(int i = 0; i<list3.size(); i++){
            list2.add(list3.get(i));
        }
        System.out.println("Modified list 2:");
        System.out.println(list2);

        Comparator<String> comparator = new StringSort();

        for(int i = 0; i< list2.size(); i++){
            for(int j = i + 1; j < list2.size(); j++){
                if(comparator.compare(list2.get(i),list2.get(j)) == -1){
                    String k = list2.get(i);
                    String k_j = list2.get(j);
                    list2.remove(i);
                    list2.add(i,k_j);
                    list2.remove(j);
                    list2.add(j,k);
                }
            }
        }
        System.out.println("Sorted list 2:");
        System.out.println(list2);

        List<String> fruits2 = new LinkedList<>();
        fruits2 = list2;
        System.out.println("Fruits2 list:");
        System.out.println(fruits2);
        ListIterator<String> iterator = fruits2.listIterator();
        int i = 1;
        while(iterator.hasNext()){
            if(i%2 == 0){
                iterator.next();
                iterator.remove();
            }
            else if(i%2 != 0){
                iterator.next();
            }
            i+=1;
        }
        System.out.println("Modified fruits2 list:");
        System.out.println(fruits2);

        //Set
        Set<String> set1 = new HashSet<String>();
        set1.add("Ukraine");
        set1.add("Spain");
        System.out.println("\nSet1:");
        System.out.println(set1);
        for(int u = 0; u<list1.size(); u++){
            set1.add(list1.get(u));
        }
        for(int u = 0; u<list2.size(); u++){
            set1.add(list2.get(u));
        }
        System.out.println("Modified set1:");
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<String>();
        for(int u = 0; u<list2.size(); u++){
            set2.add(list2.get(u));
        }
        for(int u = 0; u<list3.size(); u++){
            set2.add(list3.get(u));
        }
        System.out.println("Set2:");
        System.out.println(set2);

        //Map
        LinkedHashMap<Integer, String> months = new LinkedHashMap<>();
        months.put(0, "January");
        months.put(1, "February");
        months.put(2, "March");
        months.put(3, "April");
        months.put(4, "May");
        months.put(5, "June");
        months.put(6, "July");
        months.put(7, "August");
        months.put(8, "September");
        months.put(9, "October");
        months.put(10, "November");
        months.put(11, "December");
        System.out.println("\nMap:");
        System.out.println(months);

        System.out.println("The first and the last months:");
        System.out.println(months.get(0) + " " + months.get(11));

        months.replace(6, "ОТПУСК");
        System.out.println("Modified map:");
        System.out.println(months);

        Iterator<String> month = months.values().iterator();
        HashMap<Integer, String> map2 = new HashMap<>();
        for(int t = 0; month.hasNext(); t++){
            map2.put(t, month.next());
        }
        System.out.println("Map2:");
        System.out.println(map2);

        print(months, map2);

        Map<String, Set<String>> student = new HashMap<>(){};
        Set<String> setStudent = new HashSet<String>();
        setStudent.add("0975653343");
        setStudent.add("user@gmail.com");
        setStudent.add("user123");
        student.put("Oleg", setStudent);
        System.out.println("\nStudent map:");
        System.out.println(student);

        HashSet<User> user = new HashSet<>();
        User user1 = new User("Anne", 19, "0984464338");
        User user2 = new User("Anne", 19, "0984464338");
        User user3 = new User("Anne", 27, "0984464338");
        user.add(user1);
        user.add(user2);
        user.add(user3);
        System.out.println("\nUser HashSet:");
        for (User current: user) {
            System.out.println(current);
        }
    }
}
