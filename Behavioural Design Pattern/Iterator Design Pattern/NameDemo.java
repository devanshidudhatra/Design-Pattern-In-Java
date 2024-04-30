import java.util.*;

interface Iterator {
    public boolean hasNext();
    public Object next();
}

interface Container{
    public Iterator getIterator();
}

class NameRepository implements Container{
    String names[];
    public NameRepository(String names[]){
        this.names = names;
    }
    
    public Iterator getIterator(){
        return new NameIterator();
    }

    class NameIterator implements Iterator{
        int index = 0;

        public boolean hasNext(){
            return index < names.length;
        }

        public Object next(){
            return names[index++];
        }
    }
}

class NameDemo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of names : ");
        int numNames = s.nextInt();
        s.nextLine();

        String names[] = new String[numNames];
        for(int i=0 ; i<numNames ; i++){
            System.out.println("Enter name "+(i+1)+" : ");
            names[i] = s.nextLine();
        }
        NameRepository nameRepository = new NameRepository(names);

        for(Iterator itr = nameRepository.getIterator() ; itr.hasNext();){
            String name = (String) itr.next();
            System.out.println("Name : " + name); 
        }
    }
}