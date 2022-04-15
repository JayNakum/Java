interface List {
    public void addItem(Object o);

    public String getItem(int position);

    public void deleteItem(int position);

    public void deleteItem(String item);

    public int getPosition(String item);

    public int length();
}

class ConcreteList implements List {

    public String myList;

    public ConcreteList() {
        myList = null;
    }

    @Override
    public void addItem(Object o) {
        if (myList == null) {
            myList = o.toString();
        } else {
            myList += "," + o.toString();
        }
    }

    @Override
    public String getItem(int position) {
        position -= 1;
        String item;
        if (this.length() == 0) {
            item = null;
            System.out.println("List is Empty");
        } else {
            int i = 0;
            int c = 0;
            for (i = 1; i < myList.length(); i++) {
                if (myList.charAt(i) == ',') {
                    c++;
                    if (c == position) {
                        i++;
                        break;
                    }
                }
            }
            item = "";
            while (i < myList.length()) {
                if (myList.charAt(i) == ',') {
                    break;
                }
                item += myList.charAt(i);
                i++;
            }
        }
        return item;
    }

    @Override
    public void deleteItem(int position) {
        if (this.length() == 0) {
            System.out.println("List is Empty");
        } else {
            int i = 0;
            int c = 0;
            for (i = 0; i < myList.length(); i++) {
                if (myList.charAt(i) == ',') {
                    c++;
                    if (c == position) {
                        i++;
                        break;
                    }
                }
            }
            // TODO: Code for deleting a substring from i to ',' || myList.length()
        }
    }

    @Override
    public void deleteItem(String item) {
        if (this.length() == 0) {
            System.out.println("List is Empty");
        } else {
            int startIndex = -1;
            int i = 0;
            String eachItem = "";
            for(i = 0 ; i < myList.length() ; i++) {
                if (myList.charAt(i) == ',' || i == myList.length()) {
                    if(eachItem == item) {
                        startIndex = i - eachItem.length();
                        break;
                    } else {
                        eachItem = "";
                    }
                }
                eachItem += myList.charAt(i);
            }
            // TODO: Code for deleting a substring from startIndex to ',' || myList.length()
        }
    }

    @Override
    public int getPosition(String item) {
        // TODO: Code to find a substring and return index - substring.length()
        return 0;
    }

    @Override
    public int length() {
        if (myList == null) {
            return 0;
        } else {
            int count = 1;
            for (int i = 0; i < myList.length(); i++) {
                if (myList.charAt(i) == ',') {
                    count++;
                }
            }
            System.out.println("Length = " + count);
            return count;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // new ConcreteList();
    }
}