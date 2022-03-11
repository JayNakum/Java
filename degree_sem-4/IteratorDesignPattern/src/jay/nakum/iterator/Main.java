package jay.nakum.iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        NameRepository nameRepo = new NameRepository();
        
        for(Iterator iter = nameRepo.getIterator(); iter.hasNext();){
            System.out.println("Name: " + (String)iter.next());
        }
    }
}
