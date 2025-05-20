//Task 7
public class CellPhone {
    String model = "Unknown";
    int stored = 0;
    String[] contactStored = new String[3];
    public void printDetails(){
        System.out.println("Phone Model "+ model);
        System.out.println("Contacts Stored "+ stored);
        if(stored>0){
            for (int i = 0; i < contactStored.length; i++) {
                System.out.println(contactStored[i]);
            }
        }
    }
    public void storeContact(String str){
        if(stored<3){
            contactStored[stored]= str;
            stored++;
            System.out.println("Contact Stored");
        }
        else{
            System.out.println("Memory full. New contact can't be stored.");
        }
    }
}
