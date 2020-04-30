//package collections;
//
//public class CollectionsMEthods {
//    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<>(10);
//        //addAll method
//        Collections.addAll(fruits,"plum","pomogranate","apple","bana","pear");
//        Iterator<String> listIter = fruits.iterator();
//        while(listIter.hasNext()){
//            System.out.println(listIter.next());
//​
//        }
//        //sort Method
//        List<Integer> numbers = new LinkedList<Integer>();
//        Random rand = new Random();
//        for (int i=0 ; i<50 ; i++){
//            numbers.add(rand.nextInt(1000));
//        }
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);
//        Collections.sort(numbers,Comparator.reverseOrder());
//        System.out.println(numbers);
//        Iterator<Integer> iter = numbers.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        //copy method
//​
//        List<Integer> newList = new LinkedList<Integer>();
//        for(int i =0 ; i<50 ; i++){
//            newList.add(i);
//        }
//        try {
//            Collections.copy(newList,numbers);
//        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("oops");
//        }
//        System.out.println(newList);
//​
//        //fill method
//        Collections.fill(newList,5);
//        System.out.println(newList);
//        //frequency
//        int freq=Collections.frequency(newList,5);
//        System.out.println(freq);
//        //max
//        System.out.println(Collections.max(numbers));
//​
//​
//    }
//
//}
